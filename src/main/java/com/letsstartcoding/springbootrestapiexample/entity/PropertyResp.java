package com.letsstartcoding.springbootrestapiexample.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="property_info")
public class PropertyResp {

	@Id
	@Column(name = "CUST_ID")
	private String CUST_ID;
	
	@Column(name = "RESPONSE")
	private Date RESPONSE;
	
	@Column(name = "CREATED_BY")
	private String CREATED_BY;
	
	@Column(name = "CREATED_ON")
	private String CREATED_ON;

	public String getCUST_ID() {
		return CUST_ID;
	}

	public void setCUST_ID(String cUST_ID) {
		CUST_ID = cUST_ID;
	}

	public Date getRESPONSE() {
		return RESPONSE;
	}

	public void setRESPONSE(Date rESPONSE) {
		RESPONSE = rESPONSE;
	}

	public String getCREATED_BY() {
		return CREATED_BY;
	}

	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}

	public String getCREATED_ON() {
		return CREATED_ON;
	}

	public void setCREATED_ON(String cREATED_ON) {
		CREATED_ON = cREATED_ON;
	}
	
}
