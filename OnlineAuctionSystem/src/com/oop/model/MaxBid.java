package com.oop.model;

public class MaxBid {
	
	
	private int bidId;
	private String userName;
	private double bidPrice;
	private double InitPrice;
	private int productId;
	
	public MaxBid() {
		// TODO Auto-generated constructor stub
	}

	public MaxBid(int bidId, String userName, double bidPrice, double initPrice, int productId) {
		super();
		this.bidId = bidId;
		this.userName = userName;
		this.bidPrice = bidPrice;
		InitPrice = initPrice;
		this.productId = productId;
	}

	public int getBidId() {
		return bidId;
	}

	public void setBidId(int bidId) {
		this.bidId = bidId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}

	public double getInitPrice() {
		return InitPrice;
	}

	public void setInitPrice(double initPrice) {
		InitPrice = initPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	

	
	
	
	
}
