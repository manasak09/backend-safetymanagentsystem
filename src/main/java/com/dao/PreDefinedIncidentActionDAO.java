package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.PreDefinedIncidentAction;



@Repository
public interface PreDefinedIncidentActionDAO {
	public boolean addPreDefinedIncident(PreDefinedIncidentActionDAOService action);
	public PreDefinedIncidentAction findPreDefinedIncident(int id);
	public List<PreDefinedIncidentAction> findAllPreDefinedIncidentAction();
	public boolean updatePreDefinedIncidentAction(PreDefinedIncidentAction action);
	public boolean deletePreDefinedIncidentAction(PreDefinedIncidentAction action);
	List<PreDefinedIncidentAction> findAllPreDefinedIncident();
	boolean deletePreDefinedIncident(PreDefinedIncidentActionDAOService action);
	void addPreDefinedIncident(PreDefinedIncidentAction action);
	
	

}
