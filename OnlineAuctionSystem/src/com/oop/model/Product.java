package com.oop.model;

import java.sql.Time;

public class Product {
	
	int productID;
	int userID;
	String productName;
	int categoryID;
	String brand;
	String description;
	double startingBid;
	String time;
	String image;
	String email;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productID, int userID, String productName, int categoryID, String brand, String description,
			double startingBid, String time, String image, String email) {
		super();
		this.productID = productID;
		this.userID = userID;
		this.productName = productName;
		this.categoryID = categoryID;
		this.brand = brand;
		this.description = description;
		this.startingBid = startingBid;
		this.time = time;
		this.image = image;
		this.email = email;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getStartingBid() {
		return startingBid;
	}

	public void setStartingBid(double startingBid) {
		this.startingBid = startingBid;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
	
	
	
}
