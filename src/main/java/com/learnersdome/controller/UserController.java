package com.learnersdome.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 *
 * @author Ratikanta Pradhan (ratikanta@sdrc.co.in) on 21-Oct-2017 8:00:01 am
 */
@RestController
public class UserController {
	

	 @RequestMapping("/api/hello")
	 public String greet() {
	  return "Hello from the other side!!!";
	 }

}
