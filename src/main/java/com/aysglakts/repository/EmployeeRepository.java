package com.aysglakts.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.aysglakts.model.Employee;


import lombok.Getter;

@Repository
public class EmployeeRepository
{
	@Autowired
	public List<Employee> employeList;
	
public List<Employee> getAllEmployeeList() {
return employeList;

}
public Employee getAllEmployeeById(int id) {
	Employee findEmployee=null;
	
	for (Employee employee: employeList)
	{
		if (id==employee.getId())
		{
			
			findEmployee=employee;
			break;
		
			
		}
	}
	return findEmployee;
	
}


public List<Employee> getEmployeeWithParams(String firstName,String lastName)
{
List<Employee> employeeWithParams=new ArrayList<>();
for (Employee employee :employeList) 
{
	if (firstName!=null && lastName !=null) 
	{
		if (employee.getFirstName().equalsIgnoreCase(firstName)
			&& employee.getLastName().equalsIgnoreCase(lastName)){
				employeeWithParams.add(employee);
			}
		}
	
if (firstName!=null && lastName == null) 
{
	if (employee.getFirstName().equalsIgnoreCase(firstName)){
			employeeWithParams.add(employee);
		}
	}


if (firstName==null && lastName != null) 
{
	if (employee.getLastName().equalsIgnoreCase(lastName)){
			employeeWithParams.add(employee);
		}
	}
}return employeeWithParams;


}

}


	




