package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserProfileService;
import com.model.UserProfileDetails;

@RestController
public class ProfileRestController {
	@Autowired
	UserProfileService service;
	
	

	@CrossOrigin("*")
	 @GetMapping("/findAll")
	 public List<UserProfileDetails> findAllUsert() 
	   
	   { 
		 
		  return  service.findAll();
		   
	   }
	 @CrossOrigin("*")
	 @PostMapping("/addProfile")
	   public String addProfile(@RequestBody UserProfileDetails profile) 
	   {
		 
		 service.add(profile);
			return "profile added sucessfully";
	   }
	 @CrossOrigin("*")
	 @DeleteMapping("/deleteProfile/{useremail}")
	   public ResponseEntity<?> deleteProfile(@PathVariable String useremail)
 
	   {
		  UserProfileDetails p1 =service.find(useremail);
		
		     	   service.delete(useremail);   
		      return ResponseEntity.ok("Profile deleted successfully");
	   }
	   @CrossOrigin("*")
	  @GetMapping("/findprofile/{useremail}")
	  public ResponseEntity<?> findProfile(@PathVariable String useremail)
	  {
		  UserProfileDetails s1=service.find(useremail);
		 
		  service.find(s1.getUseremail());
		  return ResponseEntity.ok("Profile  is found");
	  }
	  
	  
	@CrossOrigin("*")
	 @PatchMapping("/updateProfile")

	   public String updateUser(@RequestBody UserProfileDetails profile) {
		   service.update(profile);
		   return "updated user successfully";
		   
	   }

}
