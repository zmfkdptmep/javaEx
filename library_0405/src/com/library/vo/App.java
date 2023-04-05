package com.library.vo;

import java.util.Scanner;

public class App {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Library lib = new Library();
		App app = new App();
		String str = "";
		int menu = 0;
		// �α��� â
		while (true) {
			System.out.println("�α��� �ϼ���.");
			System.out.println("id : ");
			str = app.getString();

			// ������ �޴�
			admin: if (str.equalsIgnoreCase("admin")) {
				while (true) {
					System.out.println("������ �޴��Դϴ�.");
					System.out.println(lib.toString());
					System.out.println("1. ������� 2. �������� 0. �α׾ƿ� Q.����");
					System.out.println("�޴��� �Է��ϼ���.");
					menu = app.getInt();
					switch (menu) {
					case 1:
						System.out.println("�Ϸ� ��ȣ�� �Է��ϼ���.");
						int no = app.getInt();
						System.out.println("������ �Է��ϼ���.");
						String title = app.getString();
						System.out.println("�۰����� �Է��ϼ���.");
						String author = app.getString();
						lib.insertBook(no, title, author, false);
						break;
					case 2:
						System.out.println(lib.toString());
						System.out.println("���� å �Ϸ� ��ȣ�� �Է��ϼ���.");
						lib.deleteBook(app.getInt());
						break;
					case 0:
						System.out.println("�α׾ƿ��Ǿ����ϴ�.");
						break admin;
					default:
						System.err.println("�߸� �Է��ϼ̽��ϴ�.");
					}
				}
			}
			user: if (!str.equalsIgnoreCase("admin")) {
				while (true) {
					System.out.println(str + "�� �ݰ����ϴ�.");
					System.out.println(lib.toString());
					System.out.println("1. �����뿩 2. �����ݳ� 0. �α׾ƿ� Q. ����");
					int menu2 = app.getInt();
					switch (menu2) {
					case 1:
						System.out.println("�뿩�� ������ �Ϸ� ��ȣ�� �Է��ϼ���.");
						lib.rentBook(app.getInt());
						break;
					case 2:
						System.out.println("�ݳ��� ������ �Ϸ� ��ȣ�� �Է��ϼ���.");
						lib.returnBook(app.getInt());
						break;
					case 0:
						System.out.println("�α׾ƿ��Ǿ����ϴ�.");
						break user;
					default:
						System.err.println("�߸��� ��ȣ�Դϴ�.");
						break;
					}

				}

			}
		}
	}

	public String getString() {
		String str = "";
		try {
			str = sc.next();
			Integer.parseInt(str);
			System.err.println("���ڸ� �Է��ϼ���.");
		} catch (Exception e) {
			if (str.equalsIgnoreCase("q")) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
		}
		return str;
	}

	public int getInt() {
		String str = "";
		int i = 0;
		while (true) {
			try {
				str = sc.next();
				if (str.equalsIgnoreCase("q")) {
					System.out.println("���α׷� ����");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				System.err.println("���ڸ� �Է��ϼ���.");
			}
		}
		return i;
	}

}
