package com.app.model;

public class Customer {
	
	private String username;
	private String firstName;
	private String lastName;
	private Integer id;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Customer(String username, String firstName, String lastName, Integer id) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	public Customer() {
		super();
	}
	
	
	

}
