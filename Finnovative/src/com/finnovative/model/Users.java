package com.finnovative.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


import org.springframework.stereotype.Component;

@Entity
@Component
public class Users {
	
	@Id
	private int userId;
	private String fullName;
	private int mobileNumber;
	private String emailId;
	private String username;
	private String password;
	private String address;
	private double annualIncome;
	private String cardType;
	private String bankName;
	private int accountNumber;
	private String ifscCode;
	private String aadhaarDoc;
	@OneToOne(mappedBy="user",cascade=CascadeType.ALL)
	EmiCard card;
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<Transaction>transaction;
	public EmiCard getCard() {
		return card;
	}
	public void setCard(EmiCard card) {
		this.card = card;
	}
	public Set<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(Set<Transaction> transaction) {
		this.transaction = transaction;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int userId, String fullName, int mobileNumber, String emailId, String username, String password,
			String address, double annualIncome, String cardType, String bankName, int accountNumber, String ifscCode,
			String aadhaarDoc) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.username = username;
		this.password = password;
		this.address = address;
		this.annualIncome = annualIncome;
		this.cardType = cardType;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.aadhaarDoc = aadhaarDoc;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getAadhaarDoc() {
		return aadhaarDoc;
	}
	public void setAadhaarDoc(String aadhaarDoc) {
		this.aadhaarDoc = aadhaarDoc;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", fullName=" + fullName + ", mobileNumber=" + mobileNumber + ", emailId="
				+ emailId + ", username=" + username + ", password=" + password + ", address=" + address
				+ ", annualIncome=" + annualIncome + ", cardType=" + cardType + ", bankName=" + bankName
				+ ", accountNumber=" + accountNumber + ", ifscCode=" + ifscCode + ", aadhaarDoc=" + aadhaarDoc + "]";
	}
	
	
	

}

/*user_id number(8) primary key,
fullname varchar2(45) NOT NULL,
phone_number number(10) NOT NULL,
email varchar2(50) NOT NULL,
username varchar2(20)NOT NULL PRIMARY KEY,
password varchar2(25) NOT NULL UNIQUE ,
address varchar2(60) NOT NULL,
annual_income number(8,2) NOT NULL, 
card_type varchar2(12),
bank_name varchar2(30) NOT NULL,
account_number number(12) UNIQUE ,
ifsc_code varchar2(12),
aadhar_document blob*/