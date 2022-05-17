package com.controller;

public class LogIncidentCentreException  extends RuntimeException{
	public LogIncidentCentreException()
	{
		super("Successful");
	}
	public String toString()
	{
		return "Successful";	}

}
