package com.Exception;

public class prac1 {
	public static void main(String[] args) {
		
		String[] strArr = {"10","2a"};
		int value = 0;
		for(int i=0;i<=2;i++) {
			try {
				value = Integer.parseInt(strArr[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�ε����� �ʰ�����");
			}catch(NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ�� �� ����");
			}finally {
				System.out.println(value);
			}
		}
	}

}
