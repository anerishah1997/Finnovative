package com.finnovative.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finnovative.model.EmiCard;
import com.finnovative.model.Product;
import com.finnovative.model.ProductTransaction;
import com.finnovative.model.Users;
@Repository
public class ProductTransactionDaoImpl implements ProductTransactionDao{
	@PersistenceContext
	EntityManager entityManager;
	@Autowired
	ProductTransaction productTransaction;


	@Override
	public int addTransaction(Product product, Users user) {

		//int productId=product.getProductId();

		String productName=product.getProductName();
		double productPrice=product.getProductPrice();
		Product product1=entityManager.find(Product.class, product.getProductId());
		Users user1=entityManager.find(Users.class,user.getUserId());
		productTransaction.setProductName(productName);
		productTransaction.setUser(user1);
		productTransaction.setProduct(product1);
		productTransaction.setProductPrice(productPrice);
		productTransaction = entityManager.merge(productTransaction);//
		return productTransaction.getUser().getUserId();
	}


	@Override
	public List<ProductTransaction> readTransaction(int id) {
		String query="Select p from ProductTransaction p INNER JOIN p.user u where u.userId="+id+"";
		/*String query = "Select p from ProductTransaction p INNER JOIN p.product u where u.productId=:productId";*/
		TypedQuery<ProductTransaction> tquery = entityManager.createQuery(query, ProductTransaction.class);
		/*tquery.setParameter("productId", product.getProductId());
		 */    	List<ProductTransaction> transactionList = tquery.getResultList();
		 return transactionList;
	}

}
