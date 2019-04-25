package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeeDAO;
import com.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO dao;
	@Override
	public Employee findEmployeeById(int id) {
		return dao.findEmployeeById(id);
	}

	@Override
	public void saveEmployee(Employee e) {
		dao.saveEmployee(e);
	}

	@Override
	public void updateEmployee(Employee employee) {
		Employee entity = dao.findEmployeeById(employee.getId());
        if(entity!=null){
        	entity.setId(employee.getId());
            entity.setName(employee.getName());
            entity.setJoiningDate(employee.getJoiningDate());
            entity.setSalary(employee.getSalary());
            entity.setSsn(employee.getSsn());
        }
		
	}

	@Override
	public void deleteEmployee(String ssn) {
		dao.deleteEmployee(ssn);
		
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return dao.findAllEmployees();
	}

	@Override
	public Employee findEmployeeBySsn(String ssn) {
		// TODO Auto-generated method stub
		return dao.findEmployeeBySsn(ssn);
	}

	@Override
	public boolean isEmployeeSsnUnique(Integer id, String ssn) {
		Employee employee = findEmployeeBySsn(ssn);
        return ( employee == null || ((id != null) && (employee.getId() == id))); 
	}

}
