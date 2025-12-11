package com.aysglakts.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aysglakts.model.Employee;
@Configuration
public class AppConfig {
	@Bean
	public List<Employee> employeList() {
	    List<Employee> employeList = new ArrayList<>();
	    employeList.add(new Employee(1,"AKTAS","AYSE"));
	    employeList.add(new Employee(2,"TASS","MELİS"));
	    employeList.add(new Employee(3,"AA","BB"));
	    
	    return employeList;
	}

}
