package com.service;

import java.util.List;

import com.model.Customer;

public interface CustomerService {

	void addCustomer(Customer customer);
	
	Customer findById(Integer id);
	List<Customer> findByCusname(String cusname);
	List<Customer> findAllCustomer();
}
