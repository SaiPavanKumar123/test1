package com.book.BookPublisher.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.book.BookPublisher.configuration")
public class BookConfiguration {
	
	@Bean
	DataSource dataSource(){
		
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName("org.postgresql.Driver");
		dmds.setUrl("jdbc:postgresql://localhost:5432/postgres");
		dmds.setUsername("postgres");
		dmds.setPassword("pavan123");
		
		return dmds;
		
	}
	}
	
