package com.library.vo;

import java.util.ArrayList;
import java.util.List;

import com.library.dao.*;

public class Library {
	
	
	
	private List<Book> bookList;
	// FileDao �Ǵ� DatabaseDao�� ������ �� �ֵ���
	// �������̽��� Ÿ������ ����
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
		// �ܺηκ��� ���� �����͸� �������� å�� �����ϰ� ����Ʈ�� �߰�
		Book book = new Book(no,title,author,isRent);
		// ����Ʈ�� ���Ͽ� ����
		bookList.add(book);
		boolean res = dao.saveFile(bookList);
		if(res) {
			// ���Ͽ� ���������� ����Ǹ�(true) ����Ʈ�� �߰�
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
