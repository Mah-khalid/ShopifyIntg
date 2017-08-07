package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.app.util.ShopifyHelper;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class AppConfig {
	
	@Bean
	public ShopifyHelper shopifyHelper(){
		return new ShopifyHelper();
	}
	
	@Bean
	public ObjectMapper objectMapper(){
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		return mapper;
	}
	
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
