package com.flightbooking.pojo;

public class AdminRegistration {
	
	public String AdminName;
	public String AdminPassword;
	public String Email;
	
	
	public AdminRegistration(String adminName, String adminPassword, String email) {
		super();
		AdminName = adminName;
		AdminPassword = adminPassword;
		Email = email;
	}
	public AdminRegistration() {
		
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getAdminPassword() {
		return AdminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		AdminPassword = adminPassword;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "AdminRegistration [AdminName=" + AdminName + ", AdminPassword=" + AdminPassword + ", Email=" + Email
				+ "]";
	}
	
	

}
