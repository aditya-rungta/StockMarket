package com.example.demo.dto;

public class UserDetailsDto {

	private String userId;
	private String userName;
	private String password;
	private String userType;
	private String email;
	private String mobileNumber;
	private String confirmed;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}
	@Override
	public String toString() {
		return "UserDetailsDto [userId=" + userId + ", userName=" + userName + ", password=" + password + ", userType="
				+ userType + ", email=" + email + ", mobileNumber=" + mobileNumber + ", confirmed=" + confirmed + "]";
	}
	
	
}
