package com.Book;

public class Book {
	private String title;
	private int price;
	private double dicountRate;
	private String author;
	
	public Book() {}
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.dicountRate = discountRate;
		this.author = author;
	}
	
	public String information() {
		return "제목: "+getTitle()+" | 가격: "+getPrice()+" | 할인율: "+getDicountRate()+" | 작가: "+getAuthor();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDicountRate() {
		return dicountRate;
	}
	public void setDicountRate(double dicountRate) {
		this.dicountRate = dicountRate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
