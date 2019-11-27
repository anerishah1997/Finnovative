package com.finnovative.dao;

import java.text.ParseException;
import java.util.List;

import com.finnovative.model.EmiPlan;
import com.finnovative.model.Installment;
import com.finnovative.model.Product;
import com.finnovative.model.Users;

public interface InstallmentDao {

	public int createEMIPlan(Users user, Product product, double installmentAmt, int noOfMonths);
	public EmiPlan getEMIPlan(int emino);
	public int createInstallment(EmiPlan emiplan, int i);
	public int updateEmiCard(double installmentAmount, Users user);
	public List<Installment> fetchInstallment(int emino);
	public int fetchEmino(int userId, int productId);

}
