package com.controller;

import java.util.List;

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

import com.dao.UserService;
import com.model.User;

@RestController
public class UserRestController {
	@Autowired
	UserService service;
	@CrossOrigin("*")
	@GetMapping("/getuser")
	public List<User>findAllUser(){
		return service.findAll();		
	}
	@CrossOrigin("*")
	@PostMapping("/addusers")
	public String addUser(@RequestBody User user) {
		service.add(user);
		return"user added successfully";		
	}
	@CrossOrigin("*")
	@PatchMapping("/updateuser")
	public ResponseEntity<?> updateItem(@RequestBody User user){
		service.update(user);
		return ResponseEntity.status(HttpStatus.OK).body("user Updated");	
	}
	@CrossOrigin("*")
	@DeleteMapping("/deleteuser/{userEmail}")
	public ResponseEntity<?>deleteItem(@PathVariable String userEmail){
		User user=service.find(userEmail);
		service.deleteUser(userEmail);
		return ResponseEntity.ok("deleted user");
	}
	@CrossOrigin("*")
	@GetMapping("/finduser/{userEmail}")
	public  User findUser(@PathVariable String userEmail){
		User user=service.find(userEmail);
		return service.find(userEmail);
	}
}
