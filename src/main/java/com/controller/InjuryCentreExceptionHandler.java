package com.controller;

import javax.validation.ConstraintViolationException;

import org.hibernate.StaleStateException;
import org.postgresql.util.PSQLException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class InjuryCentreExceptionHandler {
	@ExceptionHandler(DeleteInjuryCentreException.class)
	public ResponseEntity<?> handleDeleteException(DeleteInjuryCentreException e,WebRequest requ){
		return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
	
		
	}
@ExceptionHandler(LogInjuryCentreException.class)

public ResponseEntity<?> handleLogException1(LogInjuryCentreException e1,WebRequest requ1){
	return new ResponseEntity<>(e1.toString(),HttpStatus.NO_CONTENT);
}

@ExceptionHandler(PSQLException.class)
public ResponseEntity<?> handleLogException(PSQLException e1,WebRequest requ1){
	return new ResponseEntity<>("invalid query",HttpStatus.BAD_REQUEST);
}
@ExceptionHandler(ConstraintViolationException.class)
public ResponseEntity<?> handleLogException(ConstraintViolationException e1,WebRequest requ1){
	return new ResponseEntity<>("wrong values",HttpStatus.BAD_REQUEST);
}

@ExceptionHandler(StaleStateException.class)
public ResponseEntity<?> handleEditException(StaleStateException e1,WebRequest requ1){
	return new ResponseEntity<>("invalid query",HttpStatus.BAD_REQUEST);
}


@ExceptionHandler(EditInjuryCentreException.class)
public ResponseEntity<?> handleDeleteException(EditInjuryCentreException e2,WebRequest requ3){
	return new ResponseEntity<>(e2.toString(),HttpStatus.BAD_REQUEST);
}
@ExceptionHandler(ReviewInjuryCentreException.class)
public ResponseEntity<?> handleReviewException(ReviewInjuryCentreException e3,WebRequest requ3){
	return new ResponseEntity<>(e3.toString(),HttpStatus.BAD_REQUEST);
}
}
