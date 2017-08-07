package com.app.model;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ShopifyOrder {
	private long id;
	private String email;
	private String closed_at;
	private String created_at;
	private String updated_at;
	private long number;
	private String note;
	private String token;
	private String gateway;
	private boolean test;
	private String total_price;
	private String subtotal_price;
	private String total_weight;
	private String total_tax;
	private boolean taxes_included;
	private String currency;
	private String financial_status;
	private boolean confirmed;
	private String total_discounts;
	private String total_line_items_price;
	private String cart_token;
	private boolean buyer_accepts_marketing;
	private String name;
	private String referring_site;
	private String landing_site;
	private String cancelled_at;
	private String cancel_reason;
	private String total_price_usd;
	private String checkout_token;
	private String reference;
	private String user_id;
	private String location_id;
	private String source_identifier;
	private String source_url;
	private String processed_at;
	private String device_id;
	private String phone;
	private String customer_locale;
	private String browser_ip;
	private String landing_site_ref;
	private long order_number;
	private String discount_codes[];
	private String note_attributes[];
	private String payment_gateway_names[];
	private String processing_method;
	private String checkout_id;
	private String source_name;
	private String fulfillment_status;
	private String tax_lines[];
	private String tags;
	private String contact_email;
	private String order_status_url;
	private List<Line_item> line_items;
	private Customer customer;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getClosed_at() {
		return closed_at;
	}
	public void setClosed_at(String closed_at) {
		this.closed_at = closed_at;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getGateway() {
		return gateway;
	}
	public void setGateway(String gateway) {
		this.gateway = gateway;
	}
	public boolean isTest() {
		return test;
	}
	public void setTest(boolean test) {
		this.test = test;
	}
	public String getTotal_price() {
		return total_price;
	}
	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}
	public String getSubtotal_price() {
		return subtotal_price;
	}
	public void setSubtotal_price(String subtotal_price) {
		this.subtotal_price = subtotal_price;
	}
	public String getTotal_weight() {
		return total_weight;
	}
	public void setTotal_weight(String total_weight) {
		this.total_weight = total_weight;
	}
	public String getTotal_tax() {
		return total_tax;
	}
	public void setTotal_tax(String total_tax) {
		this.total_tax = total_tax;
	}
	public boolean isTaxes_included() {
		return taxes_included;
	}
	public void setTaxes_included(boolean taxes_included) {
		this.taxes_included = taxes_included;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getFinancial_status() {
		return financial_status;
	}
	public void setFinancial_status(String financial_status) {
		this.financial_status = financial_status;
	}
	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	public String getTotal_discounts() {
		return total_discounts;
	}
	public void setTotal_discounts(String total_discounts) {
		this.total_discounts = total_discounts;
	}
	public String getTotal_line_items_price() {
		return total_line_items_price;
	}
	public void setTotal_line_items_price(String total_line_items_price) {
		this.total_line_items_price = total_line_items_price;
	}
	public String getCart_token() {
		return cart_token;
	}
	public void setCart_token(String cart_token) {
		this.cart_token = cart_token;
	}
	public boolean isBuyer_accepts_marketing() {
		return buyer_accepts_marketing;
	}
	public void setBuyer_accepts_marketing(boolean buyer_accepts_marketing) {
		this.buyer_accepts_marketing = buyer_accepts_marketing;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReferring_site() {
		return referring_site;
	}
	public void setReferring_site(String referring_site) {
		this.referring_site = referring_site;
	}
	public String getLanding_site() {
		return landing_site;
	}
	public void setLanding_site(String landing_site) {
		this.landing_site = landing_site;
	}
	public String getCancelled_at() {
		return cancelled_at;
	}
	public void setCancelled_at(String cancelled_at) {
		this.cancelled_at = cancelled_at;
	}
	public String getCancel_reason() {
		return cancel_reason;
	}
	public void setCancel_reason(String cancel_reason) {
		this.cancel_reason = cancel_reason;
	}
	public String getTotal_price_usd() {
		return total_price_usd;
	}
	public void setTotal_price_usd(String total_price_usd) {
		this.total_price_usd = total_price_usd;
	}
	public String getCheckout_token() {
		return checkout_token;
	}
	public void setCheckout_token(String checkout_token) {
		this.checkout_token = checkout_token;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getLocation_id() {
		return location_id;
	}
	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}
	public String getSource_identifier() {
		return source_identifier;
	}
	public void setSource_identifier(String source_identifier) {
		this.source_identifier = source_identifier;
	}
	public String getSource_url() {
		return source_url;
	}
	public void setSource_url(String source_url) {
		this.source_url = source_url;
	}
	public String getProcessed_at() {
		return processed_at;
	}
	public void setProcessed_at(String processed_at) {
		this.processed_at = processed_at;
	}
	public String getDevice_id() {
		return device_id;
	}
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCustomer_locale() {
		return customer_locale;
	}
	public void setCustomer_locale(String customer_locale) {
		this.customer_locale = customer_locale;
	}
	public String getBrowser_ip() {
		return browser_ip;
	}
	public void setBrowser_ip(String browser_ip) {
		this.browser_ip = browser_ip;
	}
	public String getLanding_site_ref() {
		return landing_site_ref;
	}
	public void setLanding_site_ref(String landing_site_ref) {
		this.landing_site_ref = landing_site_ref;
	}
	public long getOrder_number() {
		return order_number;
	}
	public void setOrder_number(long order_number) {
		this.order_number = order_number;
	}
	public String[] getDiscount_codes() {
		return discount_codes;
	}
	public void setDiscount_codes(String[] discount_codes) {
		this.discount_codes = discount_codes;
	}
	public String[] getNote_attributes() {
		return note_attributes;
	}
	public void setNote_attributes(String[] note_attributes) {
		this.note_attributes = note_attributes;
	}
	public String[] getPayment_gateway_names() {
		return payment_gateway_names;
	}
	public void setPayment_gateway_names(String[] payment_gateway_names) {
		this.payment_gateway_names = payment_gateway_names;
	}
	public String getProcessing_method() {
		return processing_method;
	}
	public void setProcessing_method(String processing_method) {
		this.processing_method = processing_method;
	}
	public String getCheckout_id() {
		return checkout_id;
	}
	public void setCheckout_id(String checkout_id) {
		this.checkout_id = checkout_id;
	}
	public String getSource_name() {
		return source_name;
	}
	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}
	public String getFulfillment_status() {
		return fulfillment_status;
	}
	public void setFulfillment_status(String fulfillment_status) {
		this.fulfillment_status = fulfillment_status;
	}
	public String[] getTax_lines() {
		return tax_lines;
	}
	public void setTax_lines(String[] tax_lines) {
		this.tax_lines = tax_lines;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getContact_email() {
		return contact_email;
	}
	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}
	public String getOrder_status_url() {
		return order_status_url;
	}
	public void setOrder_status_url(String order_status_url) {
		this.order_status_url = order_status_url;
	}
	public List<Line_item> getLine_items() {
		return line_items;
	}
	public void setLine_items(List<Line_item> line_items) {
		this.line_items = line_items;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShopifyOrder [id=").append(id).append(", email=").append(email).append(", closed_at=")
				.append(closed_at).append(", created_at=").append(created_at).append(", updated_at=").append(updated_at)
				.append(", number=").append(number).append(", note=").append(note).append(", token=").append(token)
				.append(", gateway=").append(gateway).append(", test=").append(test).append(", total_price=")
				.append(total_price).append(", subtotal_price=").append(subtotal_price).append(", total_weight=")
				.append(total_weight).append(", total_tax=").append(total_tax).append(", taxes_included=")
				.append(taxes_included).append(", currency=").append(currency).append(", financial_status=")
				.append(financial_status).append(", confirmed=").append(confirmed).append(", total_discounts=")
				.append(total_discounts).append(", total_line_items_price=").append(total_line_items_price)
				.append(", cart_token=").append(cart_token).append(", buyer_accepts_marketing=")
				.append(buyer_accepts_marketing).append(", name=").append(name).append(", referring_site=")
				.append(referring_site).append(", landing_site=").append(landing_site).append(", cancelled_at=")
				.append(cancelled_at).append(", cancel_reason=").append(cancel_reason).append(", total_price_usd=")
				.append(total_price_usd).append(", checkout_token=").append(checkout_token).append(", reference=")
				.append(reference).append(", user_id=").append(user_id).append(", location_id=").append(location_id)
				.append(", source_identifier=").append(source_identifier).append(", source_url=").append(source_url)
				.append(", processed_at=").append(processed_at).append(", device_id=").append(device_id)
				.append(", phone=").append(phone).append(", customer_locale=").append(customer_locale)
				.append(", browser_ip=").append(browser_ip).append(", landing_site_ref=").append(landing_site_ref)
				.append(", order_number=").append(order_number).append(", discount_codes=")
				.append(Arrays.toString(discount_codes)).append(", note_attributes=")
				.append(Arrays.toString(note_attributes)).append(", payment_gateway_names=")
				.append(Arrays.toString(payment_gateway_names)).append(", processing_method=").append(processing_method)
				.append(", checkout_id=").append(checkout_id).append(", source_name=").append(source_name)
				.append(", fulfillment_status=").append(fulfillment_status).append(", tax_lines=")
				.append(Arrays.toString(tax_lines)).append(", tags=").append(tags).append(", contact_email=")
				.append(contact_email).append(", order_status_url=").append(order_status_url).append(", line_items=")
				.append(line_items).append(", customer=").append(customer).append("]");
		return builder.toString();
	}
}