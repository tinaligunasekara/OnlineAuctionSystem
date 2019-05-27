package com.oop.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDBConnection {

	private static Connection conn;
	
	public static Connection getConnection()  {
		
	
		//mama methanin exception eka throws karanne nathiwa catch statement eka dala catch karaganno
		
		if(conn==null) {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineAuctionSystemDB","root","MySQL");
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return conn;
	}
}
