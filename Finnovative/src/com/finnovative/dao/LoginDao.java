package com.finnovative.dao;

import com.finnovative.model.EmiCard;
import com.finnovative.model.Users;

public interface LoginDao {

	public Users readLogin(String username,String password);
	public boolean readStatus(String username);
	public String checkCard(String username);
	public int activateUser(Users user);
	public int createEmiCard(Users user);
	public EmiCard readEmiCard(Users user);
}
