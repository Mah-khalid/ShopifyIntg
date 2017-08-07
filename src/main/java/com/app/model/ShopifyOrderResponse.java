package com.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ShopifyOrderResponse {
	
    private ShopifyOrder order;

	public ShopifyOrder getOrder() {
		return order;
	}

	public void setOrder(ShopifyOrder order) {
		this.order = order;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderResponse [order=").append(order).append("]");
		return builder.toString();
	}

}