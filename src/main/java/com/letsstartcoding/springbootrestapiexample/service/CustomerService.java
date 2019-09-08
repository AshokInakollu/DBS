package com.letsstartcoding.springbootrestapiexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.Helper.BannerHelper;
import com.letsstartcoding.springbootrestapiexample.entity.Customer;
import com.letsstartcoding.springbootrestapiexample.model.BannerImage;
import com.letsstartcoding.springbootrestapiexample.model.CustomerDashboard;
import com.letsstartcoding.springbootrestapiexample.model.Recomondations;
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

	public CustomerDashboard getCustomerDashboard(Long empid) {
		CustomerDashboard dashboard = new CustomerDashboard();
		List<BannerImage> bannerImages = BannerHelper.getBannerImages();

		Customer customer = getCustomerById(empid);
		String Description = "Banner Images Description";
		dashboard.setCustomer(customer);
		dashboard.setDescription(Description);
		dashboard.setBannerImages(bannerImages);
		return dashboard;

	}
	
	public Recomondations getRecomondations(Long empid) {
		
		Recomondations recomondations = new Recomondations();
		
		recomondations.setDescription("Recomondations");
		recomondations.setId("30000");
		recomondations.setText("3 BHK");
		
		return recomondations;

	}

}
