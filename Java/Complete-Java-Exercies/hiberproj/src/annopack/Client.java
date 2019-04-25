package annopack;

import java.sql.Date;

import org.hibernate.Session;

public class Client {
	public static void main(String[] args) {
//		AnnoEmployee emp = new AnnoEmployee();
//		Session session  = HibernateUtility.currentSession();
//		emp.setEid(1);
//		emp.setEname("Gladstone");
//		emp.setJoiningDate(new Date(2019, 11, 20));
//		emp.setSalary(1278984);
//		session.save(emp);
//		session.beginTransaction().commit();
//		HibernateUtility.closeConn();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Session session = HibernateUtility.currentSession();
				AnnoEmployee emp = (AnnoEmployee)session.get(AnnoEmployee.class, new Integer(1));
				System.out.println("child process .. " + session);
			}
		}).start();
		Session session = HibernateUtility.currentSession();
		System.out.println("main thread process .. " + session);
		
	}
}
