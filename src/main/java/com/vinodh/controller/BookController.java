package com.vinodh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinodh.book.model.Book;
import com.vinodh.service.BookService;


@RestController
@RequestMapping("/books")
public class BookController{

	private static final Logger log = LoggerFactory.getLogger(BookController.class);

	@Autowired
	private BookService bookService;

	@PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
	public String createOrSaveBookInfo(Book book) {
		log.info("doing addbook...");
		return bookService.insertNewBookInfo(book);
	}


}