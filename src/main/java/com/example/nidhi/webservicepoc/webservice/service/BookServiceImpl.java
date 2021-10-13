package com.example.nidhi.webservicepoc.webservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nidhi.webservicepoc.webservice.Dao.BookDao;
import com.example.nidhi.webservicepoc.webservice.beans.Book;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		
		return this.bookDao.findAll();
	}
	@Override
	public Book getBookById(int i) {
		// TODO Auto-generated method stub
		
		return this.bookDao.findById(i).get();
	}
	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		
		return this.bookDao.save(book);
		
	}
	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		this.bookDao.save(book);
		return book;
	}
	@Override
	public void deleteBookById(int parseInt) {
		// TODO Auto-generated method stub
		System.out.println(this.bookDao.getById(parseInt));
		this.bookDao.delete(this.bookDao.getById(parseInt));
		
	}

}
