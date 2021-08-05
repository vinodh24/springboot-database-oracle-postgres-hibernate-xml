package com.vinodh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinodh.service.UserDetailService;
import com.vinodh.user.model.User;


@RestController
@RequestMapping("/users")
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserDetailService userDetailService;

	@PostMapping(path= "/add", consumes = "application/json", produces = "application/json")	
	public String createOrSaveUserInfo(User user) {
		log.info("doing user...");
		return userDetailService.insertUserInfo(user);
	}


}