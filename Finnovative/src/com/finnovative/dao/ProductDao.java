package com.finnovative.dao;

import java.util.List;

import com.finnovative.model.Product;

public interface ProductDao {
	public List<Product> readAllProduct() ;
	public Product readProductById( int productId);

}
