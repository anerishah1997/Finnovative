package com.finnovative.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finnovative.dao.RegisterDao;
import com.finnovative.model.Users;

@Service
public class RegisterServiceImpl implements RegisterService{

	
	
	@Autowired
	RegisterDao registerDao;


	@Override
	@Transactional
	public int addUser(Users user) {
	    int result = registerDao.createUser(user);
	    if(result==1)
	    	return 1;
	    else
	    	return 0;
	}

}
