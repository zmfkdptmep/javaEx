package com.jungang;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library lib = new Library();
		boolean how = false;
		printTitle("도서관에 오신걸 환영합니다.");
		
		while(true) {
			// 로그인
			printTitle("로그인 해주세요.");
			printTitle("id: ");
			String id = getString(sc);
			if(!id.equals("swj96")) {
				how = false;
			}
			
			// 관리자 메뉴
			admin:
			if(id.equals("swj96")) {
				printTitle("관리자 메뉴입니다.");
				while(true) {
				lib.info();
				printTitle("1. 책 등록 | 2. 책 삭제 | 0. 로그아웃 | Q. 종료");
				int menuAdmin = getInt(sc);
				switch(menuAdmin) {
				case 1:
					printTitle("책 이름을 입력하세요.");
					String title = getString(sc);
					printTitle("작가 이름을 입력하세요.");
					String author = getString(sc); 
					lib.insertBook(title, author);
					break;
				case 2:
					printTitle("삭제할 책 번호를 입력해 주세요.");
					lib.deleteBook(getInt(sc));
					break;
				case 0:
					how = true;
					break admin;
			    default:
			    	System.err.println("메뉴에 없는 번호입니다.\n다시 입력해 주세요.");
				}
			}
		}
			// 사용자 메뉴
			user:
			if(!how) {
			while(true) {
				lib.info();
				printTitle("안녕하세요, "+id+"님");
				printTitle("메뉴를 선택해주세요.");
				printTitle("1. 대여 | 2. 반납 | 0. 로그아웃 | Q. 종료");
				int menu = getInt(sc);
				
				switch(menu) {
				case 1:
					printTitle("빌릴 책을 선택해 주세요.");
					lib.info();
					lib.rentBook(getInt(sc));
					break;
				case 2:
					printTitle("반납할 책 번호를 입력해 주세요.");
					lib.info();
					lib.returnBook(getInt(sc));
					break;
				case 0:
					break user;
				default:
					System.err.println("메뉴에 존재하지 않는 번호입니다.\n다시 입력해 주세요.");
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
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			System.out.println(sc.next()+" : 입력 불가능 합니다.");
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
