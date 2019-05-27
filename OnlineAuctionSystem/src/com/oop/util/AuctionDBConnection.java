package com.oop.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class AuctionDBConnection{

	private static Connection conn;
	
	public AuctionDBConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getDBConnection() {
		
		if(conn == null) {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineAuctionSystemDB","root","MySQL");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		return conn;
			
	}
}
