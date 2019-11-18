package com.finnovative.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Component
public class Product {

	@Id
	private int productId;
	private String productName;
	private String productDetails;
	private double productPrice;
	private MultipartFile productImage;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(int productId, String productName, String productDetails, double productPrice,
			MultipartFile productImage) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDetails = productDetails;
		this.productPrice = productPrice;
		this.productImage = productImage;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDetails() {
		return productDetails;
	}


	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}


	public double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}


	public MultipartFile getProductImage() {
		return productImage;
	}


	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDetails=" + productDetails
				+ ", productPrice=" + productPrice + ", productImage=" + productImage + "]";
	}
	
	
	
	
	
}

/*product_id number(5) Primary Key,
product_name varchar2(40) NOT NULL,
product_desc varchar2(100),
product_price number(10,3) NOT NULL,
product_img blob,
transaction one to many*/