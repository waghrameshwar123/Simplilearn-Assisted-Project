package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithEc2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithEc2Application.class, args);
		System.out.println("Spring Boot Running . . . ");
	}

}
