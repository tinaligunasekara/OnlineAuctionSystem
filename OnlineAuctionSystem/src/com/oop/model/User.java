package com.oop.model;

public class User {
	private int userId;
	private String UserName;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String gender;
	private String mobile;
	private String position;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	


	public User(int userId, String userName, String fname, String lname, String email, String password, String gender,
			String mobile, String position) {
		super();
		this.userId = userId;
		UserName = userName;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.mobile = mobile;
		this.position = position;
	}





	public String getPosition() {
		return position;
	}





	public void setPosition(String position) {
		this.position = position;
	}





	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		this.UserName = userName;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	
	
}
