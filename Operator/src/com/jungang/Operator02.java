package com.jungang;

public class Operator02 {
	public static void main(String[] args) {
		int x=10,y=5,z=3;
		
		// 그리고 두 개의 항이 모두 true 일때,
		// true true
		// & : 두항 모두 연산하고 비교한다.
		// && : 첫번째 항이 false면 두번째 항 확인 안함
		// 결국 결과는 같다. 리소스 낭비인가..?
		System.out.println(x>y && x>z);
		System.out.println(x>y & x>z);
		
		// 또는 두개의 항중 하나만 true여도 true
		// | : 두항 모두 연산하고 비교한다.
		// || : 첫번째 항이 true일 경우 두번째 항은 확인하지 않는다.
		
		System.out.println(x>z || x<y); // true, false = true
		System.out.println(x<z || x>y); // false, true = true
		System.out.println(x>y | y<z); // true , false = true
		
		// 삼항 연산자
		// (조건)?참:거짓
		int score = 95;
		String res = (score>90)?"A":"B";
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
	}

}
