package com.letsstartcoding.springbootrestapiexample.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CUST_PROPERTY")
public class CustProperty {

	@EmbeddedId
	CustPropertyCompiste id;

	@Column(name = "LOAN_AMT")
	private double LOAN_AMT;

	@Column(name = "EMI")
	private double EMI;

	@Column(name = "TENURE")
	private Long TENURE;

	@Column(name = "CREATED_BY")
	private Long CREATED_BY;

	@Column(name = "CREATED_ON")
	private Date CREATED_ON;

	public double getLOAN_AMT() {
		return LOAN_AMT;
	}

	public void setLOAN_AMT(double lOAN_AMT) {
		LOAN_AMT = lOAN_AMT;
	}

	public double getEMI() {
		return EMI;
	}

	public void setEMI(double eMI) {
		EMI = eMI;
	}

	public Long getTENURE() {
		return TENURE;
	}

	public void setTENURE(Long tENURE) {
		TENURE = tENURE;
	}

	public Long getCREATED_BY() {
		return CREATED_BY;
	}

	public void setCREATED_BY(Long cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}

	public Date getCREATED_ON() {
		return CREATED_ON;
	}

	public void setCREATED_ON(Date cREATED_ON) {
		CREATED_ON = cREATED_ON;
	}
}
