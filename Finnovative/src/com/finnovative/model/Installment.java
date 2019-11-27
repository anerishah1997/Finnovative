package com.finnovative.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component

public class Installment {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator= "installment_sequence")
	@SequenceGenerator(name="installment_sequence", sequenceName="installment_sequence",allocationSize=1)
	private long installmentId;
	private int installmentNo;
	@Temporal(TemporalType.DATE)
	private Date datePaid;
	@Temporal(TemporalType.DATE)
	private Date dueDate;
	private String installmentStatus;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emino")
	private EmiPlan emiplan;

	public Installment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Installment(long installmentId, int installmentNo, Date datePaid, Date dueDate, String installmentStatus) {
		super();
		this.installmentId = installmentId;
		this.installmentNo = installmentNo;
		this.datePaid = datePaid;
		this.dueDate = dueDate;
		this.installmentStatus = installmentStatus;
	}

	public long getInstallmentId() {
		return installmentId;
	}

	public void setInstallmentId(long installmentId) {
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

	
	public String getInstallmentStatus() {
		return installmentStatus;
	}

	public void setInstallmentStatus(String installmentStatus) {
		this.installmentStatus = installmentStatus;
	}

	public EmiPlan getEmiplan() {
		return emiplan;
	}

	public void setEmiplan(EmiPlan emiplan) {
		this.emiplan = emiplan;
	}

	@Override
	public String toString() {
		return "Installment [installmentId=" + installmentId + ", installmentNo=" + installmentNo + ", datePaid="
				+ datePaid + ", dueDate=" + dueDate + ", installmentStatus=" + installmentStatus + ", emiplan="
				+ emiplan + "]";
	}

	

	
	
	

}
