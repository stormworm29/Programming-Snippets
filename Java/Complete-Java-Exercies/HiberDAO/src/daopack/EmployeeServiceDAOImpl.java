package daopack;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Property;

public class EmployeeServiceDAOImpl extends ServiceDAO{
	Criteria criteria;
	Session session;
	public EmployeeServiceDAOImpl() {
		 session = HibernateUtility.getCurrentSession(); 
		 criteria = session.createCriteria(EmployeePojo.class);
	}
	@Override
	public EmployeePojo findEmployee(int id) {
		criteria.add(Property.forName("eid").eq(id));
		EmployeePojo emp = (EmployeePojo) criteria.uniqueResult();
		return emp;
	}

	@Override
	public List<EmployeePojo> findAllEmployees() {
		return (List<EmployeePojo>)criteria.list();
	}

	@Override
	public float getSalary(int id) {
		criteria.add(Property.forName("eid").eq(id));
		EmployeePojo emp = (EmployeePojo) criteria.uniqueResult();
		return emp.getSalary();
	}

	@Override
	public void updateEmployee(EmployeePojo e) {
		getSession().update(e);
	}
}
