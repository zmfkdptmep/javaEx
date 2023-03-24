package com.jungang;

public class ForEx1 {
	public static void main(String[] args) {
		
		// 구구단 2단
		// for(초기식;조건식;증감식)
		int dan = 2;
		
		for(int i =1;i<10;i++) {
			System.out.printf("%dX%d = %d\n",dan,i,dan*i);
		}
		
	}
}
