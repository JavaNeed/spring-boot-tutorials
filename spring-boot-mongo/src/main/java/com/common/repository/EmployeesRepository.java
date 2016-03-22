package com.common.repository;

import org.springframework.data.repository.CrudRepository;

import com.common.model.Employee;

public interface EmployeesRepository extends CrudRepository<Employee, String>{

	Employee findByEmployeeID(Integer employeeId);
	Employee findByFirstNameAndLastName(String firstName, String lastName);
}
