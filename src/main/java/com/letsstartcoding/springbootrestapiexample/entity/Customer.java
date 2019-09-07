package com.letsstartcoding.springbootrestapiexample.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name = "customer_info")
public class Customer  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CUST_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long custid;

	@NotBlank
	@Column(name = "CUSTOMER_NAME")
	private String customerName;

	@Column(name = "GENDER")
	private String gender;

	@NotBlank
	@Column(name = "ADDR1")
	private String address1;

	@NotBlank
	@Column(name = "ADDR2")
	private String address2;

	@LastModifiedDate
	@Column(name = "CREATED_BY")
	private Long createdBy;

	@LastModifiedDate
	@Column(name = "UPDATED_DATED")
	private Date createdOn;

	@LastModifiedDate
	@Column(name = "UPDATED_BY")
	private Long lastupdatedBy;

	@LastModifiedDate
	@Column(name = "UPDATED_ON")
	private Date lastupdatedOn;

	public Long getCustid() {
		return custid;
	}

	public void setCustid(Long custid) {
		this.custid = custid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Long getLastupdatedBy() {
		return lastupdatedBy;
	}

	public void setLastupdatedBy(Long lastupdatedBy) {
		this.lastupdatedBy = lastupdatedBy;
	}

	public Date getLastupdatedOn() {
		return lastupdatedOn;
	}

	public void setLastupdatedOn(Date lastupdatedOn) {
		this.lastupdatedOn = lastupdatedOn;
	}
}
