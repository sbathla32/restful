package com.rest.util;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.rest.model.Employee;

@Component
public class EmployeeUtil {
	
	private final List<Employee> employees = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		Employee employee = new Employee(1, "Sahil","DI");
		employees.add(employee);
		Employee employee2 = new Employee(1, "Supreet","DI");
		employees.add(employee2);
	}

	public Employee getEmployee(Integer id) {
		return employees.stream().filter(e -> e.getId().equals(id)).findFirst().get();
	}
	
	

}
