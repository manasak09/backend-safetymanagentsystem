package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class UserProfileDetails {
	  @Id
		@Email()
		
		private String useremail;
	   
		private String firstname;	
		private String lastname;
		
		private String mobileNo;
		private String password;
		private String conpassword;
	 @JsonFormat(pattern="dd-mm-yyyy")
		private String dob;
		
		
	
			
		


		public String getUseremail() {
			return useremail;
		}


		public void setUseremail(String useremail) {
			this.useremail = useremail;
		}


		public String getFirstname() {
			return firstname;
		}


		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}


		public String getLastname() {
			return lastname;
		}


		public void setLastname(String lastname) {
			this.lastname = lastname;
		}


		public String getMobileNo() {
			return mobileNo;
		}


		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getConpassword() {
			return conpassword;
		}


		public void setConpassword(String conpassword) {
			this.conpassword = conpassword;
		}


		public String getDob() {
			return dob;
		}


		public void setDob(String dob) {
			this.dob = dob;
		}




}
