package com.library.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.library.dao.Dao;
import com.library.dao.FileDao;

public class App {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// 라이브러리 생성
		Library lib = new Library();
		App app = new App();

		// 자주 사용하는 로직은 메소드로 빼면 좋다.
		while (true) {
			// 로그인
			// id를 입력받아서 admin이면 관리자 아니면 사용자
			System.out.println("환영합니다.");
			System.out.println("id : ");
			String str = app.getString();
			admin: while (true) {
				if (str.equalsIgnoreCase("admin")) {
					System.out.println("관리자 메뉴입니다.");
					System.out.println(lib.toString());
					System.out.println("1. 도서등록 2. 도서삭제 0. 로그아웃 q. 종료");
					System.out.println("메뉴를 입력해 주세요.");
					int menu = app.getInt();
					switch (menu) {
					case 1:
						System.out.println("일련번호를 입력하세요.");
						int no = app.getIntOnly();
						System.out.println("제목을 입력하세요.");
						String title = app.getString();
						System.out.println("작가를 입력하세요.");
						String author = app.getString();
						lib.insertBook(no, title, author, false);
						break;
					case 2:
						while (true) {
							System.out.println(lib.toString());
							System.out.println("지우실 책의 일련번호를 입력해주세요.");
							int value = app.getIntOnly();
							if (lib.deleteBook(value)) {
								break;
							} else {
								continue;
							}
						}
					case 0:
						System.out.println("로그아웃 되었습니다.");
						break admin;
					default:
						System.err.println(menu + " 없는 메뉴입니다.");
						break;
					}
				}
				user:
					while (true) {
					if (!str.equalsIgnoreCase("admin")) {
						System.out.println(str + "님 환영합니다.");
						System.out.println(lib.toString());
						System.out.println("1. 도서대여 2. 도서반납 0. 로그아웃 q. 종료");
						System.out.println("메뉴를 입력하세요.");
						int menu = app.getInt();
						int value = 0;
						bye:
						switch (menu) {
						case 1:
							while (true) {
								System.out.println(lib.toString());
								System.out.println("대여할 책의 일련번호를 입력하세요.");
								value = app.getIntOnly();
								boolean res = lib.rentBook(value);
								if (res) {
									System.out.println("대여 완료");
									break;
								}
							}
							
							break;
						case 2:
							while (true) {
								System.out.println(lib.toString());
								System.out.println("반납할 책의 일련번호를 입력하세요.");
								value = app.getIntOnly();
								if(lib.returnBook(value)) {
									break;
								}
							}
							break;
						case 0:
							System.out.println(str + "님 로그아웃합니다.");
							break user;
						default:
							System.err.println(menu + " 없는 메뉴입니다.");
							break;
						}
					}
				}
			}
		}
	}

	// 어드민 - 책 등록, 책 삭제
	// 사용자 - 책 대여, 책 반납

	public String getString() {
		String str = "";
		while (true) {
			try {
				str = sc.next();
				Integer.parseInt(str);
				System.err.println("문자를 입력해주세요.");
				if (str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
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
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				value = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				sc.next();
				System.err.print("숫자를 입력하세요.\n다시 입력하세요.");
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
				System.err.println("숫자를 입력하세요.");
			}
		}
		return value;
	}

}
