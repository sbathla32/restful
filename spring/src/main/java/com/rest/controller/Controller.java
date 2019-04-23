package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Employee;
import com.rest.service.EmployeeService;

@RestController
public class Controller {
	
	@Autowired
	private EmployeeService employeeService;

    @GetMapping(value="/getEmployee/{id}")
    public Employee getDetailsById(@PathVariable("id") String id){
        return employeeService.getEmployee(Integer.parseInt(id));
    }

}
