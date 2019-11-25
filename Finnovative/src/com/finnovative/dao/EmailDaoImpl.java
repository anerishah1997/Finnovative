package com.finnovative.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


import com.finnovative.model.Users;
@Repository
public class EmailDaoImpl implements EmailDao{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public String Read( String email) {
		String query = "Select u.password from Users u where u.email='"+email+"'";
		TypedQuery<String> tquery= entityManager.createQuery(query,String.class);
		String pass =  tquery.getSingleResult();
		return pass;
		}
		

		
		
	}
	
	
/*	public int Login(String email,String  password) {
	
}
*/
