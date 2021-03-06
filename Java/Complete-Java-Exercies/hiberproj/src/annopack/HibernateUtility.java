package annopack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	private HibernateUtility() {
		// TODO Auto-generated constructor stub
	}
	private static final ThreadLocal<Session> tlocal = new ThreadLocal<Session>();
	private static SessionFactory factory;
	static {
		Configuration cfg = new Configuration().configure("hibernate.anno.cfg.xml");
		factory = cfg.buildSessionFactory();
	}
	synchronized public static Session currentSession() {
		Session session = tlocal.get();
		if(session == null) {
			session = factory.openSession();
			tlocal.set(session);
			return session;
		}
		else {
			return session;
		}
	}
	synchronized public static void closeConn() {
		Session session = tlocal.get();
		if(session != null) {
			session.close();
			tlocal.remove();
		}
	}
}
