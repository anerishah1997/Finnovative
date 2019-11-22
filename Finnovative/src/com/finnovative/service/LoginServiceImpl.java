package com.finnovative.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finnovative.dao.LoginDao;
import com.finnovative.model.EmiCard;
import com.finnovative.model.Users;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDao loginDao;
	
	@Override
	public Users checkLogin(String username, String password) {
		
		return loginDao.readLogin(username,password);
	
	}

	@Override
	public boolean checkStatus(String username) {
		boolean result = loginDao.readStatus(username);
		if(result)
			return true;
		else
			return false;
	}
	
	public String checkCard(String username)
	{
	     return loginDao.checkCard(username);
	}

	@Override
	@Transactional
	public int activateUser(Users user) {
		return loginDao.activateUser(user);
	}

	@Override
	@Transactional
	public boolean insertEmiCard(Users user) {
		int result = loginDao.createEmiCard(user);
		if(result==1)
			return true;
		else
			return false;
	}

	@Override
	public EmiCard fetchEmiCard(Users user) {
		return loginDao.readEmiCard(user);
	}

}
