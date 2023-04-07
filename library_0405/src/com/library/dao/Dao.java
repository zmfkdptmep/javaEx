package com.library.dao;

import java.util.List;

import com.library.vo.Book;
import com.library.vo.Member;

public interface Dao {
	
	
	// ������ �о ����Ʈ�� ��ȯ�մϴ�.
	public List<Book> getList();
	int delete(int no);
	int update(int no, String isRent);
	int insert(Book book);
	// ����Ʈ�� ���Ϸ� ����մϴ�.
	public boolean listToFile(List<Book> list);

}
