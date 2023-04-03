package com.jungang;

public class Book {
	

	private int no;
	private String title;
	private String author;
	private boolean isRent;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public boolean isRent() {
		return isRent;
	}

	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
	public String info() {
		String str = " ";
		if(isRent) {
			str = "�뿩��";
		}
		return getNo()+"/"+getTitle()+"/"+getAuthor()+"/"+str;
	}
	
	
	
	
	

}
