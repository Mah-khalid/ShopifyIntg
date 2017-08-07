package com.app.db;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection = "User")
public class User implements UserDetails{

	private static final long serialVersionUID = 1L;

	@Id 
	private String id;
	
	@Field("first_name")
	private String firstName;
	
	@Field("last_name")
	private String lastName;
	
	@Indexed()
	@Field("username")
	private String username;
	
	@Field("password")
	@JsonIgnore
	private String password;
	
	@Field("customer_id")
	@JsonIgnore
	private Long customerId;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=").append(id).append(", firstName=").append(firstName).append(", lastName=")
				.append(lastName).append(", username=").append(username).append(", password=").append(password)
				.append(", customerId=").append(customerId).append("]");
		return builder.toString();
	}
	
	@JsonIgnore
	@Transient
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.asList(new SimpleGrantedAuthority("USER"));
	}
	
	@JsonIgnore
	@Transient
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@JsonIgnore
	@Transient
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@JsonIgnore
	@Transient
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@JsonIgnore
	@Transient
	@Override
	public boolean isEnabled() {
		return true;
	}

}
