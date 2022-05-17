package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class IncidentCentreExceptionHandler {
	@ExceptionHandler(DeleteIncidentCentreException.class)
	public ResponseEntity<?> handleDeleteException(DeleteIncidentCentreException e,WebRequest requ)
	{
		return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(LogIncidentCentreException.class)
	public ResponseEntity<?> handleLogException(LogIncidentCentreException e1, WebRequest requ1)
	{
		return new ResponseEntity<>(e1.toString(),HttpStatus.NO_CONTENT);
	}
	
	@ExceptionHandler(EditIncidentCentreException.class)
	public ResponseEntity<?> handleDeleteException(EditIncidentCentreException e2, WebRequest requ2)
	{
		return new ResponseEntity<>(e2.toString(), HttpStatus.NO_CONTENT);	
	}
}
	
	