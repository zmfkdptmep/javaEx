package com.Library;

public class Application {
	public static void main(String[] args) {
		Library l1 = new Library();
		
		// å �߰�
		l1.addBook("å1", "������1");
		l1.addBook("å2", "������2");
		l1.addBook("å3", "������3");
		
		// å ���� ���
		l1.toString();
		
		System.out.println("������ å ��ȣ�� ���� ���ּ���.");
		int i = 0;
		
		// å ����
		l1.removeBook(i);
		
		// å ���� ���
		l1.toString();
		
		
		// å �뿩 : book.isRent = true;
		System.out.println("�뿩�� å ��ȣ�� �����ϼ���.");
		i = 0;
		// ���� : å ����� ������� ū ���� �ԷµǾ����� �ٽ� �Է� ���� �� �ֵ���
	}

}
