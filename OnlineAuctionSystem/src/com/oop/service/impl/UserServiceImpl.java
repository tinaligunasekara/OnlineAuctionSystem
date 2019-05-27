package com.oop.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.oop.model.User;
import com.oop.service.UserService;
import com.oop.util.DBConnection;

public class UserServiceImpl implements UserService {

	Connection conn;
	public UserServiceImpl() {
		
		conn=DBConnection.getConnection();
	}
	@Override
	public User LoginFunction(String userName, String password) throws SQLException {
		
		String sql2 ="select * from user where User_name='"+userName+"' && Password='"+password+"'";
		System.out.println("SQL2"+sql2);
		Statement statement= conn.createStatement();
		ResultSet rst2 = statement.executeQuery(sql2);
		
		User user = new User();
		
		if(rst2.next()) {
			
			user.setUserId(Integer.parseInt(rst2.getString("USER_ID")));
			user.setUserName(rst2.getString("User_name"));
			user.setPosition(rst2.getString("position"));
			user.setFname(rst2.getString("first_name"));
			user.setLname(rst2.getString("last_name"));
			user.setGender(rst2.getString("gender"));
			user.setEmail(rst2.getString("email"));
			user.setMobile(rst2.getString("mobile"));
			user.setPassword(rst2.getString("password"));
		}
		
		
		return user;
	}
	
	
	@Override
	public boolean addNewUser(User u1) throws SQLException {
		String sql = "Insert into User Values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement stm = conn.prepareStatement(sql);
		//PrepareStatement stm = conn.prepareStatement(sql);
		stm.setObject(1,0);
		stm.setObject(2,u1.getUserName());
		stm.setObject(3, u1.getFname());
		stm.setObject(4, u1.getLname());
		stm.setObject(5, u1.getGender());
		stm.setObject(6, u1.getEmail());
		stm.setObject(7, u1.getMobile());
		stm.setObject(8, u1.getPassword());
		stm.setObject(9, u1.getPosition());
		int res = stm.executeUpdate();
		return false;
	}
	
	
	public ArrayList<User> getAllUsers() throws SQLException{
		
		String sql ="select * from user";
		System.out.println(sql);
		Statement stm = conn.createStatement();
		ResultSet rst = stm.executeQuery(sql);
		ArrayList<User> userList = new ArrayList<User>();
		System.out.println("qqqqqqqqqqqqqqqq");
		
		while(rst.next()) {
			
			
			User u1 = new User();
			u1.setUserId(Integer.parseInt(rst.getString("USER_ID")));
			u1.setUserName(rst.getString("User_name"));
			u1.setFname(rst.getString("first_name"));
			u1.setLname(rst.getString("last_name"));
			u1.setGender(rst.getString("gender"));
			u1.setEmail(rst.getString("email"));
			u1.setMobile(rst.getString("mobile"));
			u1.setPassword(rst.getString("password"));
			
			userList.add(u1);
			System.out.println(u1);
		}
		
		return userList;
	
	}
	@Override
	public boolean deleteUser(String userID) throws SQLException {
		
		String sql = "delete from user where USER_ID='"+userID+"'";
		System.out.println(sql);
		Statement stm = conn.createStatement();
		return stm.executeUpdate(sql)>0;
	}
	@Override
	public boolean updateUser(User u2) throws SQLException {
		String sql = " update user set User_name='"+u2.getUserName()+"',first_name='"+u2.getFname()+"',last_name='"+u2.getLname()+"',gender='"+u2.getGender()+"',email='"+u2.getEmail()+"' ,mobile='"+u2.getMobile()+"',password='"+u2.getPassword()+"' where USER_ID='"+u2.getUserId()+"' ";
		 Statement st = conn.createStatement();
		 
		return st.executeUpdate(sql)>0;
		
	}
	
	
	

}
