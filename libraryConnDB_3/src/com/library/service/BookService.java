package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.BookVo;

public class BookService {
	// dao의 getList()를 사용하기 위해 인스턴스화
	BookDao dao = new BookDao();

	// dao의 list 원소들을 출력하는 메소드
	public void getList() {
		List<BookVo> list = dao.getList();
		
		for(BookVo book: list) {
			System.out.println(book.toString());
		}
	}
	
	public boolean insertBook(int no, String title, String author) {
		BookVo book = new BookVo(no,title,author,"N");
		// dao의 insertBook과 연결
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
			System.out.println(count+"건 대여되었습니다.");
			return true;
		}else {
			System.err.println("대여가 불가능한 상태입니다.");
			return false;
		}
	}
	public boolean returnBook(int no) {
		boolean res = dao.selStatus(no);
		if(!res) {
			int count = dao.update(no,"N");
			System.out.println(count+"건 반납되었습니다.");
			return true;
		}else {
			System.err.println("반납이 불가능한 상태입니다.");
			return false;
		}
	}
	
	

}
