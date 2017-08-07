package com.app.model;

import java.util.List;

public class OrderViewWrapper {
	
	private List<OrderView> orders;

	public List<OrderView> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderView> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderViewWrapper [orders=").append(orders).append("]");
		return builder.toString();
	}
}
