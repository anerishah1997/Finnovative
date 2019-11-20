package com.finnovative.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.finnovative.model.Users;

@Repository
public class LoginDaoImpl implements LoginDao{
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public int readLogin(String username, String password) {
		String query="Select u from Users u where u.username='"+username+"' and u.password='"+password+"'";
		System.out.println("in dao");
		TypedQuery<Users> tquery= entityManager.createQuery(query,Users.class);
		System.out.println(tquery);
		/*tquery.setParameter("uname", username);
		tquery.setParameter("pass",password);*/
		List<Users> list= tquery.getResultList();
		System.out.println(list.size());
		return list.size();
		
	}
	
	

}
