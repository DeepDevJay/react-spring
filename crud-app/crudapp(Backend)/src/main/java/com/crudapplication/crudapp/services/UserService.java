package com.crudapplication.crudapp.services;

import java.util.List;

import com.crudapplication.crudapp.model.User;

public interface UserService {
	
	public List<User> getUsers();
	
	public User getUser(long userId);
	
	public User addUser(User user);
	
	public User updateUser(User user);
	
	public User deleteUser(long userId);
}
