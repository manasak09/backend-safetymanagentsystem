package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.PreDefinedIncidentActionDAOService;

import java.util.*;
import com.model.*;

@RestController
public class PreDefinedIncidentActionRestController {
	
	@Autowired
	PreDefinedIncidentActionDAOService service;
	
	@GetMapping("/getincident")
	public List<PreDefinedIncidentAction> getAllIncidents()
	{
		return service.findAllAction();
	}
	
	@PostMapping("/logincident")
	public ResponseEntity<?> addIncident(@RequestBody PreDefinedIncidentAction action) throws LoginPreDefinedIncidentActionException
	{
		service.addPreDefinedIncident(action);
		return ResponseEntity.status(HttpStatus.OK).body("Incident added Sucessfully");
	}
	
	@DeleteMapping("/deleteincident/{id}")
	public ResponseEntity<?> deleteIncident(@PathVariable int id) throws DeletePreDefinedIncidentActionException
	{
		PreDefinedIncidentAction centre=service.updateAction(id);
		if(centre==null)
		{
			throw new DeletePreDefinedIncidentActionException(id);
		}
		service.updateAction(id);
		return ResponseEntity.ok("Incident Deleted Succesfully");
		
	}
	
	@PatchMapping("/editincident")
	public ResponseEntity<?> editIncident(@RequestBody PreDefinedIncidentAction action) throws EditPreDefinedIncidentActionException
	{
		{
			throw new EditPreDefinedIncidentActionException();
		}
	}
	
}