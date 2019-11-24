package com.finnovative.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Installment {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator= "installment_seq")
	@SequenceGenerator(name="installment_seq", sequenceName="installment_seq",allocationSize=1000)
	private long installmentId;
	private int installmentNo;
	private Date paidDate;
	private Date dueDate;
	private String status;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emino")
	private EmiPlan emiplan;

	public Installment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Installment(long installmentId, int installmentNo, Date paidDate, Date dueDate, String status) {
		super();
		this.installmentId = installmentId;
		this.installmentNo = installmentNo;
		this.paidDate = paidDate;
		this.dueDate = dueDate;
		this.status = status;
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

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public EmiPlan getEmiplan() {
		return emiplan;
	}

	public void setEmiplan(EmiPlan emiplan) {
		this.emiplan = emiplan;
	}

	@Override
	public String toString() {
		return "Installment [installmentId=" + installmentId + ", installmentNo=" + installmentNo + ", paidDate="
				+ paidDate + ", dueDate=" + dueDate + ", status=" + status + ", emiplan=" + emiplan + "]";
	}
	
	

}
