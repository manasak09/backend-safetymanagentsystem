package com.controller;

public class LoginPreDefinedIncidentActionException extends RuntimeException {
	public LoginPreDefinedIncidentActionException() {
		super("Report is Missing Required Credentials");
	}
public String toString() {
	return "Report is Missing Required Credentials";
	
}
}