package com.library.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DatabaseDao;
import com.library.dao.FileDao;

public class Library{
	// å ���
	// �ʵ�� ����� Ŭ���� ���ο��� �����Ӱ� ��� �����ϴ�.
	List<Book> bookList = null;
	// �������̽��� Ÿ������ ���� -> �������̽��� ����ü�� �̿��� ����
	Dao dao = new FileDao();

	// ������ : Ŭ������� ���� �̸�, ��ȯ Ÿ���� ����.
	Library() {
		bookList = dao.getList();
	}
	Library(String daoType){
		if(daoType.equals("DB")) {
			dao = new DatabaseDao();
		}
		bookList = dao.getList();
	}

	// å�� ������ �޾Ƽ� ����Ʈ�� ���
	// ����Ʈ�� ���Ϸ� ���
	public boolean insertBook(int no, String title, String author, boolean isRent) {

		// 0. �Ϸù�ȣ �ߺ� üũ
		for (Book book : bookList) {
			if (book.getNo() == no) {
				System.err.println("�Ϸù�ȣ�� �ߺ��Ǿ����ϴ�.\nȮ�� �� �ٽ� �Է��� �ּ���.");
				return false;
			}
		}

		// 1. å�� ����
		Book book = new Book(no, title, author, isRent);

		// 2. ����Ʈ�� ���
		bookList.add(book);
		dao.insert(book);

		// 3. ����Ʈ�� ���Ϸ� ���
		boolean res = dao.listToFile(bookList);

		// 4. ���Ͽ� ���������� ����� ���� ���� ���
		// ����Ʈ���� ����
		/*
		 * if (!res) { bookList.remove(book);
		 * System.out.println("å�� ��ϵ��� �ʾҽ��ϴ�.\n�����ڿ��� �������ּ���."); return false; }
		 */System.out.println("å�� ��ϵǾ����ϴ�.");
		return true;

	}

	/*
	 * å�� �Ϸù�ȣ�� �Է¹޾Ƽ� ����Ʈ���� �����մϴ�. FileDao�� ����Ʈ�� ����ȭ ( ����Ʈ�� ���Ϸ� ��� )
	 * 
	 * 
	 */

	public boolean deleteBook(int no) {
		Book book = null;
		boolean res = false;
		for (int i = 0; i < bookList.size(); i++) {
			book = bookList.get(i);
			if (book.getNo() == no) {
				System.out.println("�����Ǿ����ϴ�.");
				bookList.remove(book);
				dao.delete(no);
				res = dao.listToFile(bookList);
			}
		}
		if (res) {
			return true;
		} else {
			System.err.println("�߸��� ��ȣ�Դϴ�.");
			return false;
		}

	}

	public boolean rentBook(int no) {
		Book book = null;
		for (int i = 0; i < bookList.size(); i++) {
			book = bookList.get(i);
			if (book.getNo() == no) {
				if (book.isRent()) {
					System.err.println("�̹� �뿩�� å�� �뿩�� �� �����ϴ�.");
				}
			}
			if (book.getNo() == no && !book.isRent()) {
				book.setRent(true);
				// ���Ϸ� ���
				dao.listToFile(bookList);
				// ������ ���̽� ������Ʈ
				int a = dao.update(no,"Y");
				if(a>0) {
					System.out.println(a+"�� ó���Ǿ����ϴ�.(������ ���̽�)");
				}else {
					System.out.println("ó������ ������ �߻��߽��ϴ�.(������ ���̽�)");
					book.setRent(false);
				}
				
				System.out.println("�뿩 �Ϸ�");
				return true;
			}
		}
		System.err.println("�߸��� ��ȣ�Դϴ�.");
		return false;
	}

	public boolean returnBook(int no) {
		Book book = null;
		try {
			for (int i = 0; i < bookList.size(); i++) {
				book = bookList.get(i);
				if (book.getNo() == no && book.isRent()) {
					book.setRent(false);
					dao.listToFile(bookList);
					// ������Ʈ ���� ȣ��
					dao.update(no,"N");
					
					System.out.println("�ݳ� �Ϸ�");
					return true;
				}
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.err.println("�߸��� ��ȣ�Դϴ�.");
		return false;
	}

	@Override
	public String toString() {
		System.out.println("å ���=========================== lib.toString()");
		String info = "";
		Collections.sort(bookList, new ListComparator());
		for (Book book : bookList) {
			info += book.toString();
		}
		System.out.println("���� bookList ������ : " + bookList.size());
		return info;
	}

	public void numbering() {
		for (int i = 0; i < bookList.size(); i++) {
			bookList.get(i).setNo(i + 1);
		}
	}

	public boolean deleteBook2(int no) {
		boolean res = false;
		for (Book book : bookList) {
			if (book.getNo() == no) {
				System.out.println("�����Ǿ����ϴ�.");
				bookList.remove(book);
				res = dao.listToFile(bookList);
			}
		}
		if (res) {
			return true;
		}
		System.err.println("�߸��� ��ȣ�Դϴ�.");
		return false;
	}

	

}
