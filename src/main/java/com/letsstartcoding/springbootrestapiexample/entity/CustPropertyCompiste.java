package com.letsstartcoding.springbootrestapiexample.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CustPropertyCompiste implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "CUST_ID")
	private Long CUST_ID;

	@Column(name = "PROPERTY_ID")
	private Long PROPERTY_ID;

	public Long getCUST_ID() {
		return CUST_ID;
	}

	public void setCUST_ID(Long cUST_ID) {
		CUST_ID = cUST_ID;
	}

	public Long getPROPERTY_ID() {
		return PROPERTY_ID;
	}

	public void setPROPERTY_ID(Long pROPERTY_ID) {
		PROPERTY_ID = pROPERTY_ID;
	}

}
