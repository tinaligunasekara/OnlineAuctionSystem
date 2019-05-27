package com.oop.model;

public class Payment {
	private String paymentId;
	private  String firstName;
	private  String lastName;
	private  String address;
	private  String email;
	private  String city;
	private  String state;
	private  String country;
	private int postalCode;
	private  int contactNumber;
	private int fax;
	private  String method;
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(String paymentId,String firstName, String lastName, String address, String email, String city, String state,
			String country, int postalCode, int contactNumber, int fax, String method) {
		super();
		this.paymentId = paymentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
		this.contactNumber = contactNumber;
		this.fax = fax;
		this.method = method;
	}
	

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getFax() {
		return fax;
	}

	public void setFax(int fax) {
		this.fax = fax;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}
	
	
	

}
