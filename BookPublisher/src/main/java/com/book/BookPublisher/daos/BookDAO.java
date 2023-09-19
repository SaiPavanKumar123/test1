package com.book.BookPublisher.daos;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.book.BookPublisher.contractors.IDAO;
import com.book.BookPublisher.models.Books;
import com.book.BookPublisher.models.Publisher;
import com.book.BookPublisher.rowmappers.*;


@Component
public class BookDAO implements IDAO{
	
	JdbcTemplate jdbc;
	
	@Autowired
	public BookDAO(DataSource ds) {
		this.jdbc=new JdbcTemplate(ds);
	}

	@Override
	public List<Publisher> getallPublishers() {
		
		
		return jdbc.query("select * from publisher",new PubliserRowMapper());
	}



@Override
public List<Books> getAllBooks(String id) {
	// TODO Auto-generated method stub
	return jdbc.query("select * from books where publisherid="+id,new BookRowMapper());
	
}

@Override
public void deleteBook(int id) {
	Object[] params = { id };
	jdbc.update("delete from books where book_id=?",id);
}



	
}
