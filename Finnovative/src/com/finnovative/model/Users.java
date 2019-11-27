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
	private int userId;
	private String fullName;
	private String mobileNumber;
	private String email;
	private String username;
	private String password;
	private String address;
	private double annualIncome;
	private String cardType;
	private String bankName;
	private long accountNumber;
	private String ifscCode;
	private String status;
	private String aadharDoc;
	
	@OneToOne(mappedBy="user")
	private EmiCard emicard;
	
	@OneToMany(mappedBy="user")
	private Set<EmiPlan> emiplans;
	
	
	
	
	public Set<EmiPlan> getEmiplans() {
		return emiplans;
	}
	public void setEmiplans(Set<EmiPlan> emiplans) {
		this.emiplans = emiplans;
	}
	public EmiCard getEmicard() {
		return emicard;
	}
	public void setEmicard(EmiCard emicard) {
		this.emicard = emicard;
	}
	
	public Users() {
		super();
		
	}
	public Users(int userId, String fullName, String mobileNumber, String email, String username, String password,
			String address, double annualIncome, String cardType, String bankName, long accountNumber, String ifscCode,
			String status, String aadharDoc) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.username = username;
		this.password = password;
		this.address = address;
		this.annualIncome = annualIncome;
		this.cardType = cardType;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.status = status;
		this.aadharDoc = aadharDoc;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAadharDoc() {
		return aadharDoc;
	}
	public void setAadharDoc(String aadharDoc) {
		this.aadharDoc = aadharDoc;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", fullName=" + fullName + ", mobileNumber=" + mobileNumber + ", email="
				+ email + ", username=" + username + ", password=" + password + ", address=" + address
				+ ", annualIncome=" + annualIncome + ", cardType=" + cardType + ", bankName=" + bankName
				+ ", accountNumber=" + accountNumber + ", ifscCode=" + ifscCode + ", status=" + status + ", aadharDoc="
				+ aadharDoc + "]";
	}
	
	
	
	
	

	
	
	
	

}
