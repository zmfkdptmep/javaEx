package com.jungang;

import java.util.Scanner;

public class prac3Login {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디:");
		String name = sc.nextLine();
		if(name.equals("java")) {
			System.out.println("아이디가 일치합니다. 패스워드를 입력해주세요.");
			System.out.println("패스워드:");
			String strPassword = sc.nextLine();
			int password = Integer.parseInt(strPassword);
			if(password==12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("패스워드가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다. 아이디를 다시 확인해주세요.");
		}
		
		
		
	}

}
