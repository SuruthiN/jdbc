package com.jdbc.servlet.dto;

public class User {
	private String UserName;
	private String Email;
	private String password;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
	}
	public User(String userName, String email, String password) {
		super();
		UserName = userName;
		Email = email;
		this.password = password;
	}
}
