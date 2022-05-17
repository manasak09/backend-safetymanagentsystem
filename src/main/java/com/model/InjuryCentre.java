package com.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class InjuryCentre {
	@Id
	@GeneratedValue
	
	private int injuryId;
	

	
	
	@ManyToOne
	private Reports reports;
	
	@NotNull
	@Size(min=3,max=20)
	private String personName;
	
	
    @Size(min=3,max=400)
	private  String personAddress;
	
    @JsonFormat(pattern="dd-mm-yyyy")
    private Date injuryDate;
    
 
	
	@Size(min=10,max=11)
	private String mobile;
	
	public InjuryCentre() {
		super();
	}

	public int getInjuryId() {
		return injuryId;
	}

	public void setInjuryId(int injuryId) {
		this.injuryId = injuryId;
	}

	public Date getInjuryDate() {
		return injuryDate;
	}

	public void setInjuryDate(Date injuryDate) {
		this.injuryDate = injuryDate;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	
	public Reports getReports() {
		return reports;
	}

	public void setReports(Reports reports) {
		this.reports = reports;
	}



}
