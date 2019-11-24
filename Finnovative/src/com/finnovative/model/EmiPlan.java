package com.finnovative.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Component
@Entity
public class EmiPlan {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="emino_seq")
	@SequenceGenerator(name="emino_seq", sequenceName="emino_seq", allocationSize=1)
	private int emino;
	private Date startDate;
	private Date endDate;
	private int noOfMonths;
	private double emiAmount;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
	private Users user;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="productid")
	private Product product;
	
	@OneToMany(mappedBy="emiplan")
	private Set<Installment> installments=new HashSet<>();

	public EmiPlan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmiPlan(int emino, Date startDate, Date endDate, int noOfMonths, double emiAmount) {
		super();
		this.emino = emino;
		this.startDate = startDate;
		this.endDate = endDate;
		this.noOfMonths = noOfMonths;
		this.emiAmount = emiAmount;
	}

	public int getEmino() {
		return emino;
	}

	public void setEmino(int emino) {
		this.emino = emino;
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

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	
	
	
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "EmiPlan [emino=" + emino + ", startDate=" + startDate + ", endDate=" + endDate + ", noOfMonths="
				+ noOfMonths + ", emiAmount=" + emiAmount + "]";
	}
	
	

}
