package com.finnovative.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Transaction {

	@Id
	private int transactionId;
	private int quantity;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(int transactionId, int quantity) {
		super();
		this.transactionId = transactionId;
		this.quantity = quantity;
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