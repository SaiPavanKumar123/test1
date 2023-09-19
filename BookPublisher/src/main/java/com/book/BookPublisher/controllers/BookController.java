package com.book.BookPublisher.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.BookPublisher.contractors.IRepository;
import com.book.BookPublisher.models.Books;
import com.book.BookPublisher.models.Publisher;


@RestController
public class BookController {
	
	@Autowired
	IRepository ir;
	
	public BookController(IRepository ir) {
		this.ir=ir;
	}
	
	@RequestMapping(value="/publishers", method=RequestMethod.GET)
	public List<Publisher> getAllPublishers(){
			List<Publisher> lp=(List) ir.getallPublishers();
		return lp;
	}
	
	@RequestMapping(value="/books", method=RequestMethod.GET)
	public List<Books> getAllbooks(@RequestParam("publisherid") String id){
		System.out.println(id);
			List<Books> lb=(List) ir.getAllBooks(id);
		return lb;
	}
	
	@RequestMapping(value="/deletebook", method=RequestMethod.DELETE)
	public ResponseEntity<Object> deleteBook(@RequestParam("publisherid") int id){
		System.out.println(id);
		ir.deleteBook(id);
		
		return new ResponseEntity<>("Book is Not deleted", HttpStatus.OK);
			
		
	}

}
