package com.app.util;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Base64Utils;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.app.db.Product;
import com.app.db.User;
import com.app.model.Customer;
import com.app.model.CustomerWrapper;
import com.app.model.Line_item;
import com.app.model.OrderView;
import com.app.model.ShopifyOrder;
import com.app.model.ShopifyOrderResponse;
import com.app.model.ShopifyProductReponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ShopifyHelper {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private ObjectMapper objectMapper;
	@Autowired
	private Environment env;
	private static final Logger LOGGER = LoggerFactory.getLogger(ShopifyHelper.class);

	private String buildAuthorizationHeader(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(env.getProperty("shopify_api_key"))
						.append(':')
						.append(env.getProperty("shopify_password"));
		return "Basic " + Base64Utils.encodeToString(stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
	}
	
	public Customer createCustomer(User user){
		Customer customer = new Customer();
		customer.setFirst_name(user.getFirstName());
		customer.setLast_name(user.getLastName());
		customer.setEmail(user.getUsername());
		customer.setVerified_email(true);
		customer.setSend_email_welcome(true);
		customer.setPassword(user.getPassword());
		customer.setPassword_confirmation(user.getPassword());
		/*customer.setPhone("1234567890");
		
		Addresse address = new Addresse();
		address.setAddress1("dfadfa");
		address.setCity("jdladf");
		address.setCountry("CA");
		address.setPhone("1234567890");
		address.setFirst_name(user.getFirstName());
		address.setLast_name(user.getLastName());
		address.setZip("123 ABC");
		address.setProvince("ON");
		customer.setAddresses(Collections.singletonList(address));
		*/
		CustomerWrapper customerWrapper = new CustomerWrapper();
		customerWrapper.setCustomer(customer);
		
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", buildAuthorizationHeader());
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<String> requestEntity = new HttpEntity<String>(objectMapper.writeValueAsString(customerWrapper), headers);
			String url = String.format(env.getProperty("shopify_url"), "admin/customers.json");
			ResponseEntity<CustomerWrapper> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, CustomerWrapper.class);
			if(responseEntity.hasBody()){
				customerWrapper = responseEntity.getBody();
				if (customerWrapper != null) {
					LOGGER.info("Customer created successfully in shopify");
					return customerWrapper.getCustomer();
				}
				else
					LOGGER.error("Body is null in create customer api call");
			}
		} catch(HttpStatusCodeException codeException){
			LOGGER.error(codeException.getResponseBodyAsString());
		}
		catch (RestClientException clientException) {
			clientException.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		LOGGER.error("Unable to create customer in shopify");
		return null;
	}
	
	public List<Product> fetchAllProducts() {
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", buildAuthorizationHeader());
			HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
			String url = String.format(env.getProperty("shopify_url"), "admin/products.json");
			ResponseEntity<ShopifyProductReponse> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, ShopifyProductReponse.class);
			if(responseEntity.hasBody()){
				ShopifyProductReponse productResponse = responseEntity.getBody();
				if (productResponse != null) {
					LOGGER.info("Shopify products fetched successfully");
					return productResponse.getProducts();
				}
				else
					LOGGER.error("Body is null in get all products api call");
			}
		} catch (RestClientException clientException) {
			clientException.printStackTrace();
		}
		LOGGER.error("Unable to fetch shopify products");
		return null;
	}
	
	public ShopifyOrder createOrder(long customerId, List<OrderView> orders){
		try {
			Customer customer = new Customer();
			customer.setId(customerId);
			ShopifyOrder shopifyOrder = new ShopifyOrder();
			shopifyOrder.setCustomer(customer);
			shopifyOrder.setFinancial_status("pending");
			List<Line_item> line_items = new ArrayList<Line_item>(orders.size());
			for(OrderView orderView : orders){
				Line_item line_item = new Line_item();
				line_item.setVariant_id(orderView.getVariant_id());
				line_item.setQuantity(orderView.getQuantity());
				line_items.add(line_item);
			}
			shopifyOrder.setLine_items(line_items);
			ShopifyOrderResponse shopifyOrderResponse = new ShopifyOrderResponse();
			shopifyOrderResponse.setOrder(shopifyOrder);
			
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", buildAuthorizationHeader());
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<String> requestEntity = new HttpEntity<String>(objectMapper.writeValueAsString(shopifyOrderResponse), headers);
			String url = String.format(env.getProperty("shopify_url"), "admin/orders.json");
			ResponseEntity<ShopifyOrderResponse> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, ShopifyOrderResponse.class);
			if(responseEntity.hasBody()){
				shopifyOrderResponse = responseEntity.getBody();
				if (shopifyOrderResponse != null) {
					LOGGER.info("Order created successfully in shopify");
					return shopifyOrderResponse.getOrder();
				}
				else
					LOGGER.error("Body is null in create order api call");
			}
		} catch(HttpStatusCodeException codeException){
			LOGGER.error(codeException.getResponseBodyAsString());
		}
		catch (RestClientException clientException) {
			clientException.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		LOGGER.error("Unable to create customer in shopify");
		return null;
	}
}