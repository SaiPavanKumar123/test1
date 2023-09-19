package com.book.BookPublisher.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.book.BookPublisher.models.Publisher;

public class PubliserRowMapper implements RowMapper<Publisher> {

	@Override
	public Publisher mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Publisher p=new Publisher();
		
		p.setPublisherid(rs.getString(1));
		p.setPublishername(rs.getString(2));
		
		
		return p;
	}

}
