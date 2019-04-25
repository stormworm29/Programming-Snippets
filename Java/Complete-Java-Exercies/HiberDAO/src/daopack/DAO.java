package daopack;

import java.util.List;

import org.hibernate.Session;

public abstract class DAO {
	private Session session = HibernateUtility.getCurrentSession();
	public abstract EmployeePojo findEmployee(int id);
	public abstract void deleteObject(Object o);
	public abstract List<EmployeePojo> findAllEmployees();
	public abstract float getSalary(int id);
	public abstract void saveObject(Object o);
	public abstract void updateEmployee(EmployeePojo e);
	public Session getSession() {
		return session;
	}
}
