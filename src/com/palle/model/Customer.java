package com.palle.model;

public class Customer 
{
	private int id;
	private String name ;
	private String email ;
	private Long mobile;
	private String passord;
	private String state;
	public Customer(String name, String email, Long mobile, String passord, String state) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.passord = passord;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getPassord() {
		return passord;
	}
	public void setPassord(String passord) {
		this.passord = passord;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
