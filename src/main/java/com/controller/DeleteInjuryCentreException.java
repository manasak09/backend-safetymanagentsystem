package com.controller;

public class DeleteInjuryCentreException  extends RuntimeException{
	private int id;
	public DeleteInjuryCentreException(int id) {
		super("Reort With ID:"+id+"is not present to delete");
		this.id=id;
	}
public String toString() {
	
	return "Reort With ID:"+id+"is not present to delete";}
}
