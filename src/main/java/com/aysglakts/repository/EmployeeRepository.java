package com.aysglakts.repository;


import java.awt.color.ICC_ColorSpace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.aysglakts.model.Employee;
import com.aysglakts.model.UpdateEmployee;

@Repository
public class EmployeeRepository {

    private final List<Employee> employeList;
        
    public EmployeeRepository(List<Employee> employeList) {
        this.employeList = employeList;
    }

    public List<Employee> getAllEmployeeList() {
        return employeList;
    }

    public Employee getAllEmployeeById(int id) {
        for (Employee employee : employeList) {
            if (id == employee.getId()) {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> getEmployeeWithParams(String firstName, String lastName)
    {
    	
    

        List<Employee> employeeWithParams = new ArrayList<>();

     

        for (Employee employee : employeList)
        {if (firstName == null && lastName == null) 
        {
            return employeList;
        }
        else if (firstName!=null && lastName!=null) {
        		if ((employee.getLastName().equalsIgnoreCase(lastName)&& (employee.getFirstName().equalsIgnoreCase(firstName) ))) {
        			employeeWithParams.add(employee);
				}
				
			}
        	
        	else if (firstName==null && lastName!=null)
        	{
				if (employee.getLastName().equalsIgnoreCase(lastName)) {
					employeeWithParams.add(employee);
				}
			}
        	if (firstName!=null  && lastName==null)
        	{
				if (employee.getFirstName().equalsIgnoreCase(firstName)) {
					employeeWithParams.add(employee);
				}
			}
        	
        
        }

        return employeeWithParams;
    }
public boolean deleteEmployee(int id) {
	
Employee deleteEmployee=null;


    for (Employee employee : employeList)
    {if (employee.getId()==id)
    {
    	deleteEmployee=employee;
    	break;
    	
    }
    else
    {
    	return false;
    	
    }
    }
	employeList.remove(deleteEmployee);
	
	
	return true;
	
}
private Employee findEmployeeById(int id) {
	Employee findEmployee=null;
	for(Employee employee:employeList)
	{
		if (id==employee.getId()) {
			findEmployee=employee;
			break;
			
			
		}
	}
	
	
	
	return findEmployee;
}


public Employee updateEmployee(int id, UpdateEmployee request) {
	Employee findEmployee=findEmployeeById(id);
	if (findEmployee!=null) {
		deleteEmployee(id);
	}
	

	Employee updateEmployee=new Employee();
	updateEmployee.setId(id);
	updateEmployee.setFirstName(request.getFirstName());
	updateEmployee.setLastName(request.getLastName());
	
	employeList.add(updateEmployee);
	
	return updateEmployee;
	
}
}


	




