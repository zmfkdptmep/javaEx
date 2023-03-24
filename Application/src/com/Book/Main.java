package com.Book;

public class Main {
	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book("자바의 정석",20000,0.2,"윤상섭");
		
		System.out.println(b1.information());
		System.out.println(b2.information());
		System.out.println("====================");
		
		b1.setAuthor("윤상섭");
		b1.setDicountRate(0.1);
		b1.setPrice(30000);
		b1.setTitle("C언어");
		System.out.println("수정된 결과 확인");
		System.out.println(b1.information());
		System.out.println("====================");
		
		b1.setPrice(b1.getPrice()-(int)(b1.getPrice()*b1.getDicountRate()));
		b2.setPrice(b2.getPrice()-(int)(b2.getPrice()*b2.getDicountRate()));
		System.out.println("도서명 = "+b1.getTitle());
		System.out.println("할인된 가격 = "+b1.getPrice());
		System.out.println("도서명 = "+b2.getTitle());
		System.out.println("할인된 가격 = "+b2.getPrice());
		System.out.println("====================");
	}

}
