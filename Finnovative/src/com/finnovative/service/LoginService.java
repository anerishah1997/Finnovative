package com.finnovative.service;

import com.finnovative.model.EmiCard;
import com.finnovative.model.Users;

public interface LoginService {

	public Users checkLogin(String username, String password);
	public boolean checkStatus(String username);
	public String checkCard(String username);
	public int activateUser(Users user);
	public boolean insertEmiCard(Users user);
	public EmiCard fetchEmiCard(Users user);
	
}
