package daopack;

import java.util.Iterator;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		
		DAO dao = new EmployeeServiceDAOImpl();
		EmployeePojo emp = new EmployeePojo();
		emp.setEid(1);
		emp.setEname("Gladstone");
		emp.setSalary(4000);
		EmployeePojo emp1 = new EmployeePojo();
		emp1.setEid(2);
		emp1.setEname("Abraham");
		emp1.setSalary(2000);
		dao.saveObject(emp);
		dao.saveObject(emp1);
//		session.save(emp);
//		session.save(emp1);
//		session.beginTransaction().commit();
//		EmployeeServiceImpl impl = new EmployeeServiceImpl();
//		impl.setDao(dao);
//		System.out.println(dao.getSalary(1));
		List<EmployeePojo> employees = dao.findAllEmployees();
		Iterator<EmployeePojo> iter = employees.iterator();
		while(iter.hasNext()) {
			EmployeePojo e = iter.next();
			System.out.println("Ename :" + e.getEname());
		}
	}
}
