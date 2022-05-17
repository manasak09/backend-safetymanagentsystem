package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.User;
@Service
public class UserService {
	@Autowired
	UserDAO userDAOImpl;
	public void add(User user)
	{
		userDAOImpl.addUser(user);
	}
	
	public User find(String userEmail)
	{
		 return userDAOImpl.findUser(userEmail);
	}
	
	public List<User> findAll()
	{
		return userDAOImpl.findAllUsers();
	}
	
	
	public boolean update(User user)
	{
  return userDAOImpl.updateUser(user);		
 	}
	
	
	public boolean deleteUser(String userEmail)
	{
		 return userDAOImpl.deleteUser(userEmail);
	}
	

}
