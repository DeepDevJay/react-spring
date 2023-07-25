package com.crudapplication.crudapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapplication.crudapp.model.User;

public interface UserDao extends JpaRepository<User, Long> {
	
}
