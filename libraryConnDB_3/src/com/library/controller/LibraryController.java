package com.library.controller;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.vo.BookVo;
import com.library.vo.MemberVo;

import java.util.Scanner;

public class LibraryController {
	static Scanner sc = new Scanner(System.in);

	// ������� ��û�� �޾� �˸��� ����� ����
	// dao - service�� ���� ���������� ����ڿ��� �����ϴ� ����
	BookService bookService = new BookService();
	MemberService memberService = new MemberService();
	MemberVo member = null;

	public void start() {
		while (true) {
			System.out.println("============");
			System.out.println("�������� ���Ű� ȯ���մϴ�.");
			System.out.println("============");
			// login().get �ص� �Ǵµ� member�� ��� ��Ÿ��
			member = login();

			if (member.getAdminYN().equalsIgnoreCase("Y")) {
				adminMenu();
			} else {
				userMenu();
			}
		}

	}

	public void adminMenu() {
		admin: while (true) {
			System.out.println("������ �޴� ============");
			bookService.getList();
			System.out.println("1. ������� 2. �������� 3. ����ڵ�� 4. ����ڻ��� 0. �����޴� Q.����");
			int menu = getInt();
			int no = 0;
			String id = "";

			switch (menu) {
			case 1:
				System.out.println("�Ϸ� ��ȣ�� �Է��� �ּ���.");
				no = getInt();
				System.out.println("������ �Է��� �ּ���.");
				String title = getString();
				System.out.println("�۰��� �Է��� �ּ���.");
				String author = getString();
				bookService.insertBook(no, title, author);
				break;
			case 2:
				System.out.println("������ å�� �Ϸ� ��ȣ�� �Է��� �ּ���.");
				no = getInt();
				bookService.deleteBook(no);
				break;
			case 3:
				System.out.println("����� id�� �Է��� �ּ���.");
				id = getString();
				System.out.println("����� pwd�� �Է��� �ּ���.");
				String pw = getString();
				System.out.println("�̸��� �Է��� �ּ���.");
				String name = getString();
				System.out.println("������ �����̶�� Y�� �Է��� �ּ���.");
				String str = getString();
				String adminYN = (str.equalsIgnoreCase("Y")) ? "Y" : "N";
				memberService.insertMember(id, pw, name, adminYN);
				break;
			case 4:
				System.out.println("������ id�� �Է��� �ּ���.");
				memberService.getList();
				id = getString();
				memberService.deleteMember(id);
				break;
			case 0:
				break admin;
			default:
				System.err.println("�޴��� Ȯ�� �� �ٽ� �Է��� �ּ���.");
				break;
			}
		}

	}

	public void userMenu() {
		user: while (true) {
			System.out.println("����� �޴� ===============");
			System.out.println(member.getName() + "�� �ݰ����ϴ�.");
			bookService.getList();
			System.out.println("1. �����뿩 2. �����ݳ� 0. �����޴� Q. ����");
			int menu = getInt();
			switch (menu) {
			case 1:
				System.out.println("�뿩�� ������ �Ϸ� ��ȣ�� �Է��� �ּ���.");
				bookService.getList();
				bookService.rentBook(getInt());
				break;
			case 2:
				System.out.println("�ݳ��� ������ �Ϸ� ��ȣ�� �Է��� �ּ���.");
				bookService.getList();
				bookService.returnBook(getInt());
				break;
			case 0:
				break user;
			default:
				System.err.println("�޴��� Ȯ�� �� �ٽ� �Է��� �ּ���.");
				break;
			}
		}

	}

	// ���� - ���� ������ ��ȯ�� ��ü�� null�� �ƴϸ� ���������� login�� ������Ų��.
	public MemberVo login() {
		while (true) {
			System.out.println("���̵� �Է��� �ּ���.");
			String id = getString();
			System.out.println("�н����带 �Է��� �ּ���.");
			String pw = getString();

			MemberVo memberVo = memberService.login(id, pw);
			if (memberVo != null) {
				// �α��� ����
				return memberVo;
			}
		}
	}

	// String ��ĳ��
	public static String getString() {
		String str = "";

		str = sc.next();
		if (str.equalsIgnoreCase("q")) {
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
		}
		return str;
	}

	// int ��ĳ��
	public static int getInt() {
		int i = 0;
		String str = "";
		while (true) {
			try {

				str = sc.next();
				if (str.equalsIgnoreCase("q")) {
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				return i;
			} catch (Exception e) {
				System.err.println("���� �Է� �� ������ �߻��߽��ϴ�.");
				System.err.println(e.getMessage());
			}
		}
	}
}
