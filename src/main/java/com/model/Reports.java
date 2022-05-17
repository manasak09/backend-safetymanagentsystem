package com.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class Reports {
	@Id
	@GeneratedValue
	private int reportId;
	
     @OneToMany(mappedBy = "injuryId")
	List<InjuryCentre> injurycentrelist;
     
     @OneToMany(mappedBy = "incidentId")
     List<IncidentCentre> incidentcentrelist;
     
	@Size(min=3,max=20)
	private String personName;
	
	
	@Size(min=3,max=300)
	private  String incidentName;
	
	@Size(min=3,max=200)
	private String jobDescription;
	
	  @JsonFormat(pattern="dd-mm-yyyy")
	    private Date reportStartDate;
	  
	  @JsonFormat(pattern="dd-mm-yyyy")
	    private Date reportEndtDate;
	  
	  @Size(min=2,max=600)  
	  private String userReport;

	public Reports() {
		super();
	}


	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}


	public String getIncidentName() {
		return incidentName;
	}

	public void setIncidentName(String incidentName) {
		this.incidentName = incidentName;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public Date getReportStartDate() {
		return reportStartDate;
	}

	public void setReportStartDate(Date reportStartDate) {
		this.reportStartDate = reportStartDate;
	}

	public Date getReportEndtDate() {
		return reportEndtDate;
	}

	public void setReportEndtDate(Date reportEndtDate) {
		this.reportEndtDate = reportEndtDate;
	}

	public String getUserReport() {
		return userReport;
	}

	public void setUserReport(String userReport) {
		this.userReport = userReport;
	}
	public int getReportId() {
		return reportId;
	}


	public void setReportId(int reportId) {
		this.reportId = reportId;
	}


	public List<InjuryCentre> getInjurycentrelist() {
		return injurycentrelist;
	}


	public void setInjurycentrelist(List<InjuryCentre> injurycentrelist) {
		this.injurycentrelist = injurycentrelist;
	}


	public List<IncidentCentre> getIncidentcentrelist() {
		return incidentcentrelist;
	}


	public void setIncidentcentrelist(List<IncidentCentre> incidentcentrelist) {
		this.incidentcentrelist = incidentcentrelist;
	}
  
	  
}
