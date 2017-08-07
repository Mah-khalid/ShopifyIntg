package com.app.db;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Order")
public class Order {
	
	@Id
	private String id;
	private long shopifyId;
	private long customerId;
	private List<Long> shopifyVariantIds;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getShopifyId() {
		return shopifyId;
	}
	public void setShopifyId(long shopifyId) {
		this.shopifyId = shopifyId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public List<Long> getShopifyVariantIds() {
		return shopifyVariantIds;
	}
	public void setShopifyVariantIds(List<Long> shopifyVariantIds) {
		this.shopifyVariantIds = shopifyVariantIds;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [id=").append(id).append(", shopifyId=").append(shopifyId).append(", customerId=")
				.append(customerId).append(", shopifyVariantIds=").append(shopifyVariantIds).append("]");
		return builder.toString();
	}
}
