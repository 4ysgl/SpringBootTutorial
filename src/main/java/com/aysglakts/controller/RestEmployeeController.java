package com.aysglakts.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aysglakts.model.Employee;
import com.aysglakts.services.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/rest/api/employee")


public class RestEmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	
	
	
	@GetMapping("/list")
public List<Employee> getAllEmployees(){
		 return employeeService.getAllEmployeeList();
		
	
	
}
@GetMapping("/list/{id}")
public Employee getEmployeeById(@PathVariable int id)
{
return employeeService.getEmployeeById(id);

}
@GetMapping("/with-params")
public List<Employee> getEmployeeWithParams(@RequestParam (name = "firstName",required = false)String firstName,
		@RequestParam(name = "lastName",required = false)String lastName)
{

	return employeeService.getEmployeeWithParams(firstName, lastName);


}}
