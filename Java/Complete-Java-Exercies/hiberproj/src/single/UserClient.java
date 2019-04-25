package single;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserClient {
public static void main(String[] args) {
	UserPojo upojo=new UserPojo();
	upojo.setFlag(0);
	upojo.setUname("ramesh");
	upojo.setUpass("turtle");
	upojo.setUserid(200);
	
//	Address add1=new Address();
//	add1.setAid(1);
//	add1.setCity("chennai");
//	add1.setStreet("mgr street");
//	add1.setUser(upojo);
	
//	Address add2=new Address();
//	add2.setAid(2);
//	add2.setCity("banglore");
//	add2.setStreet("gandhiji street");
//	add2.setUser(upojo);
//	
//	Set<Address> addresset=new HashSet<Address>();
//	addresset.add(add1);
//	addresset.add(add2);
//	upojo.setAddresses(addresset);
	
	TrainingPojo t1=new TrainingPojo();
	t1.setTid(1000);
	t1.setTname("java");
	
	TrainingPojo t2=new TrainingPojo();
	t2.setTid(2000);
	t2.setTname("java j2ee");
	
	Set<TrainingPojo> trainingset=new HashSet<TrainingPojo>();
	trainingset.add(t1);
	trainingset.add(t2);
	
	upojo.setTrainings(trainingset);
	
	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	Session session=factory.openSession();
	
	session.save(upojo);
	session.save(t1);
	session.save(t2);
	
	session.beginTransaction().commit();
	
	
	
}
}
