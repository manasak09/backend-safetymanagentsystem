package com.controller;

public class EditInjuryCentreException  extends RuntimeException{
	public EditInjuryCentreException() {
		super("edited as per requirments");
	}
	public String toString() {
		return "edited as per requirments" ;
	}

}
