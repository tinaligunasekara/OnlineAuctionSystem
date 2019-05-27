package com.oop.model;

public class Bid {
	private int bidID;
	private int userID;
	private double bidInit;
	private double bidPrice;
	private int pID;
	
	public Bid() {
		
		// TODO Auto-generated constructor stub
	}

	public Bid(int bidID, int userID, double bidInit, double bidPrice, int pID) {
		super();
		this.bidID = bidID;
		this.userID = userID;
		this.bidInit = bidInit;
		this.bidPrice = bidPrice;
		this.pID = pID;
	}

	public int getBidID() {
		return bidID;
	}

	public void setBidID(int bidID) {
		this.bidID = bidID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public double getBidInit() {
		return bidInit;
	}

	public void setBidInit(double bidInit) {
		this.bidInit = bidInit;
	}

	public double getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}

	public int getpID() {
		return pID;
	}

	public void setpID(int pID) {
		this.pID = pID;
	}
	
	

	



	
	
	
	
	
	
}
