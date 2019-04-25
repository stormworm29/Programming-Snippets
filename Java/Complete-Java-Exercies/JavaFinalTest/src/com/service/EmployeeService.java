package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {

	Employee findEmployeeById(int id);
	void saveEmployee(Employee e);
	void updateEmployee(Employee employee);
	void deleteEmployee(String ssn);
	List<Employee> findAllEmployees();
	Employee findEmployeeBySsn(String ssn);
	boolean isEmployeeSsnUnique(Integer id, String ssn);
}
