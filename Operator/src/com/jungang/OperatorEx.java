package com.jungang;

public class OperatorEx {
	public static void main(String[] args) {
		int x=5,y=2;
		
		// 증감 연산자 (++/--) : 1증가, 1감소
		// 증감 연산자의 위치에 따라 값이 결정된다.
		System.out.println(x);
		System.out.println(++x); // 이 라인에서 증가
		System.out.println(x++); // 다음 라인에서 증가
		System.out.println(x);
		
		
		
		
		x = 10; y= 10;
		
		int result = ++x + 10; // 21 
		int result2 = y ++ + 10; // 21 x 다음 줄에서 21 여기선 20
		
		
		System.out.println(result+""+result2);
		
		System.out.println(" ============================ ");
		
	
		
		
		
		// 나머지 연산자 %
		// 두 수의 나눗셈 결과 나머지 값을 반환
		// -> 홀수인지 짝수인지 구분할 때
		
		if(x%y == 0) {
			System.out.println("x는 짝수");
		}else {
			System.out.println("x는 홀수");
		}
		
		System.out.println("=============================");
		
		// 비교 연산자의 연산 결과는 boolean 타입으로 반환
		
		boolean b = (x+y)<5;
		System.out.println("비교연산의 결과 : "+b);
		
		int a=12, a1=10;
		
		System.out.println(a!=a1); // == 값이 같냐?, != 값이 다르냐?
		System.out.println(!(a!=a1)); // 값이 다르냐? true, ! 붙으니까 반대
		
		
		
		
	}
}
