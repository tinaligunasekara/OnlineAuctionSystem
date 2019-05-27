package com.oop.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.oop.model.Payment;

public interface PaymentService {

	boolean addNewPayment(Payment pay)throws SQLException ;
	
	public ArrayList<Payment> getAllPayments() throws SQLException;

	boolean deletePayment(String payId)throws SQLException;

	boolean UpdatePayment(int pID, int postCod, int conNum, String fname, String address, String email, String city, String state, String country, String lname) throws SQLException;


	ArrayList<Payment> searchCID(int id) throws SQLException;

	boolean UpdatePayment(int pID, int postCod, int conNum, String fname, String lname, String address, String email,
			String city, String state, String country, String fax) throws SQLException;


}
