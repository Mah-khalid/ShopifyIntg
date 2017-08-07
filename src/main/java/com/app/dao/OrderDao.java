package com.app.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.db.Order;

public interface OrderDao extends MongoRepository<Order, String>{
	
	public Page<Order> findByCustomerId(long customerId, Pageable pageable);
}
