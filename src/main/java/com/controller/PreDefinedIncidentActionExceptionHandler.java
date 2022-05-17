package com.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class PreDefinedIncidentActionExceptionHandler {
	@ExceptionHandler(DeletePreDefinedIncidentActionException.class)
	public ResponseEntity<?> handleDeleteException(DeletePreDefinedIncidentActionException e,WebRequest requ)
	{
		return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(LoginPreDefinedIncidentActionException.class)
	public ResponseEntity<?> handleLogException(LoginPreDefinedIncidentActionException e1, WebRequest requ1)
	{
		return new ResponseEntity<>(e1.toString(),HttpStatus.NO_CONTENT);
	}
	
	@ExceptionHandler(EditPreDefinedIncidentActionException.class)
	public ResponseEntity<?> handleDeleteException(EditPreDefinedIncidentActionException e2, WebRequest requ2)
	{
		return new ResponseEntity<>(e2.toString(), HttpStatus.NO_CONTENT);	
	}
	
	@ExceptionHandler(ReviewPreDefinedIncidentActionException.class)
	public ResponseEntity<?> handleReviewException(ReviewPreDefinedIncidentActionException e3, WebRequest requ2)
	{
		return new ResponseEntity<>(e3.toString(), HttpStatus.NO_CONTENT);	
	}
}