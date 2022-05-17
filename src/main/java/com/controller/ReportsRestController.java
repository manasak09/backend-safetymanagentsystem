package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ReportsService;
import com.dao.RequestActionService;
import com.model.Reports;
import com.model.RequestAction;

@RestController
public class ReportsRestController {
	@Autowired
	ReportsService service;
	@GetMapping("/viewreports")
	public List<Reports> getAllReports(){
		return service.findAllReports();
		
	}
@PostMapping("/reportbuilder")
public ResponseEntity<?> addReports(@RequestBody Reports reports){
	service.addReports(reports);
	return ResponseEntity.status( HttpStatus.OK).body("report builded ");

}
@DeleteMapping("/deletereports{id}")
public ResponseEntity<?> deleteReports(@PathVariable int id){
	service.findReports(id);
	
	service.deleteReports(id);
	return ResponseEntity.status(HttpStatus .OK).body("report deleted");
}
@PostMapping("/updatesreports")
public ResponseEntity<?> updatereports(@RequestBody Reports reports){
	service.updateReports(reports);
	return ResponseEntity.status(HttpStatus.OK).body("report updated");
}
}