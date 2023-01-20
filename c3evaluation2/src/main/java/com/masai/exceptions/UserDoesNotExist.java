package com.masai.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class UserDoesNotExist extends RuntimeException {

	public UserDoesNotExist() {
		
	}
	
	public UserDoesNotExist(String message) {
		super(message);
	}
}
