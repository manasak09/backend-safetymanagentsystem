package com.controller;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.hibernate.StaleStateException;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLUpdate;
import org.postgresql.util.PSQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.InjuryCentreService;
import com.model.InjuryCentre;
@RestController
public class InjuryCentreRestController {
	@Autowired
	InjuryCentreService service;
	@CrossOrigin("*")
	@GetMapping("/injuriesreport")
	public List<InjuryCentre>getAllInjuries(){
		
		return service.findAllCentre();
		
	}
	@CrossOrigin("*")
	@PostMapping("/loginjuries")
	public ResponseEntity<?> addReport(@RequestBody InjuryCentre centre) throws LogInjuryCentreException,PSQLException,ConstraintViolationException{
		
		service.addInjury(centre);
		
			return ResponseEntity.status(HttpStatus.OK).body("report added scucessfully");
		
		
	}
	@CrossOrigin("*")
	@DeleteMapping("/deleteinjuries/{id}")
public ResponseEntity<?>deleteReport(@PathVariable int id) throws DeleteInjuryCentreException{
		InjuryCentre centre=service.findCentre(id);
		if(centre==null) {
			throw new DeleteInjuryCentreException(id);
		}
		service.deleteCentre(id);
		return ResponseEntity.ok("Report deleted sucessfully");
	}
	@CrossOrigin("*")
	@PatchMapping( "/editinjuries")
	public ResponseEntity<?> editReport(@RequestBody InjuryCentre centre) throws EditInjuryCentreException,StaleStateException{
		service.updateCentre(centre);
		if((centre==null)) {
			throw new EditInjuryCentreException();
		}
		return ResponseEntity.ok("Report updated sucessfully");
		
	}
	@CrossOrigin("*")
	@GetMapping("/findinjury/{id}")
	public InjuryCentre findCentre(@PathVariable int id) {
		InjuryCentre centre=service.findCentre(id);
		return service.findCentre(id);
	}
	
}
