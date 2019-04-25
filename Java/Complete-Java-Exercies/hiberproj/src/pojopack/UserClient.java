package pojopack;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserClient {
public static void main(String[] args) {
	
	Test obj=new Test();
	CompKey ck=new CompKey();
	ck.setPid(100);ck.setSid(200);
	obj.setCkey(ck);
	
	obj.setTname("hello world");

	Records rec=new Records("hello world..");
	
	obj.setRecords(rec);
	
	
	
	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	Session session=factory.openSession();
	session.save(obj)	;
	session.beginTransaction().commit();
	
	
	
}
}
