package com.app.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.ApiResponse;
import com.app.service.UserService;

@RestController
@RequestMapping("/signup")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.POST)
	public ApiResponse getProfile(@RequestParam(name = "email") String email,
			@RequestParam(name = "firstName") String firstName, @RequestParam(name = "lastName") String lastName,
			@RequestParam(name = "password") String password) {
		ApiResponse apiResponse = new ApiResponse();
		if (userService.getUserByEmail(email) == null) {
			if (userService.createUser(firstName, lastName, email, password) != null) {
				apiResponse.setIsSuccess(true);
				apiResponse.setSuccessMessage("Signup successfull");
			} else {
				apiResponse.setIsSuccess(false);
				apiResponse.setError(Collections.singletonList("Failed to create user, please try again"));
			}
		} else {
			apiResponse.setIsSuccess(false);
			apiResponse.setError(Collections.singletonList("User already exist"));
		}
		return apiResponse;
	}
}
