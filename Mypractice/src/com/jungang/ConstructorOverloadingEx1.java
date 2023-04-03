package com.jungang;

class Ex1{
	int a;
	String b;
	
	Ex1(int a, String b){
		this.a = a;
		this.b = b;
	}
	
	Ex1(int a, String b, double c){
		this(a, b);
		// 생성자에서 다른 생성자를 부를때는 this()을 쓴다.
		// 매개변수로 구분하여 해당 생성자를 호출하는 것이다.
		
		// 또한, 이 경우 this로 '부른 생성자의 시그니처 + 추가 매개변수'여야
		// exception이 발생하지 않는다.
		// 또한, 반드시 생성자의 첫번째줄에 작성해야 한다.
	}
	
}


public class ConstructorOverloadingEx1 {
	

}
