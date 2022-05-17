package com.controller;

public class ReviewPreDefinedIncidentActionException extends RuntimeException{
	public ReviewPreDefinedIncidentActionException()
	{
		super("Done");
	}
	public String toString()
	{
		return "Done";	}


}