package com.jungang;

class Board{
	String title;
	String content;
	String writer;
	String date;
	int hitCount;
	
	Board(String title, String content){
		this(title, content, "�α����� ȸ�� ���̵�", "���� ��ǻ�� ��¥", 0);
	}
	Board(String title, String content, String writer){
		this(title, content, writer, "���� ��ǻ�� ��¥", 0);
	}
	Board(String title, String content, String writer, String date){
		this(title, content, writer, date, 0);
	}
	
	Board(String title, String content, String writer, String date, int hitCount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitCount = hitCount;
	
	}

}


public class ConstructorOverloadingEx3 {
	
	

}
