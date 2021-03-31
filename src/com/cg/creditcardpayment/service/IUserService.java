package com.cg.creditcardpayment.service;

import com.cg.creditcardpayment.bean.User;

public interface IUserService {
	public User signIn(User user);
	public User signOut(User user);
	public User changePassword(long id, User user);
}
