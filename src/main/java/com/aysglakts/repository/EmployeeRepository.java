package com.aysglakts.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.aysglakts.model.Employee;

@Repository
public class EmployeeRepository
{
	@Autowired
	public List<Employee> employeList;
	
public List<Employee> getAllEmployeeList() {
return employeList;
}
}
