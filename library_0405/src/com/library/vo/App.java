package com.library.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.library.dao.Dao;
import com.library.dao.FileDao;

public class App {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// ���̺귯�� ����
		Library lib = new Library();
		App app = new App();

		// ���� ����ϴ� ������ �޼ҵ�� ���� ����.
		while (true) {
			// �α���
			// id�� �Է¹޾Ƽ� admin�̸� ������ �ƴϸ� �����
			System.out.println("ȯ���մϴ�.");
			System.out.println("id : ");
			String str = app.getString();
			admin: while (true) {
				if (str.equalsIgnoreCase("admin")) {
					System.out.println("������ �޴��Դϴ�.");
					System.out.println(lib.toString());
					System.out.println("1. ������� 2. �������� 0. �α׾ƿ� q. ����");
					System.out.println("�޴��� �Է��� �ּ���.");
					int menu = app.getInt();
					switch (menu) {
					case 1:
						System.out.println("�Ϸù�ȣ�� �Է��ϼ���.");
						int no = app.getIntOnly();
						System.out.println("������ �Է��ϼ���.");
						String title = app.getString();
						System.out.println("�۰��� �Է��ϼ���.");
						String author = app.getString();
						lib.insertBook(no, title, author, false);
						break;
					case 2:
						while (true) {
							System.out.println(lib.toString());
							System.out.println("����� å�� �Ϸù�ȣ�� �Է����ּ���.");
							int value = app.getIntOnly();
							if (lib.deleteBook(value)) {
								break;
							} else {
								continue;
							}
						}
					case 0:
						System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
						break admin;
					default:
						System.err.println(menu + " ���� �޴��Դϴ�.");
						break;
					}
				}
				user:
					while (true) {
					if (!str.equalsIgnoreCase("admin")) {
						System.out.println(str + "�� ȯ���մϴ�.");
						System.out.println(lib.toString());
						System.out.println("1. �����뿩 2. �����ݳ� 0. �α׾ƿ� q. ����");
						System.out.println("�޴��� �Է��ϼ���.");
						int menu = app.getInt();
						int value = 0;
						bye:
						switch (menu) {
						case 1:
							while (true) {
								System.out.println(lib.toString());
								System.out.println("�뿩�� å�� �Ϸù�ȣ�� �Է��ϼ���.");
								value = app.getIntOnly();
								boolean res = lib.rentBook(value);
								if (res) {
									System.out.println("�뿩 �Ϸ�");
									break;
								}
							}
							
							break;
						case 2:
							while (true) {
								System.out.println(lib.toString());
								System.out.println("�ݳ��� å�� �Ϸù�ȣ�� �Է��ϼ���.");
								value = app.getIntOnly();
								if(lib.returnBook(value)) {
									break;
								}
							}
							break;
						case 0:
							System.out.println(str + "�� �α׾ƿ��մϴ�.");
							break user;
						default:
							System.err.println(menu + " ���� �޴��Դϴ�.");
							break;
						}
					}
				}
			}
		}
	}

	// ���� - å ���, å ����
	// ����� - å �뿩, å �ݳ�

	public String getString() {
		String str = "";
		while (true) {
			try {
				str = sc.next();
				Integer.parseInt(str);
				System.err.println("���ڸ� �Է����ּ���.");
				if (str.equalsIgnoreCase("q")) {
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
				}
			} catch (Exception e) {
				break;
			}
		}
		return str;

	}

	public int getInt() {
		String str = "";
		int value = 0;
		while (true) {
			try {
				str = sc.next();
				if (str.equalsIgnoreCase("q")) {
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
				}
				value = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				sc.next();
				System.err.print("���ڸ� �Է��ϼ���.\n�ٽ� �Է��ϼ���.");
			}
		}
		return value;
	}

	public int getIntOnly() {
		int value = 0;
		while (true) {
			try {
				value = sc.nextInt();
				break;
			} catch (Exception e) {
				sc.next();
				System.err.println("���ڸ� �Է��ϼ���.");
			}
		}
		return value;
	}

}
