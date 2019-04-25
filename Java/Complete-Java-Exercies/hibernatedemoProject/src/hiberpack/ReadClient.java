package hiberpack;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadClient {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		UserPojo user = (UserPojo) session.get(UserPojo.class, 102);
//		Set<Address> adr = user.getAddress();
		System.out.println(user.getUname() + " : " + user.getUpass() );
	}
}
