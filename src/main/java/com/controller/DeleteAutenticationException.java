package com.controller;

public class DeleteAutenticationException extends RuntimeException {
private int id;
public DeleteAutenticationException(int id) {
	super("Id="+id+"is not present to delete");
	this.id=id;
}
 public String toString() {
	return "Id="+id+"is not present to delete";
	
}
}
