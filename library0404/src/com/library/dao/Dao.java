package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {
	
	// ���Ϸκ��� �����͸� �о ����Ʈ�� ��� ��ȯ�մϴ�.
	public List<Book> getList();
	
	public boolean saveFile(List<Book> list);
	

}
