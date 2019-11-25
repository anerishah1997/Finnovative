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
	public int insertEMIPlan(Users user, Product product, double installmentAmt, int noOfMonths) {
		return installmentDao.createEMIPlan(user, product, installmentAmt, noOfMonths);
	}

	@Override
	public EmiPlan fetchEMIPlan(int emino) {
		
		return installmentDao.getEMIPlan(emino);
		
	}

	@Override
	@Transactional
	public boolean insertInstallment(EmiPlan emiplan, int i){
			
	    int res = installmentDao.createInstallment(emiplan,i);
	    if(res==1)
	    	return true;
	    else
	    	return false;
	}

}
