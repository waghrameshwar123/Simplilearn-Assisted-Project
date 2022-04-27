package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping(value = "sayHello")
	public String sayHello() {
		return "Welcome to spring boot with EC2 instance by Roronoa Zoro";
	}

}
