package com.service;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl extends EmployeeService{

	@Override
	public void addEmployee(Employee e) {
		dao.addEmployee(e);
	}

	@Override
	public Employee viewEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.viewEmployee(id);
	}

	@Override
	public int viewSalary(int id) {
		// TODO Auto-generated method stub
		return dao.viewSalary(id);
	}

	@Override
	public void updateEmployee(Employee e) {
		dao.updateEmployee(e);
		
	}
	public List<Employee> findAllEmployees() {
		Criteria criteria = dao.getSession().createCriteria(Employee.class);
		return (List<Employee>) criteria.list();
	}
	
}
