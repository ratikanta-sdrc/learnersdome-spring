package com.learnersdome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnersdome.service.UserService;

/**
 * 
 *
 * @author Ratikanta Pradhan (ratikanta@sdrc.co.in) on 21-Oct-2017 8:00:01 am
 */
@RestController
@RequestMapping("api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("register")
	public int hello(){
		return 0;
	}

}
