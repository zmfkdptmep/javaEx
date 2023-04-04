package com.library.vo;

public class Book {
	// �Ϸù�ȣ
	private int no;
	// ����
	private String title;
	// �۰�
	private String author;
	// �뿩����(true:�뿩��, false:�뿩����)
	private boolean isRent;
	// �뿩��
	// �뿩��
	
	public Book(int no, String title, String author, boolean isRent) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}
	
	@Override
	public String toString() {
		return getNo()
				+ " " + getTitle()
				+ " " + getAuthor()
				+ " " + isRent;
	}
	
	// å�� ������ ��� �մϴ�.
	public void info() {
		String str = "";
		if(isRent) {
			str = "�뿩��";
		}
		System.out.println(getNo()
						+ " " + getTitle()
						+ " " + getAuthor()
						+ " " + str);
		
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isRent() {
		return isRent;
	}
	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
	
}
