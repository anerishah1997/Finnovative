package com.finnovative.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Installment {

	@Id
	private  static int installmentId=0;
	private int installmentNo;
	private Date datePaid;
	private Date dueDate;
	private String installmentStatus;
	public String getInstallmentStatus() {
		return installmentStatus;
	}
	public void setInstallmentStatus(String installmentStatus) {
		this.installmentStatus = installmentStatus;
	}
	@ManyToOne
	@JoinColumn(name="emiNo")
	private EmiPlan emiplan;
	public EmiPlan getEmiplan() {
		return emiplan;
	}
	public void setEmiplan(EmiPlan emiplan) {
		this.emiplan = emiplan;
	}
	public Installment() {
		super();
		
	}
	public Installment(int installmentId, int installmentNo, Date datePaid, Date dueDate) {
		super();
		this.installmentId = installmentId++;
		this.installmentNo = installmentNo;
		this.datePaid = datePaid;
		this.dueDate = dueDate;
	}
	public int getInstallmentId() {
		return installmentId;
	}
	public void setInstallmentId(int installmentId) {
		this.installmentId = installmentId;
	}
	public int getInstallmentNo() {
		return installmentNo;
	}
	public void setInstallmentNo(int installmentNo) {
		this.installmentNo = installmentNo;
	}
	public Date getDatePaid() {
		return datePaid;
	}
	public void setDatePaid(Date datePaid) {
		this.datePaid = datePaid;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	@Override
	public String toString() {
		return "Installment [installmentNo=" + installmentNo + ", datePaid=" + datePaid + ", dueDate=" + dueDate
				+ ", installmentStatus=" + installmentStatus + ", emiplan=" + emiplan + "]";
	}
	
	
	
	
}

/*Installment_id number(10) Primary Key,
Installment_no number(10),
Date_paid date,
Due_date date,
Installment_status varchar2(10) 
*/