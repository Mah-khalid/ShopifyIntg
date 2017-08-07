package com.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Line_item {
	
	private long id;
	private long variant_id;
	private String title;
	private long quantity;
	private String price;
	private long grams;
	private String sku;
	private String variant_title;
	private String vendor;
	private String fulfillment_service;
	private long product_id;
	private boolean requires_shipping;
	private boolean taxable;
	private boolean gift_card;
	private String name;
	private String variant_inventory_management;
	private boolean product_exists;
	private long fulfillable_quantity;
	private String total_discount;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getVariant_id() {
		return variant_id;
	}
	public void setVariant_id(long variant_id) {
		this.variant_id = variant_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public long getGrams() {
		return grams;
	}
	public void setGrams(long grams) {
		this.grams = grams;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getVariant_title() {
		return variant_title;
	}
	public void setVariant_title(String variant_title) {
		this.variant_title = variant_title;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getFulfillment_service() {
		return fulfillment_service;
	}
	public void setFulfillment_service(String fulfillment_service) {
		this.fulfillment_service = fulfillment_service;
	}
	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}
	public boolean isRequires_shipping() {
		return requires_shipping;
	}
	public void setRequires_shipping(boolean requires_shipping) {
		this.requires_shipping = requires_shipping;
	}
	public boolean isTaxable() {
		return taxable;
	}
	public void setTaxable(boolean taxable) {
		this.taxable = taxable;
	}
	public boolean isGift_card() {
		return gift_card;
	}
	public void setGift_card(boolean gift_card) {
		this.gift_card = gift_card;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVariant_inventory_management() {
		return variant_inventory_management;
	}
	public void setVariant_inventory_management(String variant_inventory_management) {
		this.variant_inventory_management = variant_inventory_management;
	}
	public boolean isProduct_exists() {
		return product_exists;
	}
	public void setProduct_exists(boolean product_exists) {
		this.product_exists = product_exists;
	}
	public long getFulfillable_quantity() {
		return fulfillable_quantity;
	}
	public void setFulfillable_quantity(long fulfillable_quantity) {
		this.fulfillable_quantity = fulfillable_quantity;
	}
	public String getTotal_discount() {
		return total_discount;
	}
	public void setTotal_discount(String total_discount) {
		this.total_discount = total_discount;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Line_item [id=").append(id).append(", variant_id=").append(variant_id).append(", title=")
				.append(title).append(", quantity=").append(quantity).append(", price=").append(price)
				.append(", grams=").append(grams).append(", sku=").append(sku).append(", variant_title=")
				.append(variant_title).append(", vendor=").append(vendor).append(", fulfillment_service=")
				.append(fulfillment_service).append(", product_id=").append(product_id).append(", requires_shipping=")
				.append(requires_shipping).append(", taxable=").append(taxable).append(", gift_card=").append(gift_card)
				.append(", name=").append(name).append(", variant_inventory_management=")
				.append(variant_inventory_management).append(", product_exists=").append(product_exists)
				.append(", fulfillable_quantity=").append(fulfillable_quantity).append(", total_discount=")
				.append(total_discount).append("]");
		return builder.toString();
	}
}