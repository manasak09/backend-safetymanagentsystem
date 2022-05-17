package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class RequestAction {
	@Id
	@GeneratedValue
	private int RequestActionid1;
	
	@Size(min=1,max=100)
	private String username;
	
	@NotNull
    @Size(min=1,max=100)
	private  String password;
	
	@Size(min=10,max=11)
	private String mobile;

	
	public RequestAction() 
	{
		super();
	}


	public int getRequestActionid1() {
		return RequestActionid1;
	}


	public void setRequestActionid1(int requestActionid1) {
		RequestActionid1 = requestActionid1;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


}
