package com.finnovative.service;

import java.util.List;

import com.finnovative.model.Admin;
import com.finnovative.model.Users;

public interface AdminService {

	public int checkLogin(String username, String password);
	public List<Users> findAllUsers();
	public List<Users> findUserById(int userId);
	public boolean checkUser(int userId);
	public boolean approveUser(Users user);
	public boolean dismissUser(int userId);
	
	
}
