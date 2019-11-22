package com.finnovative.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	public List<Users> findAllUsers() {
		return adminDao.readAllUsers();
	}

	@Override
	public Users findUserById(int userId) {
		return adminDao.readUserById(userId);
		
	}

	@Override
	@Transactional
	public boolean checkUser(int userId) {
		int result = adminDao.verifyUser(userId);
		if(result == 1)
			return true;
		else
			return false;
	}

	@Override
	public boolean approveUser(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional
	public boolean dismissUser(int userId) {
		int result = adminDao.rejectUser(userId);
		if(result == 1)
			return true;
		else
			return false;
	}

}
