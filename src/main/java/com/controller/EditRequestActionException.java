package com.controller;

public class EditRequestActionException extends RuntimeException {
	public EditRequestActionException()
	{
		super("Edited");
	}
	public String toString()
	{
		return "Edited";	}

}
