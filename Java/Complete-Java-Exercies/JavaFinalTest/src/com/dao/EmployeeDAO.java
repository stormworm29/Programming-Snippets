package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDAO {
	Employee findEmployeeById(int id);
	void saveEmployee(Employee e);
	
	void deleteEmployee(String ssn);
	List<Employee> findAllEmployees();
	Employee findEmployeeBySsn(String ssn);
	
}
