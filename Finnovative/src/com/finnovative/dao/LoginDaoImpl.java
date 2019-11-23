package com.finnovative.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.finnovative.model.EmiCard;
import com.finnovative.model.Users;

@Repository
public class LoginDaoImpl implements LoginDao{
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Users readLogin(String username, String password) {
		String query="Select u from Users u where u.username='"+username+"' and u.password='"+password+"'";
		TypedQuery<Users> tquery= entityManager.createQuery(query,Users.class);
		/*tquery.setParameter("uname", username);
		tquery.setParameter("pass",password);*/
		Users user = tquery.getSingleResult();
		return user;
		
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

    public int activateUser(Users user)
    {
    	String jpql = "Update Users u set u.status='APPROVED' where u.userId="+user.getUserId();
    	Query query = entityManager.createQuery(jpql);
    	int result = query.executeUpdate();
    	return result;
    }
    
    public int createEmiCard(Users user)
    {
    	EmiCard emicard = new EmiCard();
    	emicard.setCardType(user.getCardType());
        Calendar calendar = Calendar.getInstance();
    	emicard.setValidityStart(calendar.getTime());
    	if(user.getCardType().equals("Gold"))
    		emicard.setTotalCredit(40000);
    	else
    		emicard.setTotalCredit(80000);
    	calendar.add(Calendar.MONTH, 12);
    	emicard.setValidityExp(calendar.getTime());
    	emicard.setRemainingCredit(emicard.getCreditUsed());
    	emicard.setCreditUsed(0);
    	//emicard.setUserId(user.getUserId());
    	Users user1 = entityManager.find(Users.class,user.getUserId());
    	emicard.setUser(user1);
    	//user1.setEmicard(emicard);
    	
    	entityManager.persist(emicard);
    	return 1;
    	/**/
    }
    
    public EmiCard readEmiCard(Users user)
    {
    	String query = "Select e from EmiCard e INNER JOIN e.user u where u.userId=:userId";
    	TypedQuery<EmiCard> tquery = entityManager.createQuery(query, EmiCard.class);
    	tquery.setParameter("userId", user.getUserId());
    	EmiCard card = tquery.getSingleResult();
    	/*long cardno = card.getCardNumber(); 
    	String query2 = "Update Users u set u.cardnumber="+cardno+" where u.userId="+user.getUserId();
    	Query tquery2 = entityManager.createQuery(query2);*/
    	
    	
    	return card;
    }
    
   /* public String readCardName(Users user)*/
}
