package com.aysglakts.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aysglakts.model.Employee;
@Configuration
public class AppConfig {
	@Bean
public  List<Employee> emplpList() {
	List< Employee> employeelList =new ArrayList<>();
	employeelList.add(new Employee(1,"Aysegül","AKTAŞ"));
	employeelList.add(new Employee(2,"MELİS","TASS"));
	employeelList.add(new Employee(4,"SELMA","AŞ"));
	employeelList.add(new Employee(3,"NAİME","ATAŞ"));
	return employeelList;
	
	
}
}
