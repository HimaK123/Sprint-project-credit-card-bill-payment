package com.cg.creditcardpayment.bean;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {
	private String status;
	private String refNo;
	private LocalDate date;
	private LocalTime time;
	private String cardNo;
	private String emailAddr;
	private String mobileNo;
	private double paymentAmount;
	private String payFrom;
}
