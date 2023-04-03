package com.jungang;

class Parent{}
class Child extends Parent{}


public class InstanceOf {
	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		
		System.out.println(p1 instanceof Parent);
		System.out.println(c1 instanceof Parent);
		System.out.println(p1 instanceof Child);
		
		
		// 좌항의 인스턴스가 우항의 클래스가 '자기 집'인지 확인해준다.
		
		// 자식 -> 부모 집 가능
		
		// 부모 -> 자식 집 불가능
		
		// 부모의 필드나 메소드가 자식에서 변경되었을 가능성이 높기에
		// 자바는 애초에 부모가 자식에게 간섭하는 것을 차단한다.
		
	}

}
