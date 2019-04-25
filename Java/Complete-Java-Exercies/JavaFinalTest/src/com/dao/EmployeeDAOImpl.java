package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Property;
import org.springframework.stereotype.Repository;

import com.model.Employee;


@Repository("employeeDao")
public class EmployeeDAOImpl extends AbstractDAO<Integer, Employee> implements EmployeeDAO{

	@Override
	public Employee findEmployeeById(int id) {
		return getByKey(id);
	}

	@Override
	public void saveEmployee(Employee e) {
		persist(e);
		
	}

	@Override
	public void deleteEmployee(String ssn) {
		Query query = getSession().createQuery("delete from Employee where ssn = :ssn");
		query.setString("ssn", ssn);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAllEmployees() {
		Criteria criteria = createEntityCriteria();
		return (List<Employee>) criteria.list();
	}

	@Override
	public Employee findEmployeeBySsn(String ssn) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Property.forName("ssn").eq(ssn));
		return (Employee) criteria.uniqueResult();
	}

}
