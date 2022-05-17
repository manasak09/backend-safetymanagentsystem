package com.controller;

public class EditIncidentCentreException extends RuntimeException {
	public EditIncidentCentreException()
	{
		super("Edited");
	}
	public String toString()
	{
		return "Edited";	}


}
