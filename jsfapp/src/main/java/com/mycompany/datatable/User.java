package com.mycompany.datatable;

public class User {

	private int userId;
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
		
	public User(int _userId, 
			String _userName, 
			String _firstName, 
			String _lastName, 
			String _email) {
		userId = _userId;
		userName = _userName;
		firstName = _firstName;
		lastName = _lastName;
		email = _email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
