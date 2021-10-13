package com.example.nidhi.webservicepoc.webservice.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.nidhi.webservicepoc.webservice.beans.Book;

public interface BookService {
	public List<Book> getBooks();

	public Book getBookById(int i);

	public Book addBook(Book book);

	public Book updateBook(Book book);

	public void deleteBookById(int parseInt);

}
