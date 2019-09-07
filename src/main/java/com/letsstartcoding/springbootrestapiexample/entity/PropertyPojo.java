package com.letsstartcoding.springbootrestapiexample.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Customer_INFO")
@EntityListeners(AuditingEntityListener.class)

public class PropertyPojo {
	  
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long propertyID;
	
	@NotBlank
	@Column(name = "PROPERTY_NAME")
	private String propertyName;
	
	@NotBlank
	@Column(name = "ADDR1")
	private String address1;
	
	@NotBlank
	@Column(name = "ADDR2")
	private String address2;
	
	@NotBlank
	@Column(name = "PRICE")
	private Long price;
	
	@NotBlank
	@Column(name = "AREA_MEASUREMENT")
	private String areaMeasure;
	
	@LastModifiedDate
	@Column(name = "CREATED_BY")
	private Date createdBy;

	@LastModifiedDate
	@Column(name = "CREATED_ON")
	private Date createdOn;

	public Long getPropertyID() {
		return propertyID;
	}

	public void setPropertyID(Long propertyID) {
		this.propertyID = propertyID;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
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

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getAreaMeasure() {
		return areaMeasure;
	}

	public void setAreaMeasure(String areaMeasure) {
		this.areaMeasure = areaMeasure;
	}

	public Date getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
}
