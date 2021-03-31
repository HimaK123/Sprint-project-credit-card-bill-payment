package com.cg.creditcardbillpayment.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/*********************************************************************************************
 *          @author          K.Hima Susmitha
 *          Description     It is an entity class that as a various data members
 *         Version             1.0
 *         Created Date    23-03-2021
 *********************************************************************************************/

@Entity
public class Statement {
	@Id
	private Long statementId;
	private double dueAmount;
	@DateTimeFormat(style = "dd-MM-yyyy")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dueDate;
	@DateTimeFormat(style = "dd-MM-yyyy")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate billingDate;
	@OneToOne
	private Customer customer;

	public Statement() {
		super();
	}

	public Statement(Long statementId, double dueAmount, LocalDate dueDate, LocalDate billingDate, Customer customer) {
		super();
		this.statementId = statementId;
		this.dueAmount = dueAmount;
		this.dueDate = dueDate;
		this.billingDate = billingDate;
		this.customer = customer;
	}

	public Long getStatementId() {
		return statementId;
	}

	public void setStatementId(Long statementId) {
		this.statementId = statementId;
	}

	public double getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(LocalDate billingDate) {
		this.billingDate = billingDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Statement [statementId=" + statementId + ", dueAmount=" + dueAmount + ", dueDate=" + dueDate
				+ ", billingDate=" + billingDate + ", customer=" + customer + "]";
	}

}