package com.jungang;

class Animal{
	
	public String bark() {
		return "������ ��ϴ�.";
	}
}


public class AnonymousInnerClassPractice {

	public static void main(String[] args) {
		
		Animal Dog = new Animal() {
			public String bark() {
				return "���� ¢���ϴ�.";
			}
		};
		
		
		System.out.println(Dog.bark());
	}
}
