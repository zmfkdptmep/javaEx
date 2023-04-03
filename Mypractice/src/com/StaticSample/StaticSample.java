package com.StaticSample;

public class StaticSample {
	private static String value;
	
	
	
	public static String getValue() {
		return value;
	}
	
	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	public static void toUpper(String value) {
		setValue(value.toUpperCase());
	}
	public static void setChar(int index, char c) {
		char[] cArr = getValue().toCharArray();
		cArr[index] = c;
		setValue(String.valueOf(cArr));
	}
	public static void stringConcat(String value) {
		setValue(getValue()+value);
	}
	public static void stringLength(String value) {
		System.out.println(value.length());
	}

}
