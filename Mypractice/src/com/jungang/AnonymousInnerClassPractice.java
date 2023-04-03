package com.jungang;

class Animal{
	
	public String bark() {
		return "동물이 웁니다.";
	}
}


public class AnonymousInnerClassPractice {

	public static void main(String[] args) {
		
		Animal Dog = new Animal() {
			public String bark() {
				return "개가 짖습니다.";
			}
		};
		
		
		System.out.println(Dog.bark());
	}
}
