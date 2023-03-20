package com.jungang;

import java.util.*;

// ���ڿ����� �������� �ƴ��� �����ϴ� �޼ҵ�

class MainForm{
	public static boolean isInteger(String strValue) {
		
		try {
			Integer.parseInt(strValue); // ������ ��ȯ.
			return true;                // exception ���� ��ȯ�Ǹ� true
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
		System.out.println("[Integer Ŭ������ parseInt() �޼ҵ� ���]");
		System.out.println("+10�� �����ΰ�? "+ MainForm.isInteger("+10"));
		
		String a = sc.next();
		
		if(MainForm.isInteger(a)==true) {
			System.out.println("�����׿�.");
		}else if(MainForm.isDouble(a)==true){
			System.out.println("�Ǽ�����.");
		}else {
			System.out.println("���ڿ��̿���.");
		}
		
		
		
		
	

}
}