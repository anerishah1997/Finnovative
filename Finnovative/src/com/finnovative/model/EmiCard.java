package com.finnovative.model;
import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import org.springframework.stereotype.Component;
@Component
@Entity
public class EmiCard {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	@SequenceGenerator(name="seq",sequenceName="emicardno_seq",allocationSize=442316984)

	private int cardNo;

	private String cardType;
	
	private Date validityStartDate;

	private Date validityEndDate;
	
	private String cardStatus;
	
	private double totalCredit;
	
	private double creditUsed;
	
	private double remainingCredit;

	private int userId;
	public EmiCard()
	{
		super();	
	}
	@OneToOne
	@JoinColumn(name="userId")
	Users user;
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public EmiCard( String cardType, Date validityStartDate, Date validityEndDate, String cardStatus, double totalCredit,
			double creditUsed, double remainingCredit) {
		super();
		Random rng = new Random();
		this.cardNo = 445678924 + rng.nextInt(1000);
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
				+ ", creditUsed=" + creditUsed + ", remainingCredit=" + remainingCredit + ", user=" + user + "]";
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