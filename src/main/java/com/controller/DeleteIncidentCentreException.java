package com.controller;

public class DeleteIncidentCentreException extends RuntimeException {
	private int id;
	public DeleteIncidentCentreException(int id) {
		
		super("id "+id+" not found");
		this.id=id;
	}

	@Override
	public String toString() {
		return "id "+ id +" not available";
	}

}
