package com.controller;

public class ReviewInjuryCentreException  extends RuntimeException{
	public ReviewInjuryCentreException() {
		super("Report is empty");
	}

}
