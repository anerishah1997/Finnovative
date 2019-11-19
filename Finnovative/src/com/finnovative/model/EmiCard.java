package com.finnovative.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Component
@Entity
public class EmiCard {
	@SequenceGenerator()
	@Id
	private int cardNo;
	private String cardType;
	private Date validityStartDate;
	private Date validityEndDate;
	private String cardStatus;
	private double totalCredit;
	private double creditUsed;
	private double remainingCredit;
	public EmiCard()
	{
		super();	
	}
	@OneToOne()
	Users user;
	public EmiCard(int cardNo, String cardType, Date validityStartDate, Date validityEndDate, String cardStatus, double totalCredit,
			double creditUsed, double remainingCredit) {
		super();
		this.cardNo = cardNo;
		this.cardType = cardType;
		this.validityStartDate = validityStartDate;
		this.validityEndDate = validityEndDate;
		this.cardStatus = cardStatus;
		this.totalCredit = totalCredit;
		this.creditUsed = creditUsed;
		this.remainingCredit = remainingCredit;
	}
	
	
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Date getValidityStartDate() {
		return validityStartDate;
	}
	public void setValidityStartDate(Date validityStartDate) {
		this.validityStartDate = validityStartDate;
	}
	public Date getValidityEndDate() {
		return validityEndDate;
	}
	public void setValidityEndDate(Date validityEndDate) {
		this.validityEndDate = validityEndDate;
	}
	public String getCardStatus() {
		return cardStatus;
	}
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
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
	@Override
	public String toString() {
		return "EmiCard [cardNo=" + cardNo + ", cardType=" + cardType + ", validityStartDate=" + validityStartDate
				+ ", validityEndDate=" + validityEndDate + ", cardStatus=" + cardStatus + ", totalCredit=" + totalCredit
				+ ", creditUsed=" + creditUsed + ", remainingCredit=" + remainingCredit + "]";
	}
	
	
	
	
	

}

/*card_number number(16) primary key,
card_type varchar2(10),
validity_start date,
validity_exp date,
card_status varchar2(20) default 'DEACTIVATED',
total_credit number(8,2) NOT NULL,
credit_used number(8,2),
remaining_credit number(8,2)
user one to one*/