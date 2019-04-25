package pojopack;

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
	
	CompKey ck=new CompKey();
	ck.setPid(100);ck.setSid(200);
	
	Test test=(Test)session.get(Test.class, ck);
	Records r=test.getRecords();
	System.out.println(r);
	
	
}
}
