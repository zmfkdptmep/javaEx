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
		// �����ڿ��� �ٸ� �����ڸ� �θ����� this()�� ����.
		// �Ű������� �����Ͽ� �ش� �����ڸ� ȣ���ϴ� ���̴�.
		
		// ����, �� ��� this�� '�θ� �������� �ñ״�ó + �߰� �Ű�����'����
		// exception�� �߻����� �ʴ´�.
		// ����, �ݵ�� �������� ù��°�ٿ� �ۼ��ؾ� �Ѵ�.
	}
	
}


public class ConstructorOverloadingEx1 {
	

}
