package com.finnovative.service;

import java.util.List;

import com.finnovative.model.Admin;
import com.finnovative.model.Users;

public interface AdminService {

	public int checkLogin(String username, String password);
	public List<Admin> findAllUsers();
	public Admin findUserById(int userId);
	public boolean checkUser(Users user);
	public boolean approveUser(Users user);
	
	
}
