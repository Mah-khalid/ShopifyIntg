package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.app.dao.OrderDao;
import com.app.db.Order;
import com.app.db.User;
import com.app.model.Line_item;
import com.app.model.OrderView;
import com.app.model.OrderViewWrapper;
import com.app.model.ShopifyOrder;
import com.app.util.ShopifyHelper;

@Service
@PreAuthorize("isAuthenticated()")
public class OrderService {
	
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private ShopifyHelper shopifyHelper;
	
	public Page<Order> getAllOrder(int page, int size){
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return orderDao.findByCustomerId(user.getCustomerId(), new PageRequest(page, size));
	}
	
	public Order createOrder(OrderViewWrapper orderViewWrapper){
		List<OrderView> orders = orderViewWrapper.getOrders();
		if(orders != null){
			User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			ShopifyOrder shopifyOrder = shopifyHelper.createOrder(user.getCustomerId(), orders);
			if(shopifyOrder != null){
				Order order = new Order();
				order.setCustomerId(user.getCustomerId());
				order.setShopifyId(shopifyOrder.getId());
				List<Long> shopifyVariantIds = new ArrayList<Long>(shopifyOrder.getLine_items().size());
				for(Line_item line_item : shopifyOrder.getLine_items()){
					shopifyVariantIds.add(line_item.getId());
				}
				order.setShopifyVariantIds(shopifyVariantIds);
				return orderDao.save(order);
			}
		}
		return null;
	}
}
