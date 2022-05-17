package com.controller;

public class EditPreDefinedIncidentActionException  extends RuntimeException{
	public EditPreDefinedIncidentActionException() {
		super("edited as per requirments");
	}
	public String toString() {
		return "edited as per requirments" ;
	}

}