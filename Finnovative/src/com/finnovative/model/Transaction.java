package com.finnovative.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Transaction {

	@Id
	private static int transactionId=0;
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private Users user;
	
	@ManyToOne
	@JoinColumn(name="productId")
	private Product product;
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@OneToOne(mappedBy="transaction",cascade=CascadeType.ALL)
	EmiPlan emiplan;
	public EmiPlan getEmiplan() {
		return emiplan;
	}
	public void setEmiplan(EmiPlan emiplan) {
		this.emiplan = emiplan;
	}
	public Transaction() {
		super();
		
	}
	public Transaction(int transactionId, int quantity) {
		super();
		this.transactionId = transactionId++;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", quantity=" + quantity + "]";
	}
	
	
}

/*transaction_id number(10) primary key,
quantity number(2)*/