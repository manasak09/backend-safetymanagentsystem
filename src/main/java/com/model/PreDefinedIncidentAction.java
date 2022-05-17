package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class PreDefinedIncidentAction {
	@Id
	@NotNull
	private int id;
	@NotNull
	@Size(min=3,max=20)
	private String personName;
	
	@NotNull
    @Size(min=10,max=400)
	private  String personAddress;
	
	@Size(min=10,max=11)
	private int mobile;

	public PreDefinedIncidentAction() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}



}