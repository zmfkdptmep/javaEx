package com.StaticSample;

public class StaticSample {
	
	private static String value;
	private static String a = "";
	private static String b = "";
	
	public static void toUpper() { // 소문자 index - 32 = 대문자
		 char[] cArr = new char[value.length()];
		 
		 for(int i=0; i<cArr.length;i++) {
			 cArr[i] = (char)(value.charAt(i));
			 if(cArr[i]>=97) {
				 cArr[i] = (char)(value.charAt(i)-32);
				 
			 }
		 }
		 value = String.valueOf(cArr);
		 a = a.toUpperCase();
	}
	public static void setChar(int index, char c) {
		char[] cArr = new char[value.length()];
		for(int i=0;i<cArr.length;i++) {
			cArr[i] = value.charAt(i);
		}
		for(int i=0;i<cArr.length;i++) {
			if(i==index) {
				cArr[i] = c;
			}
		}
		setValue(String.valueOf(cArr));
	}
	public static void setChar2(int index, char c) {
		char[] cArr = a.toCharArray(); // a를 char 배열로 변환
		cArr[index] = c; 
		a = String.valueOf(cArr); // char[]을 다시 String으로 변환
	}
	public static int valueLength() {
		return getValue().length();
	}
	public static int aLength() {
		return getA().length();
	}
	public static String valueConcat(String str) {
		setValue(value+str);
		return getValue();
	}
	public static String valueConcat2(String str) {
		setA(a+str);
		return getA();
	}
	public static String getValue() {
		return value;
	}
	public static void setValue(String value) {
		StaticSample.value = value;
	}
	public static void setA(String a) {
		StaticSample.a = a;
	}
	public static String getA() {
		return a;
	}
	public static void setChar2(int index, char c, String a) {
		char[] cArr = a.toCharArray();
		cArr[index] = c;
		b = String.valueOf(cArr);
	}
	public static String toUpper(String str1, String str2) {
		str1 = str2.toUpperCase();
		b = str1;
		return str2;
	}
	
	
	public static String getB() {
		setChar2(0,'C',b);
		toUpper(b,b);
		return b;
	}
	public static void setB(String str) {
		b = str;
	}
	
	
	

}
