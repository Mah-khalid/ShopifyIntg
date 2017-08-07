package com.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Addresse {
	
	public  Long id;
	public  Long customer_id;
	public  String first_name;
	public  String last_name;
	public  String address1;
	public  String city;
	public  String province;
	public  String country;
	public  String zip;
	public  String phone;
	public  String name;
	public  String province_code;
	public  String country_code;
	public  String country_name;
	public  Boolean _default;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
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
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProvince_code() {
		return province_code;
	}
	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public Boolean get_default() {
		return _default;
	}
	public void set_default(Boolean _default) {
		this._default = _default;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Addresse [id=").append(id).append(", customer_id=").append(customer_id).append(", first_name=")
				.append(first_name).append(", last_name=").append(last_name).append(", address1=").append(address1)
				.append(", city=").append(city).append(", province=").append(province).append(", country=")
				.append(country).append(", zip=").append(zip).append(", phone=").append(phone).append(", name=")
				.append(name).append(", province_code=").append(province_code).append(", country_code=")
				.append(country_code).append(", country_name=").append(country_name).append(", _default=")
				.append(_default).append("]");
		return builder.toString();
	}
}