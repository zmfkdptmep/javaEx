package com.Book;

public class Main {
	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book("�ڹ��� ����",20000,0.2,"����");
		
		System.out.println(b1.information());
		System.out.println(b2.information());
		System.out.println("====================");
		
		b1.setAuthor("����");
		b1.setDicountRate(0.1);
		b1.setPrice(30000);
		b1.setTitle("C���");
		System.out.println("������ ��� Ȯ��");
		System.out.println(b1.information());
		System.out.println("====================");
		
		b1.setPrice(b1.getPrice()-(int)(b1.getPrice()*b1.getDicountRate()));
		b2.setPrice(b2.getPrice()-(int)(b2.getPrice()*b2.getDicountRate()));
		System.out.println("������ = "+b1.getTitle());
		System.out.println("���ε� ���� = "+b1.getPrice());
		System.out.println("������ = "+b2.getTitle());
		System.out.println("���ε� ���� = "+b2.getPrice());
		System.out.println("====================");
	}

}
