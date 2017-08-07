package com.app.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.db.Order;
import com.app.model.ApiResponse;
import com.app.model.OrderViewWrapper;
import com.app.service.OrderService;

@RestController
@RequestMapping("/order")
@PreAuthorize("isAuthenticated()")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ApiResponse createOrder(@RequestBody OrderViewWrapper orderViewWrapper){
		ApiResponse apiResponse = new ApiResponse();
		Order order = orderService.createOrder(orderViewWrapper);
		if(order != null){
			apiResponse.setIsSuccess(true);
			apiResponse.setData(order);
		}
		else{
			apiResponse.setIsSuccess(false);
			apiResponse.setError(Collections.singletonList("Failed to place order, please try again"));
		}
		return apiResponse;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Page<Order> getProducts(@RequestParam(name="page", required=false, defaultValue="0") int page,
			@RequestParam(name="size", required=false, defaultValue="20") int size){
		return orderService.getAllOrder(page, size);
	}
}
