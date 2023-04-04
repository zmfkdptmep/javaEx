package com.jungang.dao;

import java.util.List;
import com.jungang.*;

public interface Dao {
	// 리스트 조회
	List<Book> getBookList();
	// 생성
	boolean insertBook(List<Book> list);
	// 삭제
	boolean deleteBook(Book book);
	// 수정
	boolean updateBook(Book book);
	

}
