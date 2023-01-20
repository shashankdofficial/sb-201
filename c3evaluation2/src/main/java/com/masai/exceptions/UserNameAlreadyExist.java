package com.masai.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class UserNameAlreadyExist extends RuntimeException {

	 public UserNameAlreadyExist() {
		 
	 }
	 
	 public UserNameAlreadyExist(String message) {
		 super(message);
	 }
}
