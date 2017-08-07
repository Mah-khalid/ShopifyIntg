package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.app.dao.ProductDao;
import com.app.db.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public Page<Product> getAllProducts(int page, int size){
		return productDao.findAll(new PageRequest(page, size));
	}
}
