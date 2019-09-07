package com.letsstartcoding.springbootrestapiexample.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letsstartcoding.springbootrestapiexample.entity.Customer;
import com.letsstartcoding.springbootrestapiexample.service.CustomerService;


@RestController
@RequestMapping("/Easyloan/Customer")
public class CustomerController {

	@Autowired
	CustomerService service;

	/* to save an Customer */
	@PostMapping("/custDetails")
	public Customer createCustomer(@Valid @RequestBody Customer cust) {
		return service.save(cust);
	}

	/* get all Customers */
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		return service.findAll();
	}

	/* get Customer by empid */
	@GetMapping("/customer/{custid}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable(value = "custid") Long custId) {

		Customer customer = service.getCustomerById(custId);

		if (customer == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(customer);

	}

	/* update an Customer by empid */
	@PutMapping("/customer/update/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable(value = "id") Long empid,
			@Valid @RequestBody Customer empDetails) {

		Customer cust = service.getCustomerById(empid);
		if (cust == null) {
			return ResponseEntity.notFound().build();
		}

		/*
		 * cust.setName(cust.getName()); cust.setDesignation(cust.getDesignation());
		 * cust.setExpertise(cust.getExpertise());
		 */
		Customer updateCustomer = service.save(cust);
		return ResponseEntity.ok().body(updateCustomer);

	}

	/* Delete an Customer */
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable(value = "id") Long empid) {

		Customer emp = service.getCustomerById(empid);
		if (emp == null) {
			return ResponseEntity.notFound().build();
		}
		service.delete(emp);

		return ResponseEntity.ok().build();

	}

}
