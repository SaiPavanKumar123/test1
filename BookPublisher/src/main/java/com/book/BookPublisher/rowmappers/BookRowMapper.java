package com.book.BookPublisher.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.book.BookPublisher.models.Books;

public class BookRowMapper implements RowMapper<Books> {

	@Override
	public Books mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Books b=new Books();
		b.setBook_id(rs.getInt(1));
		b.setBook_author(rs.getString(3));
		b.setBook_title(rs.getString(2));
		b.setPublisherid(rs.getInt(5));
		b.setBook_price(rs.getDouble(4));
		
		
		return b;
	}

}
