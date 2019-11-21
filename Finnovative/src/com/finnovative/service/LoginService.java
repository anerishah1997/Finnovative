package com.finnovative.service;

public interface LoginService {

	public int checkLogin(String username, String password);
	public boolean checkStatus(String username);
}
