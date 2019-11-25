package com.finnovative.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finnovative.dao.EmailDao;
import com.finnovative.model.Users;

@Service
public class EmailServiceImpl  implements EmailService{
	
	@Autowired
	EmailDao dao;
	
	
	@Override
	public String check(String email) {
		return dao.Read(email);
	}
	}


