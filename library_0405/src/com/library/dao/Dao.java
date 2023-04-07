package com.library.dao;

import java.util.List;

import com.library.vo.Book;
import com.library.vo.Member;

public interface Dao {
	
	
	// 파일을 읽어서 리스트를 반환합니다.
	public List<Book> getList();
	int delete(int no);
	int update(int no, String isRent);
	int insert(Book book);
	// 리스트를 파일로 출력합니다.
	public boolean listToFile(List<Book> list);

}
