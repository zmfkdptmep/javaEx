package com.jungang;

public class RandomEx {
	public static void main(String[] args) {
		
		// Math.random()
		// 0.0 ~ 1.0 사이의 무작위 double을 리턴
		// 0.000000...1 ~ 0.9999999...9
		// 10을 곱하면 0~9 +1 -> 1~10
		// 100을 곱하면 00~99
		
		// 곱하고 더해서 범위 지정
		
		// int num = (int)(Math.random()*n)+start ;
		
		
		
		double rotto1 = Math.random();
		double rotto2 = Math.random();
		double rotto3 = Math.random();
		double rotto4 = Math.random();
		double rotto5 = Math.random();
		
		System.out.println(rotto1);
		System.out.println(rotto2);
		System.out.println(rotto3);
		System.out.println(rotto4);
		System.out.println(rotto5);
		
		
		int num = (int)(Math.random()*6)+1;
		System.out.println(num);
		
	}

}
