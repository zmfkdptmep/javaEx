package com.Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	// å ����Ʈ�� ����
	// ���̰� �ڵ����� �þ�鼭 �ڷᰡ ����ȴ�.
	private List<Book> bookList = new ArrayList<Book>();
	public Library() {}
	public Library(List<Book> bookList) {
		this.bookList = bookList;
	}
	public boolean addBook(String title, String author) {
		// �ܺηκ��� �޾ƿ� �Ű������� Ȱ���Ͽ� å�� ����
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
		System.out.println("���� �Ǿ����ϴ�."+book.toString());
		}
	
	// 1. �ε����� �ִ� å ��������
	// 2. ��Ʈ ���� ����
	// 3. å ����
	
	public void updateBook(int index) {
		if(index<bookList.size()) {
			Book book = bookList.get(index);
			book.setIsRent(true);
			bookList.set(index,book);
		}
	}

}
