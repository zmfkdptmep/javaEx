package com.library.controller;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.vo.BookVo;
import com.library.vo.MemberVo;

import java.util.Scanner;

public class LibraryController {
	static Scanner sc = new Scanner(System.in);

	// 사용자의 요청을 받아 알맞은 기능을 제공
	// dao - service에 거쳐 최종적으로 사용자에게 제공하는 로직
	BookService bookService = new BookService();
	MemberService memberService = new MemberService();
	MemberVo member = null;

	public void start() {
		while (true) {
			System.out.println("============");
			System.out.println("도서관에 오신걸 환영합니다.");
			System.out.println("============");
			// login().get 해도 되는데 member에 담는 스타일
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
			System.out.println("관리자 메뉴 ============");
			bookService.getList();
			System.out.println("1. 도서등록 2. 도서삭제 3. 사용자등록 4. 사용자삭제 0. 이전메뉴 Q.종료");
			int menu = getInt();
			int no = 0;
			String id = "";

			switch (menu) {
			case 1:
				System.out.println("일련 번호를 입력해 주세요.");
				no = getInt();
				System.out.println("제목을 입력해 주세요.");
				String title = getString();
				System.out.println("작가를 입력해 주세요.");
				String author = getString();
				bookService.insertBook(no, title, author);
				break;
			case 2:
				System.out.println("삭제할 책의 일련 번호를 입력해 주세요.");
				no = getInt();
				bookService.deleteBook(no);
				break;
			case 3:
				System.out.println("등록할 id를 입력해 주세요.");
				id = getString();
				System.out.println("등록할 pwd를 입력해 주세요.");
				String pw = getString();
				System.out.println("이름을 입력해 주세요.");
				String name = getString();
				System.out.println("관리자 계정이라면 Y를 입력해 주세요.");
				String str = getString();
				String adminYN = (str.equalsIgnoreCase("Y")) ? "Y" : "N";
				memberService.insertMember(id, pw, name, adminYN);
				break;
			case 4:
				System.out.println("삭제할 id를 입력해 주세요.");
				memberService.getList();
				id = getString();
				memberService.deleteMember(id);
				break;
			case 0:
				break admin;
			default:
				System.err.println("메뉴를 확인 후 다시 입력해 주세요.");
				break;
			}
		}

	}

	public void userMenu() {
		user: while (true) {
			System.out.println("사용자 메뉴 ===============");
			System.out.println(member.getName() + "님 반갑습니다.");
			bookService.getList();
			System.out.println("1. 도서대여 2. 도서반납 0. 이전메뉴 Q. 종료");
			int menu = getInt();
			switch (menu) {
			case 1:
				System.out.println("대여할 도서의 일련 번호를 입력해 주세요.");
				bookService.getList();
				bookService.rentBook(getInt());
				break;
			case 2:
				System.out.println("반납할 도서의 일련 번호를 입력해 주세요.");
				bookService.getList();
				bookService.returnBook(getInt());
				break;
			case 0:
				break user;
			default:
				System.err.println("메뉴를 확인 후 다시 입력해 주세요.");
				break;
			}
		}

	}

	// 검증 - 검증 서비스후 반환된 객체가 null이 아니면 최종적으로 login을 성공시킨다.
	public MemberVo login() {
		while (true) {
			System.out.println("아이디를 입력해 주세요.");
			String id = getString();
			System.out.println("패스워드를 입력해 주세요.");
			String pw = getString();

			MemberVo memberVo = memberService.login(id, pw);
			if (memberVo != null) {
				// 로그인 성공
				return memberVo;
			}
		}
	}

	// String 스캐너
	public static String getString() {
		String str = "";

		str = sc.next();
		if (str.equalsIgnoreCase("q")) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
		return str;
	}

	// int 스캐너
	public static int getInt() {
		int i = 0;
		String str = "";
		while (true) {
			try {

				str = sc.next();
				if (str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				return i;
			} catch (Exception e) {
				System.err.println("숫자 입력 중 오류가 발생했습니다.");
				System.err.println(e.getMessage());
			}
		}
	}
}
