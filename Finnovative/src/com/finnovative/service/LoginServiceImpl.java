package com.finnovative.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finnovative.dao.LoginDao;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDao loginDao;
	
	@Override
	public int checkLogin(String username, String password) {
		
		int result=loginDao.readLogin(username,password);
		if(result==1)
			return 1;
		else
			return 0;
	
		
	}
	
	

}
