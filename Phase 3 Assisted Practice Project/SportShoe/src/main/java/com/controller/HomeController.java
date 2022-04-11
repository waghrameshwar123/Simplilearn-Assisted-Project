package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Customer;
import com.model.Product;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String homePage()
	{
		return "homepage";
	}
	
}
