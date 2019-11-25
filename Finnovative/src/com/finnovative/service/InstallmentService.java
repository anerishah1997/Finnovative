package com.finnovative.service;

import com.finnovative.model.EmiPlan;
import com.finnovative.model.Product;
import com.finnovative.model.Users;

public interface InstallmentService {
	
	public int insertEMIPlan(Users user, Product product, double installmentAmt, int noOfMonths);
	public EmiPlan fetchEMIPlan(int emino);
	public boolean insertInstallment(EmiPlan emiplan,int i);
	
}
