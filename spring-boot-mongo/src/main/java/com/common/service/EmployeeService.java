package com.common.service;

import com.common.model.Employee;

public interface EmployeeService {

	Employee findByEmployeeId(Integer employeeId);
	Employee findByFirstNameAndLastName(String firstName, String lastName);
}
