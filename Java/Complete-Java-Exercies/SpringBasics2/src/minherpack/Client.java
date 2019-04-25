package minherpack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Client {
public static void main(String[] args) {
	SessionFactory factory = 
		new AnnotationConfiguration().configure("hibernate.anno.cfg.xml").buildSessionFactory();
	
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();

	Car car=new Car();
	car.setAutofeature("aaaaaaaaaaaaaaaaaaaa");
	car.setCarfeatures("ccccccccccccccccccccc");
	
	
	Maruti maruti=new Maruti();
	maruti.setAutofeature("auto features...");
	maruti.setCarfeatures("car features....");
	maruti.setMarutifeatures("maruti features....");
	
	Automobile a = new Automobile();
	
	session.save(maruti);
	session.save(car);
	session.save(a);
	tx.commit();
	Query q=session.createQuery("select a from auto a");
	List l=q.list();
//	System.out.println(l);
	Iterator i=l.iterator();
	while(i.hasNext())
	{
		Automobile obj = (Automobile)i.next();
		obj.handle();
	}	
}
public void display()
{
//select r from Automobile a	
}

}
