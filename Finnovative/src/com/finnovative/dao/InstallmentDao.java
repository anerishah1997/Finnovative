package com.finnovative.dao;

import java.text.ParseException;

import com.finnovative.model.EmiPlan;
import com.finnovative.model.Product;
import com.finnovative.model.Users;

public interface InstallmentDao {
	
	public int createEMIPlan(Users user, Product product, double installmentAmt, int noOfMonths);
	public EmiPlan getEMIPlan(int emino);
	public int createInstallment(EmiPlan emiplan, int i);
	public int updateEmiCard(double installmentAmount, Users user);

}
