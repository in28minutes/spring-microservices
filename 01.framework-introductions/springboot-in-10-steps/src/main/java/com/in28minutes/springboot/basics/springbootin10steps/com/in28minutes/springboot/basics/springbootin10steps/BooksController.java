package com.in28minutes.springboot.basics.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;



@RestController
public class BooksController {
	
	
	@Operation(summary = "Get a book by its id")
	@ApiResponses(value = { 
	  @ApiResponse(responseCode = "200", description = "Found the book", 
	    content = { @Content(mediaType = "application/json", 
	      schema = @Schema(implementation = Book.class)) }),
	  @ApiResponse(responseCode = "400", description = "Invalid id supplied", 
	    content = @Content), 
	  @ApiResponse(responseCode = "404", description = "Book not found", 
	    content = @Content) })
	
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {

MongoClient mongoClient = new MongoClient(
    new MongoClientURI(
        //MongoDBURL
    )
);
MongoDatabase database = mongoClient.getDatabase("sample_airbnb");
MongoCollection<Document> collection = database.getCollection("listingsAndReviews");

AggregateIterable<Document> result = collection.aggregate(Arrays.asList(
		new Document("$group",new Document("_id", "$address.country").append("c", new Document("$sum", 1L))), 
    new Document("$sort",  new Document("c", -1L))));

Document first = result.first();

		return Arrays.asList(
				new Book(1l, "Mastering Spring 5.2", "Ranga Karanam"));
	}
	
	@DeleteMapping("/books")
	public List<Book> getAllBooks1() {
		throw new BookNotFoundException();
	}
	
	@PostMapping("/books")
	public List<Book> getAllBooks1(@Validated @RequestBody Book book) {
		//throw new BookNotFoundException();
		return Arrays.asList(book);
	}
}