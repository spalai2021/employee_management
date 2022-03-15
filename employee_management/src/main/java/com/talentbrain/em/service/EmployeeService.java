package com.talentbrain.em.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talentbrain.em.entity.Employee;
import com.talentbrain.em.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getEmployeeList() {
		
		return employeeRepository.findAll();
	}

	public Optional<Employee> getEmployeeById(Long empId) {
		
		return employeeRepository.findById(empId);
	}

	public void createEmployee(Employee employee) {
		System.out.println("Inside Save method of Service");
		employeeRepository.save(employee);
		
	}

	public void deleteEmployee(Long empId) {
		System.out.println("Inside delete method of Service");
		employeeRepository.deleteById(empId);
		
	}

}
