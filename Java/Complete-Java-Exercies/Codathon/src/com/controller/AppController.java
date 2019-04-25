package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Employee;
import com.service.EmployeeService;

@Controller
@RequestMapping("/")
@ComponentScan("com")
public class AppController {
	@Autowired
	EmployeeService service;
	@Autowired
    MessageSource messageSource;
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String viewEmployee(ModelMap map) {
		List<Employee> employees = service.findAllEmployees();
		map.addAttribute("employees",employees);
		Employee emp = new Employee();
		map.addAttribute("employee", emp);
		return "index";
	}
	@RequestMapping(value = { "/view" }, method = RequestMethod.POST)
	public String viewEmployeeById(int id,ModelMap map) {
		Employee emp = service.viewEmployee(id);
		map.addAttribute("employee", emp);
		map.addAttribute("success", "Employee Id :" + emp.getId() +"; Employee Name : " + emp.getName() + "; Employee Salary :" + emp.getSalary());
		return "displayemp";
	}
	@RequestMapping(value = { "/" }, method = RequestMethod.POST)
	public String saveEmployee(@Valid Employee employee, BindingResult result,
            ModelMap model) {
		service.addEmployee(employee);
		 
        model.addAttribute("success", "Employee " + employee.getName() + " registered successfully");
        return "success";
	}
	@RequestMapping(value = { "/update" }, method = RequestMethod.POST)
	public String updateEmployeeById(int id,
            ModelMap map) {
		Employee emp = service.viewEmployee(id);
		map.addAttribute("employee", emp);
		 
        return "updateemp";
	}
	
	@RequestMapping(value = { "/updateemp" }, method = RequestMethod.POST)
	public String updateEmployee(@Valid Employee employee, BindingResult result,
            ModelMap model) {
		service.updateEmployee(employee);
		 
        model.addAttribute("success", "Employee " + employee.getName() + " updated successfully");
        return "success";
	}

}
