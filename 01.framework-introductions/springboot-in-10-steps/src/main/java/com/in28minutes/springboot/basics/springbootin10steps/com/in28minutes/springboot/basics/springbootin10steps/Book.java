package com.in28minutes.springboot.basics.springbootin10steps;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor 
public class Book {
	long id;
	String name;
	String author;

//	public Book(long id, String name, String author) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.author = author;
//	}

//	public long getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public String getAuthor() {
//		return author;
//	}

	@Override
	public String toString() {
		return String.format("Book [id=%s, name=%s, author=%s]", id, name, author);
	}

}
