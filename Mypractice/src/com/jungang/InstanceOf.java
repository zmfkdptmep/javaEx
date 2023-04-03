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
		
		
		// ������ �ν��Ͻ��� ������ Ŭ������ '�ڱ� ��'���� Ȯ�����ش�.
		
		// �ڽ� -> �θ� �� ����
		
		// �θ� -> �ڽ� �� �Ұ���
		
		// �θ��� �ʵ峪 �޼ҵ尡 �ڽĿ��� ����Ǿ��� ���ɼ��� ���⿡
		// �ڹٴ� ���ʿ� �θ� �ڽĿ��� �����ϴ� ���� �����Ѵ�.
		
	}

}
