package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

//	public static String main(String[] args) {
//		// TODO Auto-generated method stub
		@GetMapping(value = "/saymsg")
		public String openPage() {
			System.out.println("I came here");
			return "hello";
		}

	}

//}
