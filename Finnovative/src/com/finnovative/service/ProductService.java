package com.finnovative.service;

import java.util.List;

import com.finnovative.model.Product;

public interface ProductService {
	public List<Product> findAllProducts();
	public Product findProductById(int productId);

}
