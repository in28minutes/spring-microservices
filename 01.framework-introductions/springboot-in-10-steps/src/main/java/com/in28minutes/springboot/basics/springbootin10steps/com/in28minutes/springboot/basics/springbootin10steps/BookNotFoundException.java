package com.in28minutes.springboot.basics.springbootin10steps;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
public class BookNotFoundException extends RuntimeException {
	BookNotFoundException(){
		super("Book not found");
	}
}
