package com.book.BookPublisher.models;

public class Books {
	
	
	private int book_id;
	
	private String book_title;
	private String book_author;
	private double book_price;
	private int publisherid;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
	public int getPublisherid() {
		return publisherid;
	}
	public void setPublisherid(int publisherid) {
		this.publisherid = publisherid;
	}
	public Books(int book_id, String book_title, String book_author, double book_price, int publisherid) {
		super();
		this.book_id = book_id;
		this.book_title = book_title;
		this.book_author = book_author;
		this.book_price = book_price;
		this.publisherid = publisherid;
	}
	public Books() {
		super();
	}
	
	
	
}
