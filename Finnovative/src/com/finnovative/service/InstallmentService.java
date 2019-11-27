package com.finnovative.service;

import java.util.List;

import com.finnovative.model.EmiPlan;
import com.finnovative.model.Installment;
import com.finnovative.model.Product;
import com.finnovative.model.Users;

public interface InstallmentService {
	
	public int insertEMIPlan(Users user, Product product, double installmentAmt, int noOfMonths);
	public EmiPlan fetchEMIPlan(int emino);
	public boolean insertInstallment(EmiPlan emiplan,int i);
	public boolean modifyEmiCard(double installmentAmount, Users user);
	public List<Installment> fetchInstallment(int emino);
	public int fetchEmino(int userId, int productId);
	
}
