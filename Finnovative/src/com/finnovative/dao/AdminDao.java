package com.finnovative.dao;

import java.util.List;

import com.finnovative.model.Admin;
import com.finnovative.model.Users;

public interface AdminDao {
	
	public int readLogin(String username,String password);
	public List<Admin> readAllUsers();
	public Admin readUserById(int userId);
	public boolean verifyUser(Users user);
	public boolean activateUser(Users user);
	

}
