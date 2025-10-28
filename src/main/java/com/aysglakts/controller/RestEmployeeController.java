package com.aysglakts.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aysglakts.model.Employee;
import com.aysglakts.services.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/rest/api")


public class RestEmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	
	
	
	@GetMapping("/employee-list")
public List<Employee> getAllEmployees(){
		 return employeeService.getAllEmployeeList();
		
	
}


}
