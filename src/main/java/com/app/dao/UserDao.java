package com.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.db.User;

public interface UserDao extends MongoRepository<User, String>{

	public User findByUsername(String username);
	
}
