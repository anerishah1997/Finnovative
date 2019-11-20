package com.finnovative.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finnovative.dao.AdminDao;
import com.finnovative.model.Admin;
import com.finnovative.model.Users;
@Service
public class AdminServiceimpl implements AdminService{
	@Autowired
	private AdminDao adminDao;
	@Override
	public int checkLogin(String username, String password) {
		
		int result=adminDao.readLogin(username,password);
		if(result==1)
			return 1;
		else
			return 0;
	}

	@Override
	public List<Admin> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkUser(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean approveUser(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

}
