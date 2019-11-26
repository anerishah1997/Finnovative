package com.finnovative.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finnovative.dao.ProductTransactionDao;
import com.finnovative.model.EmiPlan;
import com.finnovative.model.Product;
import com.finnovative.model.ProductTransaction;
import com.finnovative.model.Users;
@Service
public class ProductTransactionServiceImpl implements ProductTransactionService {
	@Autowired
	ProductTransactionDao transactionDao;
	
	@Transactional
	@Override
	public int addtransaction(Product product, Users user) {
		int result=transactionDao.addTransaction(product, user);
		return result;
	}
	
	@Override
	public List<ProductTransaction>fetchTransaction(int id) {
			return transactionDao.readTransaction(id);
	}

}
