package one2manypack;


import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	 private static final SessionFactory sessionFactory;

	    static {
	        try {
	            // Create the SessionFactory from hibernate.cfg.xml
	        	Configuration con=new Configuration().configure("hibernate.anno.cfg.xml");
//	        	con.setProperty("net.sf.ehcache.configurationResourceName", "D:/workspace/hiberfss/hiberproj/bin/ehcache.xml");
	            sessionFactory= con.buildSessionFactory();
	        } catch (Throwable ex) {
	            // Make sure you log the exception, as it might be swallowed
	            System.err.println("Initial SessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	    public static final ThreadLocal  localthread=new ThreadLocal();
	    public static Session currentSession() throws HibernateException
	    {
	    	Session s=(Session)localthread.get();
	    	if(s==null){
	    		s=sessionFactory.openSession();
	    		localthread.set(s);
	    	}
	    	return s;
	    }
	    public static org.hibernate.classic.Session currentClassicSession()throws HibernateException
	    {
	    	org.hibernate.classic.Session 
	    		s=(org.hibernate.classic.Session)localthread.get();
	    	if(s==null){
	    		s=sessionFactory.openSession();
	    		localthread.set(s);
	    	}
	    	return s;
	    }
	    public static void closeSession()throws HibernateException
	    {
	    	Session s=(Session)localthread.get();
	    	localthread.set(null);
	    	if(s!=null)
	    	{
	    		s.close();
	    	}
	    }
  
}


