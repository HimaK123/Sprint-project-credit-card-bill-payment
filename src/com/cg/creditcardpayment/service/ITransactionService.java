package com.cg.creditcardpayment.service;

import java.util.List;

import com.cg.creditcardpayment.bean.Transaction;

public interface ITransactionService {
	public Transaction addTransaction(Transaction transaction);
	public Transaction removeTransaction(long id);
	public Transaction updateTransaction(long id, Transaction transaction);
	public Transaction getTransactionDetails(long id);
	public List<Transaction> getAllTransactions(); 

}
