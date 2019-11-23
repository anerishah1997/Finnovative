package com.finnovative.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.finnovative.model.Product;



@Repository
public class ProductDaoImpl implements ProductDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Product> readAllProduct() {
		String jpql = "Select p From Product p";
		TypedQuery<Product> tquery = entityManager.createQuery(jpql,Product.class);
		List<Product> list = tquery.getResultList();
		System.out.println(list);
		return list;
	}

	@Override
	public Product readProductById(int productId) {
		String query = "Select p from Product p where p.productId="+productId;
		TypedQuery<Product> tquery = entityManager.createQuery(query, Product.class);
		Product product  = tquery.getSingleResult();
		
		return product;
	}


	
}
