package com.jungang;

class Member{
	String name;
	String engName;
	
	Member(){
		this("�ۿ���","song");
	}
	Member(String name, String engName){
		this.name = name;
		this.engName = engName;
	}
}

public class ConstructorOverloadingEx2 {
	public static void main(String[] args) {
		
		Member m1 = new Member("ȫ�浿","hong");
		
		System.out.println(m1.name);
		System.out.println(m1.engName);
		
	}

}
