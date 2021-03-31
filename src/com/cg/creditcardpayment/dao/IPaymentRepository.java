package com.cg.creditcardpayment.dao;

import com.cg.creditcardpayment.bean.Payment;

public interface IPaymentRepository {
	
	public Payment addPayment(Payment payment);
	public Payment removePayment(long id);
	public Payment updatePayment(long id, Payment payment);
	public Payment getPayment(long id);


}
