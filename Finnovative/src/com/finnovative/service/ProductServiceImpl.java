package com.finnovative.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finnovative.dao.ProductDaoImpl;
import com.finnovative.model.Product;
@Service
public class ProductServiceImpl implements ProductService{
@Autowired
private ProductDaoImpl dao;
	public List<Product> findAllProducts() {
		List<Product>list=dao.readAllProduct();
		return list ;
	}
	public Product findProductById(int productId) {
		return dao.readProductById(productId);

	
	

}
}