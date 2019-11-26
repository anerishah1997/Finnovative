package com.finnovative.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="prod_seq")
	@SequenceGenerator(name="prod_seq", sequenceName="product_seq", allocationSize=1)
	private int productId;

	private String productName;

	private String productDetails;

	private double productPrice;

	private String productImage;
	
	@OneToMany(mappedBy="product")
	private Set<EmiPlan> emiplan=new HashSet<>();
	
	@OneToMany(mappedBy="product")
	private Set<ProductTransaction> productTransactions=new HashSet<>();

	/*private int transactionId;//fk
	@OneToMany(mappedBy="product",cascade=CascadeType.ALL)
	private Set<Transaction> transaction;
	public void setTransaction(Set<Transaction> transaction) {
		this.transaction = transaction;
	}*/
	public Product() {
		super();
	}
	public Product(int productId, String productName, String productDetails, double productPrice,
			String productImage) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDetails = productDetails;
		this.productPrice = productPrice;
		this.productImage = productImage;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDetails() {
		return productDetails;
	}


	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}


	public double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	

	public Set<EmiPlan> getEmiplan() {
		return emiplan;
	}
	public void setEmiplan(Set<EmiPlan> emiplan) {
		this.emiplan = emiplan;
	}
	public Set<ProductTransaction> getProductTransactions() {
		return productTransactions;
	}
	
	public void setProductTransactions(Set<ProductTransaction> productTransactions) {
		this.productTransactions = productTransactions;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDetails=" + productDetails
				+ ", productPrice=" + productPrice + ", productImage=" + productImage + "]";
	}
	/*public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	*/
	
	
	
	
}

/*product_id number(5) Primary Key,
product_name varchar2(40) NOT NULL,
product_desc varchar2(100),
product_price number(10,3) NOT NULL,
product_img blob,
transaction one to many*/