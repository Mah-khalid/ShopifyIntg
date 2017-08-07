package com.app.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Customer {

	private Long id;
	private String email;
	private Boolean accepts_marketing;
	private String created_at;
	private String updated_at;
	private String first_name;
	private String last_name;
	private Long orders_count;
	private String state;
	private String total_spent;
	private String last_order_id;
	private String note;
	private Boolean verified_email;
	private String multipass_identifier;
	private Boolean tax_exempt;
	private String phone;
	private String tags;
	private String last_order_name;
	private List<Addresse> addresses;
	private Addresse default_address;
	private String password;
	private String password_confirmation;
	private Boolean send_email_welcome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getAccepts_marketing() {
		return accepts_marketing;
	}

	public void setAccepts_marketing(Boolean accepts_marketing) {
		this.accepts_marketing = accepts_marketing;
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

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Long getOrders_count() {
		return orders_count;
	}

	public void setOrders_count(Long orders_count) {
		this.orders_count = orders_count;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTotal_spent() {
		return total_spent;
	}

	public void setTotal_spent(String total_spent) {
		this.total_spent = total_spent;
	}

	public String getLast_order_id() {
		return last_order_id;
	}

	public void setLast_order_id(String last_order_id) {
		this.last_order_id = last_order_id;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Boolean getVerified_email() {
		return verified_email;
	}

	public void setVerified_email(Boolean verified_email) {
		this.verified_email = verified_email;
	}

	public String getMultipass_identifier() {
		return multipass_identifier;
	}

	public void setMultipass_identifier(String multipass_identifier) {
		this.multipass_identifier = multipass_identifier;
	}

	public Boolean getTax_exempt() {
		return tax_exempt;
	}

	public void setTax_exempt(Boolean tax_exempt) {
		this.tax_exempt = tax_exempt;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getLast_order_name() {
		return last_order_name;
	}

	public void setLast_order_name(String last_order_name) {
		this.last_order_name = last_order_name;
	}

	public List<Addresse> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Addresse> addresses) {
		this.addresses = addresses;
	}

	public Addresse getDefault_address() {
		return default_address;
	}

	public void setDefault_address(Addresse default_address) {
		this.default_address = default_address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword_confirmation() {
		return password_confirmation;
	}

	public void setPassword_confirmation(String password_confirmation) {
		this.password_confirmation = password_confirmation;
	}

	public Boolean getSend_email_welcome() {
		return send_email_welcome;
	}

	public void setSend_email_welcome(Boolean send_email_welcome) {
		this.send_email_welcome = send_email_welcome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=").append(id).append(", email=").append(email).append(", accepts_marketing=")
				.append(accepts_marketing).append(", created_at=").append(created_at).append(", updated_at=")
				.append(updated_at).append(", first_name=").append(first_name).append(", last_name=").append(last_name)
				.append(", orders_count=").append(orders_count).append(", state=").append(state)
				.append(", total_spent=").append(total_spent).append(", last_order_id=").append(last_order_id)
				.append(", note=").append(note).append(", verified_email=").append(verified_email)
				.append(", multipass_identifier=").append(multipass_identifier).append(", tax_exempt=")
				.append(tax_exempt).append(", phone=").append(phone).append(", tags=").append(tags)
				.append(", last_order_name=").append(last_order_name).append(", addresses=").append(addresses)
				.append(", default_address=").append(default_address).append(", password=").append(password)
				.append(", password_confirmation=").append(password_confirmation).append(", send_email_welcome=")
				.append(send_email_welcome).append("]");
		return builder.toString();
	}
}