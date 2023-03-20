package com.jungang;


import java.util.*;


public class NullPointerExceptionEx3 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		hi:
		while(true) {
			try {
				Integer a = sc.nextInt();
				System.out.println(a);
			}catch(InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.println("숫자만 입력해주세요.");
			}
		}
		
		
		
	
		
	}

}
