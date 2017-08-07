package com.app.main;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.stereotype.Component;

import com.app.dao.ProductDao;
import com.app.db.Product;
import com.app.util.ShopifyHelper;

@Component
public class ApplicationEventListener implements org.springframework.context.ApplicationListener<ApplicationReadyEvent>{
	
	@Autowired
	private ShopifyHelper shopifyHelper; 
	@Autowired
	private ProductDao productDao;
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationEventListener.class); 
	
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		LOGGER.info("Starting product fetch process from shopify");
		List<Product> products = shopifyHelper.fetchAllProducts();
		if(products != null){
			productDao.deleteAll();
			productDao.save(products);
			LOGGER.info("Products saved successfully in db");
		}
	}

}
