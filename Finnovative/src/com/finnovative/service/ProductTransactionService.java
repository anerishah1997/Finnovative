package com.finnovative.service;

import java.util.List;

import com.finnovative.model.Product;
import com.finnovative.model.ProductTransaction;
import com.finnovative.model.Users;

public interface ProductTransactionService {

	public int addtransaction(Product product, Users user);

	public List<ProductTransaction> fetchTransaction(int id);

}
