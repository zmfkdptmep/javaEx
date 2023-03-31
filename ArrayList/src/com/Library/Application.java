package com.Library;

public class Application {
	public static void main(String[] args) {
		Library l1 = new Library();
		
		// 책 추가
		l1.addBook("책1", "지은이1");
		l1.addBook("책2", "지은이2");
		l1.addBook("책3", "지은이3");
		
		// 책 정보 출력
		l1.toString();
		
		System.out.println("삭제할 책 번호를 선택 해주세요.");
		int i = 0;
		
		// 책 삭제
		l1.removeBook(i);
		
		// 책 정보 출력
		l1.toString();
		
		
		// 책 대여 : book.isRent = true;
		System.out.println("대여할 책 번호를 선택하세요.");
		i = 0;
		// 검증 : 책 목록의 사이즈보다 큰 값이 입력되었을때 다시 입력 받을 수 있도록
	}

}
