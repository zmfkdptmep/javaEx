package com.jungang;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library lib = new Library();
		boolean how = false;
		printTitle("�������� ���Ű� ȯ���մϴ�.");
		
		while(true) {
			// �α���
			printTitle("�α��� ���ּ���.");
			printTitle("id: ");
			String id = getString(sc);
			if(!id.equals("swj96")) {
				how = false;
			}
			
			// ������ �޴�
			admin:
			if(id.equals("swj96")) {
				printTitle("������ �޴��Դϴ�.");
				while(true) {
				lib.info();
				printTitle("1. å ��� | 2. å ���� | 0. �α׾ƿ� | Q. ����");
				int menuAdmin = getInt(sc);
				switch(menuAdmin) {
				case 1:
					printTitle("å �̸��� �Է��ϼ���.");
					String title = getString(sc);
					printTitle("�۰� �̸��� �Է��ϼ���.");
					String author = getString(sc); 
					lib.insertBook(title, author);
					break;
				case 2:
					printTitle("������ å ��ȣ�� �Է��� �ּ���.");
					lib.deleteBook(getInt(sc));
					break;
				case 0:
					how = true;
					break admin;
			    default:
			    	System.err.println("�޴��� ���� ��ȣ�Դϴ�.\n�ٽ� �Է��� �ּ���.");
				}
			}
		}
			// ����� �޴�
			user:
			if(!how) {
			while(true) {
				lib.info();
				printTitle("�ȳ��ϼ���, "+id+"��");
				printTitle("�޴��� �������ּ���.");
				printTitle("1. �뿩 | 2. �ݳ� | 0. �α׾ƿ� | Q. ����");
				int menu = getInt(sc);
				
				switch(menu) {
				case 1:
					printTitle("���� å�� ������ �ּ���.");
					lib.info();
					lib.rentBook(getInt(sc));
					break;
				case 2:
					printTitle("�ݳ��� å ��ȣ�� �Է��� �ּ���.");
					lib.info();
					lib.returnBook(getInt(sc));
					break;
				case 0:
					break user;
				default:
					System.err.println("�޴��� �������� �ʴ� ��ȣ�Դϴ�.\n�ٽ� �Է��� �ּ���.");
				}
			}
			
		}
		}
		}
		
	
	public static int getInt(Scanner sc) {
		int i =0;
		try {
			i = sc.nextInt();
		}catch(Exception e) {
			if(sc.next().equalsIgnoreCase("q")) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
			System.out.println(sc.next()+" : �Է� �Ұ��� �մϴ�.");
		}
		return i;	
	}
	public static String getString(Scanner sc) {
		String str = sc.next();
		sc.nextLine();
		return str;
	}
	
	public static void printTitle(String value) {
		System.out.println(value);
	}

}
