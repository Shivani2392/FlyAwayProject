package com.flightbooking.entities;

public class UserRegistrationPojo {
	
	 
	Integer iPhoneNo;
	String SFullName;
	String Email;
	String Password;
	
	
	public Integer getsPhoneNo() {
		return iPhoneNo;
	}


	public void setsPhoneNo(Integer sPhoneNo) {
		this.iPhoneNo = sPhoneNo;
	}


	public String getSFullName() {
		return SFullName;
	}


	public void setSFullName(String sFullName) {
		SFullName = sFullName;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public UserRegistrationPojo() {
		
		
	}
	
	
	

}
