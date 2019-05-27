package com.oop.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.oop.model.Payment;
import com.oop.service.PaymentService;
import com.oop.util.DBConnection;

public class PaymentServiceImpl implements PaymentService {
	
	private static Connection conn;
	
	 public PaymentServiceImpl() {
		 
		 conn = DBConnection.getConnection();
		 
	}

	@Override
	public boolean addNewPayment(Payment pay) throws SQLException {
		
		String sql = "Insert into Payment value(?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stm = conn.prepareStatement(sql);
		stm.setObject(1,0);
		stm.setObject(2, pay.getFirstName());
		stm.setObject(3, pay.getLastName());
		stm.setObject(4, pay.getAddress());
		stm.setObject(5, pay.getEmail());
		stm.setObject(6, pay.getCity());
		stm.setObject(7, pay.getState());
		stm.setObject(8, pay.getCountry());
		stm.setObject(9, pay.getPostalCode());
		stm.setObject(10, pay.getContactNumber());
		stm.setObject(11, pay.getFax());
		stm.setObject(12, pay.getMethod());
		
		int res = stm.executeUpdate();
		
		return res>0;
		
	}

	@Override
	public ArrayList<Payment> getAllPayments() throws SQLException {
		
		String sql = "Select * from Payment";
		Statement stm = conn.createStatement();
		ResultSet rst = stm.executeQuery(sql);
		ArrayList<Payment> payList = new ArrayList<Payment>();
		
		while(rst.next()) {
			Payment pay = new Payment();
			
			pay.setPaymentId(rst.getString("paymentID"));
			pay.setFirstName(rst.getString("firstName"));
			pay.setLastName(rst.getString("lastName"));
			pay.setAddress(rst.getString("address"));
			pay.setEmail(rst.getString("email"));
			pay.setCity(rst.getString("city"));
			pay.setState(rst.getString("state"));
			pay.setCountry(rst.getString("country"));
			pay.setPostalCode(rst.getInt("postalCode"));
			pay.setContactNumber(rst.getInt("contactNumber"));
			pay.setFax(rst.getInt("fax"));
			pay.setMethod(rst.getString("method"));
			
			payList.add(pay);
		}
		

		return payList;
	}
	
	@Override
	public boolean deletePayment(String payId) throws SQLException {
		
		String sql = "Delete from Payment where PaymentId='"+payId+"'";
		Statement stm = conn.createStatement();
		return stm.executeUpdate(sql) >0;
		
	}
	
//	@Override
//	public boolean UpdatePayment(int pID, int postCod, int conNum)throws SQLException {
//		
//		//String payId;
//		String sql = "Update Payment set postalCode='"+postCod+"', contactNumber='"+conNum+"' where paymentID ='"+pID+"'";
//				
//		Statement stm =conn.createStatement();
//		
//		return stm.executeUpdate(sql)>0;
//	}
	
	@Override
	public ArrayList<Payment> searchCID(int id) throws SQLException {
		
		String sql = "Select * from Payment where paymentID='"+id+"' ";
		Statement stm = conn.createStatement();
		ResultSet rst = stm.executeQuery(sql);
		ArrayList<Payment> payList = new ArrayList<Payment>();
		
		while(rst.next()) {
			Payment pay = new Payment();
			
			pay.setPaymentId(rst.getString("paymentID"));
			pay.setFirstName(rst.getString("firstName"));
			pay.setLastName(rst.getString("lastName"));
			pay.setAddress(rst.getString("address"));
			pay.setEmail(rst.getString("email"));
			pay.setCity(rst.getString("city"));
			pay.setState(rst.getString("state"));
			pay.setCountry(rst.getString("country"));
			pay.setPostalCode(rst.getInt("postalCode"));
			pay.setContactNumber(rst.getInt("contactNumber"));
			pay.setFax(rst.getInt("fax"));
			pay.setMethod(rst.getString("method"));
			
			payList.add(pay);
		}
		

		return payList;
	}

	@Override
	public boolean UpdatePayment(int pID, int postCod, int conNum, String fname,String lname, String address, String email,
			String city, String state, String country,String fax) throws SQLException {
		
		String sql = "Update Payment set postalCode='"+postCod+"', contactNumber='"+conNum+"', firstName='"+fname+"', lastName='"+lname+"',address='"+address+"', email='"+email+"', city='"+city+"',state='"+state+"',country='"+country+"',fax='"+fax+"' where paymentID ='"+pID+"'";
				
		
		
		Statement stm =conn.createStatement();
		
		return stm.executeUpdate(sql)>0;
	}

	@Override
	public boolean UpdatePayment(int pID, int postCod, int conNum, String fname, String address, String email,
			String city, String state, String country, String lname) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	

}
