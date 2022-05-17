package com.controller;

public class LogRequestActionException extends RuntimeException {
	public LogRequestActionException()
	{
		super("Logged in");
	}
	public String toString()
	{
		return "Logged in";	}

}