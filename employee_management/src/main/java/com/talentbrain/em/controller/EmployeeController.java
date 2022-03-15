package com.talentbrain.em.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.talentbrain.em.entity.Employee;
import com.talentbrain.em.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/getEmployee")
	public List<Employee> getEmployeeList(){
		return employeeService.getEmployeeList();	
	}
	
	@RequestMapping("/getEmployeeById")
	public Optional<Employee> getEmployeeById(@RequestParam Long empId){
		return employeeService.getEmployeeById(empId);	
	}

	@RequestMapping("/createEmployee")
	public String createEmployee(@RequestBody Employee employee){
		System.out.println("Inside controll for creating employee");
		employeeService.createEmployee(employee);
		return "<h1>Epmloyee created successfully</h1>";	
	}
	
	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam Long empId){
		System.out.println("Inside controll for deleting employee");
		employeeService.deleteEmployee(empId);
		return "<h1>Epmloyee deleted successfully</h1>";	
	}

}
