package com.finnovative.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(value="prototype")
public class EmiCard {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cardNo_seq")
	@SequenceGenerator(name="cardNo_seq", sequenceName="emiCardNo_seq",allocationSize=1000)
	private long cardNumber;
	private String cardType;
	private Date validityStart;
	private Date validityExp;
	private double totalCredit;
	private double creditUsed;
	private double remainingCredit;
	//private int userId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
	private Users user;

	public EmiCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmiCard(String cardType, Date validityStart, Date validityExp, double totalCredit, double creditUsed,
			double remainingCredit, int userId) {
		super();
		this.cardType = cardType;
		this.validityStart = validityStart;
		this.validityExp = validityExp;
		this.totalCredit = totalCredit;
		this.creditUsed = creditUsed;
		this.remainingCredit = remainingCredit;
		
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Date getValidityStart() {
		return validityStart;
	}

	public void setValidityStart(Date validityStart) {
		this.validityStart = validityStart;
	}

	public Date getValidityExp() {
		return validityExp;
	}

	public void setValidityExp(Date validityExp) {
		this.validityExp = validityExp;
	}

	public double getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(double totalCredit) {
		this.totalCredit = totalCredit;
	}

	public double getCreditUsed() {
		return creditUsed;
	}

	public void setCreditUsed(double creditUsed) {
		this.creditUsed = creditUsed;
	}

	public double getRemainingCredit() {
		return remainingCredit;
	}

	public void setRemainingCredit(double remainingCredit) {
		this.remainingCredit = remainingCredit;
	}

	

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "EmiCard [cardNumber=" + cardNumber + ", cardType=" + cardType + ", validityStart=" + validityStart
				+ ", validityExp=" + validityExp + ", totalCredit=" + totalCredit + ", creditUsed=" + creditUsed
				+ ", remainingCredit=" + remainingCredit + ", userId="  + ", user=" + user + "]";
	}
	
	

}
