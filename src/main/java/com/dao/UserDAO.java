package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.User;
@Repository
public interface UserDAO {
	public void addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(String userEmail);
	public User findUser(String userEmail);
	public List<User>findAllUsers();

}
