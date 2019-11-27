package com.finnovative.dao;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finnovative.model.EmiCard;
import com.finnovative.model.EmiPlan;
import com.finnovative.model.Installment;
import com.finnovative.model.Product;
import com.finnovative.model.ProductTransaction;
import com.finnovative.model.Users;

@Repository
public class InstallmentDaoImpl implements InstallmentDao{
	@Autowired
	EmiPlan emiplan;
	@Autowired
	Installment installment;
	/* @Autowired
    ProductTransaction producttransaction;*/

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public int createEMIPlan(Users user, Product product, double installmentAmt, int noOfMonths) {
		emiplan.setEmiAmount(installmentAmt);
		emiplan.setNoOfMonths(noOfMonths);
		LocalDate d1 = LocalDate.now();
		emiplan.setStartDate(new Date());
		LocalDate date = d1.plusMonths(noOfMonths);
		emiplan.setEndDate(java.sql.Date.valueOf(date));
		Users user1 =  entityManager.find(Users.class, user.getUserId());
		emiplan.setUser(user1);
		Product product1 = entityManager.find(Product.class, product.getProductId());
		emiplan.setProduct(product1);
		//entityManager.clear();
		emiplan = entityManager.merge(emiplan);
		
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
		if(i==1)
			installment.setDatePaid(emiplan.getStartDate());
		else
			installment.setDatePaid(installment.getDueDate());	
		LocalDate date1 = installment.getDatePaid().toInstant()
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
	}

	@Override
	public int updateEmiCard(double installmentAmount, Users user) {
		Users user1 = entityManager.find(Users.class, user.getUserId());
		double totalCredit=user1.getEmicard().getTotalCredit();
		double creditUsed=user1.getEmicard().getCreditUsed();
		creditUsed=creditUsed+installmentAmount;
		double remainingCredit= user1.getEmicard().getRemainingCredit();
		remainingCredit = totalCredit-creditUsed;
		Query query=entityManager.createQuery("Update EmiCard e set e.remainingCredit="+remainingCredit+" , e.creditUsed="+creditUsed+" where userid="+user1.getUserId());
		int result=query.executeUpdate();
		return result;
	}

	public int fetchEmino(int userId, int productId)
	{
		String jpql = "Select e from EmiPlan e where e.user.userId="+userId+" and e.product.productId="+productId;
		Query query = entityManager.createQuery(jpql, EmiPlan.class);
		List<EmiPlan> list = query.getResultList();
		int emino = list.get(1).getEmino();
		System.out.println(emino);
		//entityManager.clear();
		
		/*String jpql1 = "Select i from Installment i where i.emiplan.emino="+emino;
		Query query2 = entityManager.createQuery(jpql1, Installment.class);
		List<Installment> instList = query.getResultList();
		System.out.println(instList);*/
		return emino;
		
		
		
	}
	
	public List<Installment> fetchInstallment(int emino)
	{
		String jpql1 = "Select i from Installment i where i.emiplan.emino="+emino;
		Query query2 = entityManager.createQuery(jpql1, Installment.class);
		List<Installment> instList = query2.getResultList();
		System.out.println(instList);
		return instList;
	}

}
