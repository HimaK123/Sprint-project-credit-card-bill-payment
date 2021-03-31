package com.cg.creditcardpayment.bean;

import java.time.LocalDate;

public class Statement {	
	private long statementId;
	private double dueAmount;
	private LocalDate billingDate;
	private LocalDate dueDate;
	private Customer customer;
}
