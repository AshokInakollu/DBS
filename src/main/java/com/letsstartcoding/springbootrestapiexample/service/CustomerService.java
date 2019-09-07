package com.letsstartcoding.springbootrestapiexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.entity.Customer;
import com.letsstartcoding.springbootrestapiexample.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public Customer save(Customer cust) {
		return customerRepository.save(cust);
	}


	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public Customer getCustomerById(Long customerId) {
		return customerRepository.findOne(customerId);
	}


	public void delete(Customer cust) {
		customerRepository.delete(cust);
	}

}
