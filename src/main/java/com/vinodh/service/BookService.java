package com.vinodh.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vinodh.book.model.Book;

@Service
public class BookService {

	@Autowired
	private SessionFactory postgreSessionFactory;

	@Transactional("postgresTransactionManager")
	public String insertNewBookInfo(Book book) {
		int bookId = (Integer) postgreSessionFactory.getCurrentSession().save(book);
		System.out.println("bookId "+bookId);
		return "Book information saved successfully with Book_ID " + bookId;
	}

}
