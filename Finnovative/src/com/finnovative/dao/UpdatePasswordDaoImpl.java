package com.finnovative.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
@Repository
public class UpdatePasswordDaoImpl implements UpdatePasswordDao {
	@PersistenceContext
	private EntityManager entitymanager;
	@Override
	public int updatePassword(String password,String email) {

		Query query = entitymanager.createQuery("UPDATE Users u SET u.password=:password where email=:email");
		query.setParameter("password", password);
		query.setParameter("email", email);
		int result=query.executeUpdate();
		return result;

	}


}
