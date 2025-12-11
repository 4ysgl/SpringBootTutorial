package com.aysglakts.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aysglakts.model.Employee;
import com.aysglakts.repository.EmployeeRepository;

@Service
public class EmployeeService 

{
	
	@Autowired    // 
	EmployeeRepository employeeRepository;
	
	
public List<Employee> getAllEmployeeList()
{
	return employeeRepository.getAllEmployeeList();
	
	
	
	
}
public Employee getEmployeeById(int id)
{
	return employeeRepository.getAllEmployeeById(id);
}
//
public List<Employee> getEmployeeWithParams(String firstName,String lastName) {
	return employeeRepository.getEmployeeWithParams(firstName, lastName);
	
}
}
