package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.db.Product;
import com.app.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Page<Product> getProducts(@RequestParam(name="page", required=false, defaultValue="0") int page,
			@RequestParam(name="size", required=false, defaultValue="20") int size){
		return productService.getAllProducts(page, size);
	}
}
