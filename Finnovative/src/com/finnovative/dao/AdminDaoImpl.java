package com.finnovative.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		TypedQuery<Admin> tquery= entityManager.createQuery(query,Admin.class);		
		/*tquery.setParameter("uname", username);
		tquery.setParameter("pass",password);*/
		List<Admin> list= tquery.getResultList();
		return list.size();
	}

	@Override
	public List<Users> readAllUsers() {
		String query = "Select u from Users u where u.status='PENDING'";
		TypedQuery<Users> tquery = entityManager.createQuery(query, Users.class);
		List<Users> list  = tquery.getResultList();
		return list;
	}

	@Override
	public Users readUserById(int userId) {
		String query = "Select u from Users u where u.userId="+userId;
		TypedQuery<Users> tquery = entityManager.createQuery(query, Users.class);
		Users user  = tquery.getSingleResult();

		return user;
	}

	@Override
	public int verifyUser(int userId) {
		String jpql = "Update Users u set u.status='VERIFIED' where u.userId="+userId;
		Query query = entityManager.createQuery(jpql);
		int result = query.executeUpdate();
		return result;
	}

	@Override
	public boolean activateUser(Users user) {
		return false;
	}

	@Override
	public int rejectUser(int userId) {

		String jpql = "Delete from Users u where u.userId="+userId;
		Query query = entityManager.createQuery(jpql);
		int result = query.executeUpdate();
		return result;
	}

}
