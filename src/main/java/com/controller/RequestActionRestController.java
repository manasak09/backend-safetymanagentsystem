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

import com.dao.RequestActionService;

import java.util.*;
import com.model.*;

@RestController
public class RequestActionRestController {
	
	@Autowired
	RequestActionService service;
	
	@GetMapping("/getrequest")
	public List<RequestAction> getAllRequest()
	{
		return service.findAllAction();
	}
	
	@PostMapping("/addrequest")
	public ResponseEntity<?> addRequest(@RequestBody RequestAction action)
	{
		service.addRequest(action);
		return ResponseEntity.status(HttpStatus.OK).body("Request added Sucessfully");
	}
	
	@DeleteMapping("/deleterequest/{id}")
	public ResponseEntity<?> deleteRequest(@PathVariable int id) throws DeleteRequestActionException
	{
		RequestAction action=service.findAction(id);
		if(action==null)
		{
			throw new DeleteRequestActionException(id);
		}
		service.deleteAction(id);
		return ResponseEntity.ok("Request Deleted Succesfully");
		
		}
	@PatchMapping("/editrequest")
	public ResponseEntity<?> editRequest(@RequestBody RequestAction action) throws EditRequestActionException
	{
		service.updateAction(action);
		if(!(action==null))
		{
			throw new EditRequestActionException();
		}
		return ResponseEntity.ok("Request updated sucessfully");
	}
	
}
