package com.finnovative.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class EmiPlan {

	@Id
	private int emiNo;
	private Date startDate;
	private Date endDate;
	private int noOfMonths;
	private String emiStatus;
	private double emiAmount;
	public EmiPlan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmiPlan(int emiNo, Date startDate, Date endDate, int noOfMonths, String emiStatus, double emiAmount) {
		super();
		this.emiNo = emiNo;
		this.startDate = startDate;
		this.endDate = endDate;
		this.noOfMonths = noOfMonths;
		this.emiStatus = emiStatus;
		this.emiAmount = emiAmount;
	}
	public int getEmiNo() {
		return emiNo;
	}
	public void setEmiNo(int emiNo) {
		this.emiNo = emiNo;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getNoOfMonths() {
		return noOfMonths;
	}
	public void setNoOfMonths(int noOfMonths) {
		this.noOfMonths = noOfMonths;
	}
	public String getEmiStatus() {
		return emiStatus;
	}
	public void setEmiStatus(String emiStatus) {
		this.emiStatus = emiStatus;
	}
	public double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}
	@Override
	public String toString() {
		return "EmiPlan [emiNo=" + emiNo + ", startDate=" + startDate + ", endDate=" + endDate + ", noOfMonths="
				+ noOfMonths + ", emiStatus=" + emiStatus + ", emiAmount=" + emiAmount + "]";
	}
	
	
	
	
}

/*EMI_NO NUMBER(10) Primary Key,

start_date date,
end_date date,
no_of_months number,
emi_status varchar2(10),
emi_amount number(10,3),*/