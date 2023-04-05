package com.library.vo;

import java.util.Scanner;

public class App {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Library lib = new Library();
		App app = new App();
		String str = "";
		int menu = 0;
		// 로그인 창
		while (true) {
			System.out.println("로그인 하세요.");
			System.out.println("id : ");
			str = app.getString();

			// 관리자 메뉴
			admin: if (str.equalsIgnoreCase("admin")) {
				while (true) {
					System.out.println("관리자 메뉴입니다.");
					System.out.println(lib.toString());
					System.out.println("1. 도서등록 2. 도서삭제 0. 로그아웃 Q.종료");
					System.out.println("메뉴를 입력하세요.");
					menu = app.getInt();
					switch (menu) {
					case 1:
						System.out.println("일련 번호를 입력하세요.");
						int no = app.getInt();
						System.out.println("제목을 입력하세요.");
						String title = app.getString();
						System.out.println("작가명을 입력하세요.");
						String author = app.getString();
						lib.insertBook(no, title, author, false);
						break;
					case 2:
						System.out.println(lib.toString());
						System.out.println("지울 책 일련 번호를 입력하세요.");
						lib.deleteBook(app.getInt());
						break;
					case 0:
						System.out.println("로그아웃되었습니다.");
						break admin;
					default:
						System.err.println("잘못 입력하셨습니다.");
					}
				}
			}
			user: if (!str.equalsIgnoreCase("admin")) {
				while (true) {
					System.out.println(str + "님 반갑습니다.");
					System.out.println(lib.toString());
					System.out.println("1. 도서대여 2. 도서반납 0. 로그아웃 Q. 종료");
					int menu2 = app.getInt();
					switch (menu2) {
					case 1:
						System.out.println("대여할 도서의 일련 번호를 입력하세요.");
						lib.rentBook(app.getInt());
						break;
					case 2:
						System.out.println("반납할 도서의 일련 번호를 입력하세요.");
						lib.returnBook(app.getInt());
						break;
					case 0:
						System.out.println("로그아웃되었습니다.");
						break user;
					default:
						System.err.println("잘못된 번호입니다.");
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
			System.err.println("문자만 입력하세요.");
		} catch (Exception e) {
			if (str.equalsIgnoreCase("q")) {
				System.out.println("프로그램을 종료합니다.");
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
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				System.err.println("숫자만 입력하세요.");
			}
		}
		return i;
	}

}
