package com.finnovative.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Entity
@Component

public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="u1")
	@SequenceGenerator(name="u1",sequenceName="users_se",allocationSize=1)
	@Column(name="user_id")
	private int userId;
	@Column(name="fullName")
	private String fullName;
	@Column(name="phone_number")
	private String mobileNumber;
	@Column(name="email")
	private String emailId;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="address")
	private String address;
	@Column(name="annual_Income")
	private double annualIncome;
	@Column(name="card_Type")
	private String cardType;
	@Column(name="bank_Name")
	private String bankName;
	@Column(name="account_Number")
	private long accountNumber;
	@Column(name="ifsc_Code")
	private String ifscCode;
	@Column(name="verified")
	private String verified;
	@Column(name="approved")
	private String approved;
	@Column(name="aadhar_Document")
	private String aadhaarDoc;
	/*@OneToOne(mappedBy="user",cascade=CascadeType.ALL)
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
	}*/
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Users(int userId, String fullName, String mobileNumber, String emailId, String username, String password,
			String address, double annualIncome, String cardType, String bankName, long accountNumber, String ifscCode,
			String verified, String approved, String aadhaarDoc) {
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
		this.verified = verified;
		this.approved = approved;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
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
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
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
	
	
	public String getVerified() {
		return verified;
	}

	public void setVerified(String verified) {
		this.verified = verified;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", fullName=" + fullName + ", mobileNumber=" + mobileNumber + ", emailId="
				+ emailId + ", username=" + username + ", password=" + password + ", address=" + address
				+ ", annualIncome=" + annualIncome + ", cardType=" + cardType + ", bankName=" + bankName
				+ ", accountNumber=" + accountNumber + ", ifscCode=" + ifscCode + ", verified=" + verified
				+ ", approved=" + approved + ", aadhaarDoc=" + aadhaarDoc + "]";
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