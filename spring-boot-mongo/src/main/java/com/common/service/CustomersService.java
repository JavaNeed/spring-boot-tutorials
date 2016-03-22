package com.common.service;

import java.util.List;

import com.common.model.Customer;

public interface CustomersService {
	List<Customer> findByCompanyName(String companyName);
}
