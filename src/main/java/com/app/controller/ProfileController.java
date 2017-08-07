package com.app.controller;

import java.security.Principal;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.db.User;

@RestController
@RequestMapping("/profile")
@PreAuthorize("isAuthenticated()")
public class ProfileController {
	
	@RequestMapping(method = RequestMethod.GET)
	public User getProfile(Principal principal){
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return user;
	}
}
