package com.controller;

public class DeleteRequestActionException extends RuntimeException {
	
	private int id;
	public  DeleteRequestActionException(int id) {
		
	super("id "+id+" not found");
	this.id=id;
}

@Override
public String toString() {
	return "id "+ id +" not available";
}

}