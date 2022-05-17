package com.controller;

public class ReviewRequestActionException extends RuntimeException {
	public ReviewRequestActionException()
	{
		super("Done");
	}
	public String toString()
	{
		return "Done";	}

}