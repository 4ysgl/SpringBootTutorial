package com.aysglakts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aysglakts.model.Employee;
import com.aysglakts.services.EmployeeService;
import java.util.List;

@RestController
@RequestMapping("/rest/api")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Tüm çalışanları getir
    @GetMapping("/employee/list")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployeeList();
    }

    // ID'ye göre çalışan getir
    @GetMapping("/employee/list/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    
    // PARAMATRE İLEVERİ GETİRME
    
    @GetMapping("/employee/with-params")
    public List<Employee>getEmployeeWithParams(@RequestParam(name = "firstName",required = false)String firstName, 
    
                                               @RequestParam(name = "lastName",required = false)String lastName)
    {
    	System.out.println(firstName+" "+lastName);
		return employeeService.getEmployeeWithParams(firstName, lastName);
    	
    }
}
