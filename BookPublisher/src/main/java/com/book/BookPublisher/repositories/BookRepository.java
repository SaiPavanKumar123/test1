package com.book.BookPublisher.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.book.BookPublisher.contractors.IDAO;
import com.book.BookPublisher.contractors.IRepository;
import com.book.BookPublisher.models.Books;
import com.book.BookPublisher.models.Publisher;

@Repository
public class BookRepository implements IRepository {
	
	@Autowired
	IDAO dao;
	
	public BookRepository(IDAO dao) {
		this.dao=dao;
	}

	@Override
	public List<Publisher> getallPublishers() {
			
		return dao.getallPublishers();
	}

	@Override
	public List<Books> getAllBooks(String id) {
		
		return dao.getAllBooks(id);
		//return dao.getAllBooks();
	}

	@Override
	public void deleteBook(int id) {
		
		dao.deleteBook(id);
	}

}
