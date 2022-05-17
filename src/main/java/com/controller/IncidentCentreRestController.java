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

import com.dao.IncidentCentreService;

import java.util.*;
import com.model.*;

@RestController
public class IncidentCentreRestController {
	
	@Autowired
	IncidentCentreService service;
	
	@GetMapping("/getincidents")
	public List<IncidentCentre> getAllIncidents()
	{
		return service.findAllCentre();
	}
	
	@PostMapping("/logincidents")
	public ResponseEntity<?> addIncident(@RequestBody IncidentCentre centre) throws LogIncidentCentreException
	{
		service.addIncident(centre);
		return ResponseEntity.status(HttpStatus.OK).body("Incident added Sucessfully");
	}
	
	@DeleteMapping("/deleteincidents/{id}")
	public ResponseEntity<?> deleteIncident(@PathVariable int id) throws DeleteIncidentCentreException
	{
		IncidentCentre centre=service.findCentre(id);
		if(centre==null)
		{
			throw new DeleteIncidentCentreException(id);
		}
		service.deleteCentre(id);
		return ResponseEntity.ok("Incident Deleted Succesfully");
		
	}
	
	@PatchMapping("/editincidents")
	public ResponseEntity<?> editIncident(@RequestBody IncidentCentre centre) throws EditIncidentCentreException
	{
		service.updateCentre(centre);
		if(!(centre==null))
		{
			throw new EditIncidentCentreException();
		}
		return ResponseEntity.ok("Incident updated sucessfully");
	}
	
}