package daopackage;

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
		System.out.println(dao.getSalary(1));
		List<EmployeePojo> employees = dao.findAllEmployees();
		Iterator<EmployeePojo> iter = employees.iterator();
		while(iter.hasNext()) {
			EmployeePojo e = iter.next();
			System.out.println("Ename :" + e.getEname());
		}
		EmployeePojo e3 = dao.findEmployee(2);
		System.out.println("Ename : " + e3.getEname());
		
	}
}
