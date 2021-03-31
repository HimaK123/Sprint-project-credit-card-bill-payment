package com.cg.creditcardpayment.service;

import com.cg.creditcardpayment.bean.Payment;

public interface IPaymentService {
	
	public Payment addPayment(Payment payment);
	public Payment removePayment(long id);
	public Payment updatePayment(long id, Payment payment);
	public Payment getPayment(long id);


}
