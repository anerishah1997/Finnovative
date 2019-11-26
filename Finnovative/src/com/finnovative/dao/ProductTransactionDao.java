package com.finnovative.dao;

import java.util.List;

import com.finnovative.model.Product;
import com.finnovative.model.ProductTransaction;
import com.finnovative.model.Users;

public interface ProductTransactionDao {
	public int addTransaction(Product product, Users user);

	public List<ProductTransaction>readTransaction(int id);
}
