package com.in28minutes.springboot.basics.springbootin10steps;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class ExceptionResponse {
	private Date timestamp;
	private String message;
	private String details;
}
