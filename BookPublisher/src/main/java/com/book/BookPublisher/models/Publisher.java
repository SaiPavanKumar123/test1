package com.book.BookPublisher.models;

public class Publisher {
	private String publisherid;
	private String publishername;
	public Publisher(String publisherid, String publishername) {
		super();
		this.publisherid = publisherid;
		this.publishername = publishername;
	}
	
	public Publisher() {
		super();
	
	}

	public String getPublisherid() {
		return publisherid;
	}

	public void setPublisherid(String publisherid) {
		this.publisherid = publisherid;
	}

	public String getPublishername() {
		return publishername;
	}

	public void setPublishername(String publishername) {
		this.publishername = publishername;
	}
	
	
	
	
	
	

}
