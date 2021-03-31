package com.cg.creditcardpayment.dao;

import java.util.List;

import com.cg.creditcardpayment.bean.CreditCard;

public interface ICreditCardRepository {
	public CreditCard addCreditCard(CreditCard creditCard);
	public CreditCard removeCreditCard(long cardId);
	public CreditCard updateCreditCard(long cardId, CreditCard card);
	public CreditCard getCreditCard(long cardId);
	public List<CreditCard> getAllCreditCards(); 


}
