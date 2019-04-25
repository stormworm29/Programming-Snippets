package one2manypack;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Client {
	public static void main(String[] args)throws Exception {
		//SessionFactory fac=new Configuration().configure().buildSessionFactory();
		
		SessionFactory factory = 
			new AnnotationConfiguration().
			configure("hibernate.anno.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Employee emp=new Employee();
		emp.setEname("ramu");
		emp.setEsalary(1000);
		
		Employee emp1=new Employee();
		emp1.setEname("somu");
		emp1.setEsalary(2000);
		
		
		Training train = new Training();
		Collection<Employee> empcol = new HashSet<Employee>();
		empcol.add(emp);
		empcol.add(emp1);
		
		train.employees = empcol;
		
		Address add1=new Address();
		add1.setCity("raja raja street");
		add1.setEmployee(emp);
		
		Address add2=new Address();
		add2.setCity("rani rani street");
		add2.setEmployee(emp);
		
		Set set=new HashSet();
		set.add(add1);
		set.add(add2);
		
		emp.setAddresses(set);
		
		session.save(add1);
		session.save(add2);
		session.save(emp);
		session.save(emp1);
		session.save(train);
		
//		emp=(Employee)session.get(Employee.class,new Integer(1));
//		Collection col=emp.getAddresses();
//		Iterator iter=col.iterator();
//		while(iter.hasNext())
//		{
//			Address add=(Address)iter.next();
//			System.out.println(add.street);
//		}
		tx.commit();
		
	}
}