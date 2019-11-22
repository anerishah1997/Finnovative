package com.finnovative.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.finnovative.model.Users;
@Repository
public class RegisterDaoImpl implements RegisterDao{
	
	

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public int createUser(Users user) {
        entityManager.merge(user);
		return 	1;
	}

}
