package com.jungang;

public class OperatorEx {
	public static void main(String[] args) {
		int x=5,y=2;
		
		// ���� ������ (++/--) : 1����, 1����
		// ���� �������� ��ġ�� ���� ���� �����ȴ�.
		System.out.println(x);
		System.out.println(++x); // �� ���ο��� ����
		System.out.println(x++); // ���� ���ο��� ����
		System.out.println(x);
		
		
		
		
		x = 10; y= 10;
		
		int result = ++x + 10; // 21 
		int result2 = y ++ + 10; // 21 x ���� �ٿ��� 21 ���⼱ 20
		
		
		System.out.println(result+""+result2);
		
		System.out.println(" ============================ ");
		
	
		
		
		
		// ������ ������ %
		// �� ���� ������ ��� ������ ���� ��ȯ
		// -> Ȧ������ ¦������ ������ ��
		
		if(x%y == 0) {
			System.out.println("x�� ¦��");
		}else {
			System.out.println("x�� Ȧ��");
		}
		
		System.out.println("=============================");
		
		// �� �������� ���� ����� boolean Ÿ������ ��ȯ
		
		boolean b = (x+y)<5;
		System.out.println("�񱳿����� ��� : "+b);
		
		int a=12, a1=10;
		
		System.out.println(a!=a1); // == ���� ����?, != ���� �ٸ���?
		System.out.println(!(a!=a1)); // ���� �ٸ���? true, ! �����ϱ� �ݴ�
		
		
		
		
	}
}
