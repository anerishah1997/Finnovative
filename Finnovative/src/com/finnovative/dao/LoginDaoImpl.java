package com.finnovative.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
	
	public boolean readStatus(String username){
		String query="Select u from Users u where u.username='"+username+"'";
		Query tquery = entityManager.createQuery(query);
		List<Users> list = tquery.getResultList();
		System.out.println("List: "+list);
		Users user = list.get(0);
		String status = user.getStatus();
		String card = user.getCardType();
		if(status.equals("VERIFIED"))
			return true;
		else
			return false;
		
	}
	
	public String checkCard(String username)
	{
		String query="Select u from Users u where u.username='"+username+"'";
		Query tquery = entityManager.createQuery(query);
		List<Users> list = tquery.getResultList();
		System.out.println("List: "+list);
		Users user = list.get(0);
		String card = user.getCardType();
		return card;
		
	}

}
