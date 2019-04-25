package single;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadClient {
public static void main(String[] args)throws Exception {
	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	Session session=factory.openSession();
	
	
	UserPojo user=(UserPojo)session.get(UserPojo.class, 100);
	
	System.out.println(user.getUname()+":"+user.getUpass());
	
	Set<Address> add=user.getAddresses();
	Iterator<Address> iter=add.iterator();
	
	
	
	
}
}
