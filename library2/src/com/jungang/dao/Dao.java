package com.jungang.dao;

import java.util.List;
import com.jungang.*;

public interface Dao {
	// ����Ʈ ��ȸ
	List<Book> getBookList();
	// ����
	boolean insertBook(List<Book> list);
	// ����
	boolean deleteBook(Book book);
	// ����
	boolean updateBook(Book book);
	

}
