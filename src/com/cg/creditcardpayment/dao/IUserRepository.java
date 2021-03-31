package com.cg.creditcardpayment.dao;

import com.cg.creditcardpayment.bean.User;

public interface IUserRepository {
	public User signIn(User user);
	public User signOut(User user);
	public User changePassword(long id, User user);
}
