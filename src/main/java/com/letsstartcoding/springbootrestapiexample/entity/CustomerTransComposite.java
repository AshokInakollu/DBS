package com.letsstartcoding.springbootrestapiexample.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;


@Embeddable
public class CustomerTransComposite implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "CUST_ID")
	private String CUST_ID;
	
	@Column(name = "TRAN_DATE")
	private Date TRAN_DATE;

	public String getCUST_ID() {
		return CUST_ID;
	}

	public void setCUST_ID(String cUST_ID) {
		CUST_ID = cUST_ID;
	}

	public Date getTRAN_DATE() {
		return TRAN_DATE;
	}

	public void setTRAN_DATE(Date tRAN_DATE) {
		TRAN_DATE = tRAN_DATE;
	}
	

}
