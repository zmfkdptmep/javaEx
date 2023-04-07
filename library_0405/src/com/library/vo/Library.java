package com.library.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DatabaseDao;
import com.library.dao.FileDao;

public class Library{
	// 책 목록
	// 필드로 선언시 클래스 내부에서 자유롭게 사용 가능하다.
	List<Book> bookList = null;
	// 인터페이스를 타입으로 선언 -> 인터페이스의 구현체를 이용해 생성
	Dao dao = new FileDao();

	// 생성자 : 클래스명과 같은 이름, 반환 타입이 없다.
	Library() {
		bookList = dao.getList();
	}
	Library(String daoType){
		if(daoType.equals("DB")) {
			dao = new DatabaseDao();
		}
		bookList = dao.getList();
	}

	// 책의 정보를 받아서 리스트에 등록
	// 리스트를 파일로 출력
	public boolean insertBook(int no, String title, String author, boolean isRent) {

		// 0. 일련번호 중복 체크
		for (Book book : bookList) {
			if (book.getNo() == no) {
				System.err.println("일련번호가 중복되었습니다.\n확인 후 다시 입력해 주세요.");
				return false;
			}
		}

		// 1. 책을 생성
		Book book = new Book(no, title, author, isRent);

		// 2. 리스트에 등록
		bookList.add(book);
		dao.insert(book);

		// 3. 리스트를 파일로 출력
		boolean res = dao.listToFile(bookList);

		// 4. 파일에 정상적으로 등록이 되지 않은 경우
		// 리스트에서 제거
		/*
		 * if (!res) { bookList.remove(book);
		 * System.out.println("책이 등록되지 않았습니다.\n관리자에게 문의해주세요."); return false; }
		 */System.out.println("책이 등록되었습니다.");
		return true;

	}

	/*
	 * 책의 일련번호를 입력받아서 리스트에서 삭제합니다. FileDao의 리스트와 동기화 ( 리스트를 파일로 출력 )
	 * 
	 * 
	 */

	public boolean deleteBook(int no) {
		Book book = null;
		boolean res = false;
		for (int i = 0; i < bookList.size(); i++) {
			book = bookList.get(i);
			if (book.getNo() == no) {
				System.out.println("삭제되었습니다.");
				bookList.remove(book);
				dao.delete(no);
				res = dao.listToFile(bookList);
			}
		}
		if (res) {
			return true;
		} else {
			System.err.println("잘못된 번호입니다.");
			return false;
		}

	}

	public boolean rentBook(int no) {
		Book book = null;
		for (int i = 0; i < bookList.size(); i++) {
			book = bookList.get(i);
			if (book.getNo() == no) {
				if (book.isRent()) {
					System.err.println("이미 대여한 책은 대여할 수 없습니다.");
				}
			}
			if (book.getNo() == no && !book.isRent()) {
				book.setRent(true);
				// 파일로 출력
				dao.listToFile(bookList);
				// 데이터 베이스 업데이트
				int a = dao.update(no,"Y");
				if(a>0) {
					System.out.println(a+"건 처리되었습니다.(데이터 베이스)");
				}else {
					System.out.println("처리도중 오류가 발생했습니다.(데이터 베이스)");
					book.setRent(false);
				}
				
				System.out.println("대여 완료");
				return true;
			}
		}
		System.err.println("잘못된 번호입니다.");
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
					// 업데이트 로직 호출
					dao.update(no,"N");
					
					System.out.println("반납 완료");
					return true;
				}
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.err.println("잘못된 번호입니다.");
		return false;
	}

	@Override
	public String toString() {
		System.out.println("책 목록=========================== lib.toString()");
		String info = "";
		Collections.sort(bookList, new ListComparator());
		for (Book book : bookList) {
			info += book.toString();
		}
		System.out.println("현재 bookList 사이즈 : " + bookList.size());
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
				System.out.println("삭제되었습니다.");
				bookList.remove(book);
				res = dao.listToFile(bookList);
			}
		}
		if (res) {
			return true;
		}
		System.err.println("잘못된 번호입니다.");
		return false;
	}

	

}
