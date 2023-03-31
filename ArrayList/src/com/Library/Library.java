package com.Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	// 책 리스트를 생성
	// 길이가 자동으로 늘어나면서 자료가 저장된다.
	private List<Book> bookList = new ArrayList<Book>();
	public Library() {}
	public Library(List<Book> bookList) {
		this.bookList = bookList;
	}
	public boolean addBook(String title, String author) {
		// 외부로부터 받아온 매개변수를 활용하여 책을 생성
		Book book = new Book(title,author);
		return bookList.add(book);
	}
	
	@Override
	public String toString() {
		
		for(int i=0;i<bookList.size();i++) {
			System.out.println(bookList.get(i).toString());
		}
		return super.toString();
	}
	public void removeBook(int index) {
		Book book = bookList.remove(index);
		System.out.println("삭제 되었습니다."+book.toString());
		}
	
	// 1. 인덱스에 있는 책 꺼내오기
	// 2. 렌트 여부 수정
	// 3. 책 저장
	
	public void updateBook(int index) {
		if(index<bookList.size()) {
			Book book = bookList.get(index);
			book.setIsRent(true);
			bookList.set(index,book);
		}
	}

}
