package com.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.common.model.Employee;
import com.common.repository.EmployeesRepository;

@Component
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeesRepository empRepository; 

	@Override
	public Employee findByEmployeeId(Integer employeeId) {
		Employee employee = empRepository.findByEmployeeID(employeeId);
		return employee;
	}

	@Override
	public Employee findByFirstNameAndLastName(String firstName, String lastName) {
		Employee employee = empRepository.findByFirstNameAndLastName(firstName, lastName);
		return employee;
	}

}
