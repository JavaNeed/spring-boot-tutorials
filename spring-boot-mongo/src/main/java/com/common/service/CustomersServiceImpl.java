package com.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.common.model.Customer;
import com.common.repository.CustomersRepository;

@Component
public class CustomersServiceImpl implements CustomersService{

	@Autowired
	private CustomersRepository customersRepository; 
	
	@Override
	public List<Customer> findByCompanyName(String companyName) {
		List<Customer> customers = customersRepository.findByCompanyName(companyName);
		return customers;
	}

}
