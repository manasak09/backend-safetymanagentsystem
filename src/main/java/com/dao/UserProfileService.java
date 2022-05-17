package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.UserProfileDetails;

@Service
public class UserProfileService {
	@Autowired
	UserProfileDAO userDAOImpl;

	public void add(UserProfileDetails profile) {
		userDAOImpl.addProfile(profile);
		
	}
	public UserProfileDetails find(String useremail) {
		return userDAOImpl.findProfile(useremail);
	}
	public List<UserProfileDetails> findAll(){
		return userDAOImpl.findAllProfile();
	}
	public boolean update(UserProfileDetails profile) {
		return userDAOImpl.updateProfile(profile);
	}
	public boolean delete(String useremail) {
		return userDAOImpl.deleteProfile(useremail);
	}

}
