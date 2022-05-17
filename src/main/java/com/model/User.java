package com.model;
import javax.persistence.*;
@Entity
@Table(name="UserTable")
public class User {
@Id

private String userEmail;
private String password;
private String role;
public User() {
	super();
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}



}
