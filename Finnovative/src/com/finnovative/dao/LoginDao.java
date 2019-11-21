package com.finnovative.dao;

public interface LoginDao {

	public int readLogin(String username,String password);
	public boolean readStatus(String username);
}
