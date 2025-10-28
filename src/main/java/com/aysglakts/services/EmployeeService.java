package com.aysglakts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aysglakts.model.Employee;
import com.aysglakts.repository.EmployeeRepository;

@Service
public class EmployeeService 

{
	
	@Autowired    // contex içindeki employerepostiye eriştik
	EmployeeRepository employeeRepository;
	
	
public List<Employee> getAllEmployeeList()
{
	return employeeRepository.getAllEmployeeList();
	
	
	
}
}
