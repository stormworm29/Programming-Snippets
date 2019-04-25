package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Employee;

public abstract class EmployeeDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	public abstract void addEmployee(Employee e);
	public abstract Employee viewEmployee(int id);
	public abstract int viewSalary(int id);
	public abstract void updateEmployee(Employee e);
	
}
