package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.BookVo;

public class BookService {
	// dao�� getList()�� ����ϱ� ���� �ν��Ͻ�ȭ
	BookDao dao = new BookDao();

	// dao�� list ���ҵ��� ����ϴ� �޼ҵ�
	public void getList() {
		List<BookVo> list = dao.getList();
		
		for(BookVo book: list) {
			System.out.println(book.toString());
		}
	}
	
	public boolean insertBook(int no, String title, String author) {
		BookVo book = new BookVo(no,title,author,"N");
		// dao�� insertBook�� ����
		int res = dao.insertBook(book);
		return (res>0)?true:false;
	}
	
	public boolean deleteBook(int no) {
		int res = dao.delete(no);
		return (res>0)?true:false;
	}
	public boolean rentBook(int no) {
		boolean res = dao.selStatus(no);
		if(res) {
			int count = dao.update(no,"Y");
			System.out.println(count+"�� �뿩�Ǿ����ϴ�.");
			return true;
		}else {
			System.err.println("�뿩�� �Ұ����� �����Դϴ�.");
			return false;
		}
	}
	public boolean returnBook(int no) {
		boolean res = dao.selStatus(no);
		if(!res) {
			int count = dao.update(no,"N");
			System.out.println(count+"�� �ݳ��Ǿ����ϴ�.");
			return true;
		}else {
			System.err.println("�ݳ��� �Ұ����� �����Դϴ�.");
			return false;
		}
	}
	
	

}
