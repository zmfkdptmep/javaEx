package com.library.vo;

import java.util.ArrayList;
import java.util.List;

import com.library.dao.*;

public class Library {
	
	
	
	private List<Book> bookList;
	// FileDao 또는 DatabaseDao로 생성할 수 있도록
	// 인터페이스를 타입으로 선언
	private Dao dao = new FileDao();
	
	public Library() {
		this.bookList = dao.getList();
	}
	public Library(String type) {
		if(type.equalsIgnoreCase("DB")) {
			dao = new DatabaseDao();
		}
	}
	public boolean insert(int no, String title, String author,
			boolean isRent) {
		// 외부로부터 받은 데이터를 바탕으로 책을 생성하고 리스트에 추가
		Book book = new Book(no,title,author,isRent);
		// 리스트를 파일에 저장
		bookList.add(book);
		boolean res = dao.saveFile(bookList);
		if(res) {
			// 파일에 성공적으로 저장되면(true) 리스트에 추가
			return true;
		}else {
			bookList.remove(book);
			return false;
		}
		
	}
	
	@Override
	public String toString() {
		String listStr = "";
		for(Book book:bookList) {
			listStr += book.toString()+"\n";
		}
		
		return listStr;
	}

}
