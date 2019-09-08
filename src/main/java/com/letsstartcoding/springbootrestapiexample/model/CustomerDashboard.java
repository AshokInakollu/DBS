package com.letsstartcoding.springbootrestapiexample.model;

import java.util.List;

import com.letsstartcoding.springbootrestapiexample.entity.Customer;

public class CustomerDashboard {

	private Customer customer;
	private String Description;
	private List<BannerImage> bannerImages;

	public List<BannerImage> getBannerImages() {
		return bannerImages;
	}

	public void setBannerImages(List<BannerImage> bannerImages) {
		this.bannerImages = bannerImages;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}
