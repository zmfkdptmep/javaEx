package com.jungang;

import java.util.List;
import java.util.ArrayList;

public class Library {
	// List �������̽��� ������ �����鼭 ���ÿ� ArrayList�� �޼ҵ带 ���� ����
	private List<Book> bookList = new ArrayList<Book>();
	
	Library(){
		bookList.add(new Book("å1","�۰�1"));
		bookList.add(new Book("å2","�۰�2"));
		bookList.add(new Book("å3","�۰�3"));
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
				System.err.println("�̹� �뿩�� å�Դϴ�.");
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
				System.err.println("�뿩���� ���� å�Դϴ�.");
				break;
			}
			book.setRent(false);
		}else if(bookList.size()<no) {
			System.err.println("�������� �ʴ� å�Դϴ�.");
			break;
		}
		}
	}
	public void deleteBook(int no) {
		Book book = null;
		for(int i=0;i<bookList.size();i++) {
			book = bookList.get(i);
			if(bookList.size()<no) {
				System.err.println("�߸��� ��ȣ�Դϴ�.\n��ȣ�� �ٽ� �Է��� �ּ���.");
				break;
			}
			if(book.getNo()==no) {
				if(book.isRent()) {
					System.err.println("�뿩���� å�� ������ �� �����ϴ�!");
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
			System.out.println("������ ������ å�� �̸��� �ٲ� �� �����ϴ�.");
		}
	}
	
	public void info() {
		System.out.println("å ��� ==================");
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
