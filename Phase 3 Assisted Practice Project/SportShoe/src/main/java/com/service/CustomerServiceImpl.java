package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Customer;
import com.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public Customer findById(Integer id) {
		Optional<Customer> temp = customerRepository.findById(id);
		if(temp.isPresent())
		{
			return temp.get();
		}
		return null;
	}

	@Override
	public List<Customer> findByCusname(String cusname) {
		return customerRepository.findByCusname(cusname);
	}

	@Override
	public List<Customer> findAllCustomer() {
		return customerRepository.findAll();
	}

}
