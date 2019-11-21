package com.finnovative.dao;

import java.util.List;

import com.finnovative.model.Admin;
import com.finnovative.model.Users;

public interface AdminDao {
	
	public int readLogin(String username,String password);
	public List<Users> readAllUsers();
	public List<Users> readUserById(int userId);
	public int verifyUser(int userId);
	public int rejectUser(int userId);
	public boolean activateUser(Users user);
	

}
