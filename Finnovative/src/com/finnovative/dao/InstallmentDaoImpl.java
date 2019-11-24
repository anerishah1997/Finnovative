package com.finnovative.dao;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finnovative.model.EmiCard;
import com.finnovative.model.EmiPlan;
import com.finnovative.model.Installment;
import com.finnovative.model.Product;
import com.finnovative.model.Users;

@Repository
public class InstallmentDaoImpl implements InstallmentDao{
    @Autowired
	EmiPlan emiplan;
    @Autowired
    Installment installment;
    
    @PersistenceContext
	EntityManager entityManager;
	
	@Override
	public int createEMIPlan(Users user, Product product, double installmentAmt, int noOfMonths) {
		emiplan.setEmiAmount(installmentAmt);
		emiplan.setNoOfMonths(noOfMonths);
		Calendar calendar = Calendar.getInstance();
		emiplan.setStartDate(calendar.getTime());
		calendar.add(Calendar.MONTH, noOfMonths);
		emiplan.setEndDate(calendar.getTime());
		Users user1 =  entityManager.find(Users.class, user.getUserId());
		emiplan.setUser(user1);
		Product product1 = entityManager.find(Product.class, product.getProductId());
		emiplan.setProduct(product1); 
		entityManager.persist(emiplan);
		return 1;
	}

	@Override
	public EmiPlan getEMIPlan(Users user) {
		String query = "Select e from EmiPlan e INNER JOIN e.user u where u.userId=:userId";
    	TypedQuery<EmiPlan> tquery = entityManager.createQuery(query, EmiPlan.class);
    	tquery.setParameter("userId", user.getUserId());
    	EmiPlan plan = tquery.getSingleResult();
    	return plan;
		
	}

	@Override
	public int createInstallment(EmiPlan emiplan) {
		Date date;
		for(int i=1;i<=emiplan.getNoOfMonths();i++)
		{
			installment.setInstallmentNo(i);
			installment.setPaidDate(emiplan.getStartDate());
			
			//installment.setDueDate((Date)date.setDate((date.getMonth()-1 + i)%12 +1));
		}
		
		
		
		return 0;
	}

}
