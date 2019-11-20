package com.finnovative.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.finnovative.model.Admin;
import com.finnovative.model.Users;
@Repository
public class AdminDaoImpl implements AdminDao{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public int readLogin(String username,String password) {
		String query="Select a from Admin a where a.username='"+username+"' and a.password='"+password+"'";
		System.out.println("in dao");
		TypedQuery<Admin> tquery= entityManager.createQuery(query,Admin.class);
		System.out.println(tquery);
		/*tquery.setParameter("uname", username);
		tquery.setParameter("pass",password);*/
		List<Admin> list= tquery.getResultList();
		System.out.println(list.size());
		return list.size();
	}

	@Override
	public List<Admin> readAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin readUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verifyUser(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean activateUser(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

}
