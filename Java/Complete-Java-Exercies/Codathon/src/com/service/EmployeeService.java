package com.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDAO;
import com.model.Employee;

public abstract class EmployeeService {
	@Autowired
	EmployeeDAO dao;
	public abstract void addEmployee(Employee e);
	public abstract Employee viewEmployee(int id);
	public abstract int viewSalary(int id);
	public abstract void updateEmployee(Employee e);
	public abstract List<Employee> findAllEmployees();
	
}
