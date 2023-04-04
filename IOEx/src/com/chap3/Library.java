package com.chap3;

import java.util.ArrayList;
import java.util.List;

public class Library {
	 List<Book> bookList = new ArrayList<Book>();
	
	Library(){
		bookList.add(new Book("책1","작가1",false));
		bookList.add(new Book("책2","작가2",false));
		bookList.add(new Book("책3","작가3",false));
		numbering();
	}
	
	void addBook(String title, String author, boolean isRent) {
		bookList.add(new Book(title,author,isRent));
		numbering();
	}
	
	void numbering() {
		for(int i=0;i<bookList.size();i++) {
			bookList.get(i).setNo(i+1);
		}
	}
	
	

}
