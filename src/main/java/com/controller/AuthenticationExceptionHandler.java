package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
@ControllerAdvice
public class AuthenticationExceptionHandler {
	@ExceptionHandler(DeleteAutenticationException.class)
	public ResponseEntity<?> handleDeleteException(DeleteAutenticationException e,WebRequest requ){
		return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
		
	}


}
