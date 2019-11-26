package com.finnovative.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Component
@Table
public class ProductTransaction {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="t1")
	@SequenceGenerator(name="t1",sequenceName="tran_se",allocationSize=1)
	private int transactionId;
	private String productName;
	private double productPrice;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="productId")
	private Product product;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
	private Users user;
	
	
	public void setProduct(Product product) {
		this.product = product;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public Users getUser() {
		return user;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

}
