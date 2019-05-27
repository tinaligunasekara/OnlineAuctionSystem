package com.oop.service.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.oop.model.Bid;
import com.oop.model.MaxBid;
import com.oop.service.BidService;
import com.oop.util.MyDBConnection;

public class BidServiceImpl implements BidService {

	private static Connection conn;
	
	public BidServiceImpl() {
		conn = MyDBConnection.getConnection();
	}
	
	@Override
	public boolean addNewBid(Bid b1) throws SQLException {
		
		String sql = "INSERT INTO bids VALUES(?,?,?,?,?)";
		PreparedStatement stm = conn.prepareStatement(sql);
		stm.setObject(1,b1.getBidID());
		stm.setObject(2,b1.getUserID());
		stm.setObject(3,b1.getBidInit());
		stm.setObject(4,b1.getBidPrice());
		stm.setObject(5,b1.getpID());
		
		int res = stm.executeUpdate();
		return res>0;
	}

	@Override
	public boolean addBidSecond(Bid bb) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Bid> getAllBids() throws SQLException  {
		String sql = "select* from bids";
		Statement stm = conn.createStatement();
		ResultSet rst = stm.executeQuery(sql);
		ArrayList<Bid> b1List = new ArrayList<Bid>();
		
		while(rst.next()) {
			System.out.println("KKKK");
			Bid b1 = new Bid();
			 
			b1.setBidID(Integer.parseInt(rst.getString("bid_id")));
			b1.setUserID(Integer.parseInt(rst.getString("user_id")));
			b1.setBidInit(Double.parseDouble(rst.getString("bid_init")));
			b1.setBidPrice(Double.parseDouble(rst.getString("bid_price")));
			b1.setpID(Integer.parseInt(rst.getString("p_id")));
			
			b1List.add(b1);
		}
		return b1List;
	}

	@Override
	public ArrayList<Bid> getBidDetails(String parameter) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBid(String bidID) throws SQLException {
		
		String sql = "Delete from bids where bid_id='"+bidID+"'";
		Statement stm = conn.createStatement();
		
		
		return stm.executeUpdate(sql)>0;
	}
	
	

	@Override
	public int searchBidId(int productID, int userID) throws SQLException {
		
		String sql = "select bid_id from bids where p_id='"+productID+"' and user_id='"+userID+"'";
		Statement stm = conn.createStatement();
		ResultSet rst = stm.executeQuery(sql);
		
		int bidID = 6;
		
		while(rst.next()) {
			bidID = Integer.parseInt(rst.getString("bid_id"));
		}
		System.out.println("ggggggggg tin tin"+sql);
		return bidID;
	}

	@Override
	public boolean UpdateBid(int parseInt, double parseDouble) throws SQLException {
		
		String sql ="update bids set bid_price ='"+parseDouble+"' where bid_id='"+parseInt+"'";
		System.out.println("sql"+sql);
		//Update bid set bid_price=1205  where ='"+bidPrice+ "'
				//String SQL = "Update bid set bid_price='" +bidPrice + "'  where ='"+bidPrice+ "'";
		        Statement stm = conn.createStatement();
		        return stm.executeUpdate(sql) > 0;
		
		
		
	}

	@Override
	public MaxBid getAllBids1() throws SQLException {
		String sql = "select bid_id,p_id,user_name,max(bid_price),bid_init from bids b, user u where u.user_id = b.user_id";
		System.out.println(sql);
		Statement stm = conn.createStatement();
		ResultSet rst = stm.executeQuery(sql);
		
		//ArrayList<Bid> b1List = new ArrayList<Bid>();
		MaxBid b4 = new MaxBid();
		while(rst.next()) {
			
			b4.setUserName(rst.getString("user_name"));
			b4.setProductId(Integer.parseInt(rst.getString("p_id")));
			b4.setBidId(Integer.parseInt(rst.getString("bid_id")));
			b4.setBidPrice(Double.parseDouble(rst.getString("max(bid_price)")));
			b4.setBidPrice(Double.parseDouble(rst.getString("bid_init")));
			
		}
		return b4;
	}

	@Override
	public double getprice(String bidID) throws SQLException {
		String sql = " select bid_init from bids where bid_id='"+bidID+" '";
		Statement stm = conn.createStatement();
		ResultSet rst = stm.executeQuery(sql);
		
		double SP=0;
		while(rst.next()) {
		 SP = Double.parseDouble(rst.getString("bid_init"));
		}
		return SP;
	}


	
	


	
	
	
}
