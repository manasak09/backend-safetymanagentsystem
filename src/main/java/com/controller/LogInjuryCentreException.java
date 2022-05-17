package com.controller;

public class LogInjuryCentreException extends RuntimeException {
	public LogInjuryCentreException() {
		super("Report is Missing Required Credentials");
	}
public String toString() {
	return "Report is Missing Required Credentials";
	
}
}
