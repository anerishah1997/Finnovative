package com.finnovative.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finnovative.dao.InstallmentDao;
import com.finnovative.model.EmiPlan;
import com.finnovative.model.Installment;
import com.finnovative.model.Product;
import com.finnovative.model.Users;
@Service
public class InstallmentsServiceImpl implements InstallmentService{
	@Autowired
	InstallmentDao installmentDao;
	
	@Override
	@Transactional
	public int insertEMIPlan(Users user, Product product, double installmentAmt, int noOfMonths) {
		int emino = installmentDao.createEMIPlan(user, product, installmentAmt, noOfMonths);
		return emino;
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

	@Override
	@Transactional
	public boolean modifyEmiCard(double installmentAmount,Users user)
	{
		int result=installmentDao.updateEmiCard(installmentAmount, user);
		if(result!=0)
			return true;
		else
			return false;
	}

	@Override
	public List<Installment> fetchInstallment(int emino) {
		
		return installmentDao.fetchInstallment(emino);
	}

	@Override
	public int fetchEmino(int userId, int productId) {
		return installmentDao.fetchEmino(userId, productId);
	}

}
