package com.jungang;

public class Operator02 {
	public static void main(String[] args) {
		int x=10,y=5,z=3;
		
		// �׸��� �� ���� ���� ��� true �϶�,
		// true true
		// & : ���� ��� �����ϰ� ���Ѵ�.
		// && : ù��° ���� false�� �ι�° �� Ȯ�� ����
		// �ᱹ ����� ����. ���ҽ� �����ΰ�..?
		System.out.println(x>y && x>z);
		System.out.println(x>y & x>z);
		
		// �Ǵ� �ΰ��� ���� �ϳ��� true���� true
		// | : ���� ��� �����ϰ� ���Ѵ�.
		// || : ù��° ���� true�� ��� �ι�° ���� Ȯ������ �ʴ´�.
		
		System.out.println(x>z || x<y); // true, false = true
		System.out.println(x<z || x>y); // false, true = true
		System.out.println(x>y | y<z); // true , false = true
		
		// ���� ������
		// (����)?��:����
		int score = 95;
		String res = (score>90)?"A":"B";
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
	}

}
