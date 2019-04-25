package hiberpack;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserClient {
	public static void main(String[] args) {
		UserPojo user1 = new UserPojo();
		user1.setUid(103);
		user1.setUname("hari");
		user1.setUpass("hari");
		user1.setStatus(0);
		
		UserPojo user2 = new UserPojo();
		user2.setUid(104);
		user2.setUname("name");
		user2.setUpass("pass");
		user2.setStatus(0);
		
		Set<UserPojo> users = new HashSet<UserPojo>();
		users.add(user1);
		users.add(user2);
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Address addr1  =new Address();
		addr1.setCity("madurai");
		addr1.setId(3);
		addr1.setStreet("south gate");
		addr1.setUser(user1);
		
		Address addr2  =new Address();
		addr2.setCity("chennai");
		addr2.setId(4);
		addr2.setStreet("kamarajar street");
		addr2.setUser(user1);
		
		Set<Address> address = new HashSet<Address>();
		address.add(addr1);
		address.add(addr2);
		
		Training training1 = new Training();
		training1.setTid(3);
		training1.setSubject("English");
		training1.setTname("Initial");
		training1.setUsers(users);
		
		Training training2 = new Training();
		training2.setTid(4);
		training2.setSubject("Tamil");
		training2.setTname("Final");
		training2.setUsers(users);
		
		Set<Training> trainings = new HashSet<Training>();
		trainings.add(training1);
		trainings.add(training2);
		
		user1.setAddress(address);
		user1.setTrainings(trainings);
		user2.setTrainings(trainings);
		
		
		session.save(user1);
		session.save(user2);
		session.beginTransaction().commit();
		session.close();
	}
}
