package com.Library;

public class Book {
	private String title; 
	private String author;
	private boolean isRent; // 대여 여부
	
	public Book() {}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return getTitle()+" / "+getAuthor();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean getIsRent() {
		return isRent;
	}
	public void setIsRent(boolean isRent) {
		this.isRent = isRent;
	}
	
	

}
