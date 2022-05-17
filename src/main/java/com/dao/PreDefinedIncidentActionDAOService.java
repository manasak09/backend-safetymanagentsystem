package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import com.model.PreDefinedIncidentAction;

@Service
public class PreDefinedIncidentActionDAOService {
	@Autowired
	PreDefinedIncidentActionDAO PreDefinedIncidentActionDAOImpl;
	public void addPreDefinedIncident(PreDefinedIncidentAction action) {
		Object requestforactiondaoimpl;
		//requestforactiondaoimpl.addRequest(action);
	}
	public PreDefinedIncidentActionDAOService findPreDefinedIncident(int id) {
		PreDefinedIncidentActionDAOService predefinedincidentactionimpl = null;
		return predefinedincidentactionimpl.findPreDefinedIncident(id);
		
	}
	public List<PreDefinedIncidentAction> findAllAction() {
		return ((PreDefinedIncidentActionDAOService) PreDefinedIncidentActionDAOImpl).findAllAction();
	}
	public boolean updatePreDefinedIncident(PreDefinedIncidentActionDAOService action) {
		return PreDefinedIncidentActionDAOImpl.addPreDefinedIncident(action);
	}
	public boolean deletePreDefinedIncident(PreDefinedIncidentActionDAOService action) {
		return PreDefinedIncidentActionDAOImpl.deletePreDefinedIncident(action);
	}
	public void updateAction(PreDefinedIncidentAction action) {
		// TODO Auto-generated method stub
		
	}
	public PreDefinedIncidentAction updateAction(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public void updateAction(Object action) {
		// TODO Auto-generated method stub
		
	}
}