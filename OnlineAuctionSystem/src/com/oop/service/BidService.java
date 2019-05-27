package com.oop.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.oop.model.Bid;
import com.oop.model.MaxBid;

public interface BidService {
	
	public boolean addBidSecond(Bid bb) throws SQLException ;

	boolean addNewBid(Bid b1) throws SQLException;
	
	public ArrayList<Bid> getAllBids() throws SQLException;
	
	public MaxBid getAllBids1() throws SQLException;
	
	public ArrayList<Bid> getBidDetails(String parameter) throws SQLException;

	public boolean deleteBid(String bidID) throws SQLException;

	

	public int searchBidId(int productID,int userID)throws SQLException;

	public boolean UpdateBid(int parseInt, double parseDouble)throws SQLException    ;

	public double getprice(String bidID) throws SQLException;
}
