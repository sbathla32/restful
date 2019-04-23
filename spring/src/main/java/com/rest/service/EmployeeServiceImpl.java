package com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Employee;
import com.rest.util.EmployeeUtil;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	

	@Autowired
	private EmployeeUtil employeeUtil;
	
	@Override
	public Employee getEmployee(Integer id) {
		return employeeUtil.getEmployee(id);
	}

}
