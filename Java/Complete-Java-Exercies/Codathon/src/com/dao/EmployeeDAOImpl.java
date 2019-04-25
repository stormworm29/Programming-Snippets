package com.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Property;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository("employeeDao")
public class EmployeeDAOImpl extends EmployeeDAO{
	@Override
	public void addEmployee(Employee e) {
		getSession().persist(e);
	}

	@Override
	public Employee viewEmployee(int id) {
		Criteria criteria = getSession().createCriteria(Employee.class);
		criteria.add(Property.forName("id").eq(id));
		return (Employee) criteria.uniqueResult();
	}

	@Override
	public int viewSalary(int id) {
		Employee e = viewEmployee(id);
		return e.getSalary();
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		Employee entity = viewEmployee(employee.getId());
        if(entity!=null){
        	entity.setId(employee.getId());
            entity.setName(employee.getName());
            entity.setSalary(employee.getSalary());
        }
		
	}

}
