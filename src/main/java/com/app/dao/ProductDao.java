package com.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.db.Product;

public interface ProductDao extends MongoRepository<Product, String>{
	
	
	
}
