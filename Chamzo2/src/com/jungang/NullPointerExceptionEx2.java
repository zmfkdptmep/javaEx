package com.jungang;

import java.util.*;

// 문자열인지 정수인지 아닌지 구분하는 메소드

class MainForm{
	public static boolean isInteger(String strValue) {
		
		try {
			Integer.parseInt(strValue); // 정수로 변환.
			return true;                // exception 없이 변환되면 true
		}catch(NumberFormatException e) {
			return false;
		}

	}
	
	public static boolean isLong(String strValue) {
		try {
			Long.parseLong(strValue);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean isFloat(String strValue) {
		try {
			Float.parseFloat(strValue);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean isDouble(String strValue) {
		try {
			Double.parseDouble(strValue);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	
	
}


public class NullPointerExceptionEx2 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[Integer 클래스의 parseInt() 메소드 사용]");
		System.out.println("+10은 정수인가? "+ MainForm.isInteger("+10"));
		
		String a = sc.next();
		
		if(MainForm.isInteger(a)==true) {
			System.out.println("정수네용.");
		}else if(MainForm.isDouble(a)==true){
			System.out.println("실수에용.");
		}else {
			System.out.println("문자열이에용.");
		}
		
		
		
		
	

}
}