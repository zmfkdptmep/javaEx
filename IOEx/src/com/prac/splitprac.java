package com.prac;

public class splitprac {
	public static void main(String[] args) {
		
		String a = "안녕하세요 원준입니다.";
		String[] arr = a.split(" ");
		
		for(String e:arr) {
			System.out.println(e);
		}
	}

}
