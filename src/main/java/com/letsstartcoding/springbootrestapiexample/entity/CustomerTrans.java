package com.letsstartcoding.springbootrestapiexample.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "customer_txns")
public class CustomerTrans implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	CustomerTransComposite id;
	
	@Column(name = "TRAN_CURR_CODE")
	private String TRAN_CURR_CODE;
	
	@Column(name = "TRAN_AMOUNT")
	private double TRAN_AMOUNT;
	
	@Column(name = "TRAN_DIRECTION")
	private char TRAN_DIRECTION;
	
	@Column(name = "TRAN_DESC")
	private String TRAN_DESC;
	
	@Column(name = "LEDGER_BAL")
	private String LEDGER_BAL;
	
	@Column(name = "CREATED_BY")
	private int CREATED_BY;
	
	@Column(name = "CREATED_ON")
	private Date CREATED_ON;

	public String getTRAN_CURR_CODE() {
		return TRAN_CURR_CODE;
	}

	public void setTRAN_CURR_CODE(String tRAN_CURR_CODE) {
		TRAN_CURR_CODE = tRAN_CURR_CODE;
	}

	public double getTRAN_AMOUNT() {
		return TRAN_AMOUNT;
	}

	public void setTRAN_AMOUNT(double tRAN_AMOUNT) {
		TRAN_AMOUNT = tRAN_AMOUNT;
	}

	public char getTRAN_DIRECTION() {
		return TRAN_DIRECTION;
	}

	public void setTRAN_DIRECTION(char tRAN_DIRECTION) {
		TRAN_DIRECTION = tRAN_DIRECTION;
	}

	public String getTRAN_DESC() {
		return TRAN_DESC;
	}

	public void setTRAN_DESC(String tRAN_DESC) {
		TRAN_DESC = tRAN_DESC;
	}

	public String getLEDGER_BAL() {
		return LEDGER_BAL;
	}

	public void setLEDGER_BAL(String lEDGER_BAL) {
		LEDGER_BAL = lEDGER_BAL;
	}

	public int getCREATED_BY() {
		return CREATED_BY;
	}

	public void setCREATED_BY(int cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}

	public Date getCREATED_ON() {
		return CREATED_ON;
	}

	public void setCREATED_ON(Date cREATED_ON) {
		CREATED_ON = cREATED_ON;
	}

	public CustomerTransComposite getId() {
		return id;
	}

	public void setId(CustomerTransComposite id) {
		this.id = id;
	}
	
	
	

	}
