package com.finnovative.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import com.finnovative.model.Users;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Transaction {

	@Id
	private static int transactionId=0;
	private int quantity;
	private int userId;//fk
	private int emiNo;//fk
	private int productId;//fk 
	
	@ManyToOne
	@JoinColumn(name="userId")
	private Users user;
	
	@ManyToOne
	@JoinColumn(name="productId")
	private Product product;
	@OneToOne(mappedBy="transaction",cascade=CascadeType.ALL)
	EmiPlan emiplan;
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