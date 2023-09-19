package com.book.BookPublisher.contractors;

import java.util.List;

import com.book.BookPublisher.models.Books;
import com.book.BookPublisher.models.Publisher;

public interface IRepository {

	List<Publisher> getallPublishers();

	List<Books> getAllBooks(String id);

	

	void deleteBook(int id);

}
