package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.exceptions.UserNotFoundException;

@ControllerAdvice
public class UserExceptionController {

	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<Object> exception(UserNotFoundException ex) {
		return new ResponseEntity<Object>("Product not found", HttpStatus.NOT_FOUND);
	}
	
}
