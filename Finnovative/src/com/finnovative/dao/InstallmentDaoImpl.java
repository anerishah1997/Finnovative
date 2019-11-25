package com.finnovative.dao;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
		LocalDate d1 = LocalDate.now();
		System.out.println(new Date());
		emiplan.setStartDate(new Date());
		LocalDate date = d1.plusMonths(noOfMonths);
		
		//LocalDate date1 = date.plusMonths(noOfMonths);
		emiplan.setEndDate(java.sql.Date.valueOf(date));
		Users user1 =  entityManager.find(Users.class, user.getUserId());
		emiplan.setUser(user1);
		Product product1 = entityManager.find(Product.class, product.getProductId());
		emiplan.setProduct(product1); 
		
		entityManager.persist(emiplan);
		return emiplan.getEmino();
	}

	@Override
	public EmiPlan getEMIPlan(int emino) {
		String query = "Select e from EmiPlan e where e.emino=:emiNo";
    	TypedQuery<EmiPlan> tquery = entityManager.createQuery(query, EmiPlan.class);
    	tquery.setParameter("emiNo", emino);
    	EmiPlan plan = tquery.getSingleResult();
    	return plan;
		
	}

	@Override
	public int createInstallment(EmiPlan emiplan, int i)  {
		        Date date = emiplan.getStartDate();
				installment.setInstallmentNo(i);
				installment.setDatePaid(emiplan.getStartDate());
				LocalDate date1 = new Date().toInstant()
			    	      .atZone(ZoneId.systemDefault())
			    	      .toLocalDate();
				LocalDate dueDate = date1.plusMonths(1);
				Date date2 =  Date.from(dueDate.atStartOfDay()
					      .atZone(ZoneId.systemDefault())
					      .toInstant());
				installment.setDueDate(date2);
				if(i==1)
					installment.setInstallmentStatus("PAID");
				else
					installment.setInstallmentStatus("PENDING");
				EmiPlan emi1 = entityManager.find(EmiPlan.class, emiplan.getEmino());
				installment.setEmiplan(emi1);
				entityManager.merge(installment);
				
				date = date2;
			
				return 1;

		
		
			/*installment.setInstallmentNo(i);
			installment.setPaidDate(emiplan.getStartDate());
			installment.setDueDate(emiplan.getStartDate().plusMonths(i));
			System.out.println(emiplan.getStartDate().plusMonths(i));
			if(i==1)
			installment.setStatus("Paid");
			else
			installment.setStatus("Due");
			
			entityManager.persist(installment);*/
			
			//installment.setPaidDate(installment.getDueDate());
			
			//installment.setDueDate((Date)date.setDate((date.getMonth()-1 + i)%12 +1));
		
	}

}
