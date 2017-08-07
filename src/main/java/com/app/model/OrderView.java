package com.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class OrderView {

	private long variant_id;
	private int quantity;
	
	public long getVariant_id() {
		return variant_id;
	}
	public void setVariant_id(long variant_id) {
		this.variant_id = variant_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderView [variant_id=").append(variant_id).append(", quantity=").append(quantity).append("]");
		return builder.toString();
	}
}
