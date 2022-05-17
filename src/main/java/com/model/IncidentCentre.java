package com.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class IncidentCentre {
	@Id
	@GeneratedValue
	
	private int incidentId;
	
@ManyToOne
private Reports reports;
  
	@NotNull
    @Size(min=1,max=100)
	private String incidentName;
	
	
    @Size(min=2,max=3)
	private String anyInjuries;
	
	
    @Size(min=3,max=100)
	private String injuryDescription;
	
	

	public IncidentCentre() {
		super();
	}

	public int getIncidentId() {
		return incidentId;
	}

	public void setIncidentId(int incidentId) {
		this.incidentId = incidentId;
	}


	public String getIncidentName() {
		return incidentName;
	}

	public void setIncidentName(String incidentName) {
		this.incidentName = incidentName;
	}

	public String getAnyInjuries() {
		return anyInjuries;
	}

	public void setAnyInjuries(String anyInjuries) {
		this.anyInjuries = anyInjuries;
	}

	public String getInjuryDescription() {
		return injuryDescription;
	}

	public void setInjuryDescription(String injuryDescription) {
		this.injuryDescription = injuryDescription;
	}

	public Reports getReports() {
		return reports;
	}

	public void setReports(Reports reports) {
		this.reports = reports;
	}

	

}
