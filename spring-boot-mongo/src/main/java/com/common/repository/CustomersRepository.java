package com.common.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.common.model.Customer;

public interface CustomersRepository extends CrudRepository<Customer, String>{
	List<Customer> findByCompanyName(String companyName);
}
