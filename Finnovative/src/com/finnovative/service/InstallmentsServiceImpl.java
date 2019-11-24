package com.finnovative.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finnovative.dao.InstallmentDao;
import com.finnovative.model.EmiPlan;
import com.finnovative.model.Product;
import com.finnovative.model.Users;

@Service
public class InstallmentsServiceImpl implements InstallmentService{

	@Autowired
	InstallmentDao installmentDao;
	
	@Override
	@Transactional
	public boolean insertEMIPlan(Users user, Product product, double installmentAmt, int noOfMonths) {
		int result = installmentDao.createEMIPlan(user, product, installmentAmt, noOfMonths);
		if(result == 1)
			return true;
		else
			return false;
	}

	@Override
	public EmiPlan fetchEMIPlan(Users user) {
		
		return installmentDao.getEMIPlan(user);
		
	}

	@Override
	public boolean insertInstallment(EmiPlan emiplan) {
		
		return false;
	}

}
