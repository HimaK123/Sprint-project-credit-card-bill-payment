package com.cg.creditcardpayment.service;

import java.util.List;

import com.cg.creditcardpayment.bean.Account;

public interface IAccountService {
	public Account addAccount(Account account);
	public Account removeAccount(long id);
	public Account updateAccount(long id, Account account);
	public Account getAccount(long id);
	public List<Account> getAllAccounts();
}
