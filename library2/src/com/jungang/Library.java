package com.jungang;

import java.util.List;
import java.util.ArrayList;

public class Library {
	// List 인터페이스의 규제를 받으면서 동시에 ArrayList의 메소드를 쓰기 위해
	private List<Book> bookList = new ArrayList<Book>();
	
	Library(){
		bookList.add(new Book("책1","작가1"));
		bookList.add(new Book("책2","작가2"));
		bookList.add(new Book("책3","작가3"));
		numbering();
	}
	public Library(String title, String author) {
		bookList.add(new Book(title,author));
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void insertBook(String title, String author) {
		Book book = new Book(title, author);
		bookList.add(book);
		numbering();
	}
	public boolean rentBook(int no) {
		Book book = null;
		for(int i=0;i<bookList.size();i++) {
		book = bookList.get(i);
		if(book.getNo()==no) {
			if(book.isRent()) {
				System.err.println("이미 대여한 책입니다.");
				break;
			}
			book.setRent(true);
		}
		}
		return book.isRent();
	}
	public void returnBook(int no) {
		Book book = null;
		for(int i=0;i<bookList.size();i++) {
		book = bookList.get(i);
		if(book.getNo()==no) {
			if(book.isRent()==false) {
				System.err.println("대여한적 없는 책입니다.");
				break;
			}
			book.setRent(false);
		}else if(bookList.size()<no) {
			System.err.println("존재하지 않는 책입니다.");
			break;
		}
		}
	}
	public void deleteBook(int no) {
		Book book = null;
		for(int i=0;i<bookList.size();i++) {
			book = bookList.get(i);
			if(bookList.size()<no) {
				System.err.println("잘못된 번호입니다.\n번호를 다시 입력해 주세요.");
				break;
			}
			if(book.getNo()==no) {
				if(book.isRent()) {
					System.err.println("대여중인 책은 삭제할 수 없습니다!");
					break;
				}
				bookList.remove(book);
				numbering();
			}
		}
	}
	public void renameBook(int index, String name) {
		Book book = bookList.get(index);
		if(!book.isRent()) {
			bookList.get(index).setTitle(name);
		}else {
			System.out.println("누군가 빌려간 책은 이름을 바꿀 수 없습니다.");
		}
	}
	
	public void info() {
		System.out.println("책 목록 ==================");
		for(Book book:bookList) {
			System.out.println(book.info());
		}
		System.out.println("========================");
	}
	
	public void numbering() {
		for(int i=0;i<bookList.size();i++) {
			bookList.get(i).setNo(i+1);
		}
	}
	
	
	

}
