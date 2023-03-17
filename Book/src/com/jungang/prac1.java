package com.jungang;

import java.util.*;

public class prac1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		String result = String.valueOf(Double.parseDouble(a)/Double.parseDouble(b));
		
		if(Double.parseDouble(b)==0) {
			result = "무한대";
		}
		
		
		
		
		
		
		System.out.printf("결과:%s",result);
		
	}

}
