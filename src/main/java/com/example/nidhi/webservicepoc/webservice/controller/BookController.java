package com.example.nidhi.webservicepoc.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.nidhi.webservicepoc.webservice.beans.Book;
import com.example.nidhi.webservicepoc.webservice.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	//HOME
	
	@GetMapping("/")
	public String get() {
		return "REST using Spring Boot";
	}
	//Get Request
	@GetMapping("/books")
	public List<Book> getBooks(){
		return this.bookService.getBooks();
		
	}
	//Get with  params request
	@GetMapping("/books/{bookId}")
	public Book getBooksById(@PathVariable String bookId){
		return this.bookService.getBookById(Integer.parseInt(bookId));
		
	}
	//POST request
		@PostMapping("/books")
		public Book addBook(@RequestBody Book book) {
			return this.bookService.addBook(book);
		}
		
	//PUT request
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) {
		return this.bookService.updateBook(book);
	}
	//DELETE request
	@DeleteMapping("/books/{bookId}")
	public ResponseEntity<HttpStatus> deleteBookById(@PathVariable String bookId){
		
		try {
			this.bookService.deleteBookById(Integer.parseInt(bookId));
			return new ResponseEntity<>(HttpStatus.OK);	
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	

}
