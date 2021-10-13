package com.example.nidhi.webservicepoc.webservice.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nidhi.webservicepoc.webservice.beans.Book;


public interface BookDao extends JpaRepository<Book, Integer>{

}
