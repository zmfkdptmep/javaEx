package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {
	
	
	// ������ �о ����Ʈ�� ��ȯ�մϴ�.
	public List<Book> getList();
	
	// ����Ʈ�� ���Ϸ� ����մϴ�.
	public boolean listToFile(List<Book> list);

}
