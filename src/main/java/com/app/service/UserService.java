package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.dao.UserDao;
import com.app.db.User;
import com.app.model.Customer;
import com.app.util.ShopifyHelper;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserDao userDao;
	@Autowired
	private ShopifyHelper shopifyHelper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.findByUsername(username);
		if (user != null) {
			return user;
		}
		throw new UsernameNotFoundException("User Not Found");
	}
	
	public User createUser(String firstName, String lastName, String email, String password){
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setUsername(email);
		user.setPassword(password);
		user = userDao.save(user);
		
		Customer customer = shopifyHelper.createCustomer(user);
		if(customer != null){
			user.setCustomerId(customer.getId());
			return userDao.save(user);
		}
		else{
			userDao.delete(user.getId());
		}
		return null;
	}
	
	public User getUserByEmail(String email){
		return userDao.findByUsername(email);
	}

}
