package com.jungang;

import java.util.*;

public class CalculatorMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator c1 = new Calculator();
		boolean run = true;
		
		while(run) {
			System.out.println("�� ���� ���ڸ� ������� �˷��ּ���.");
			
			c1.calNum = new int[sc.nextInt()];
			
			System.out.println("����� ��ȣ�� �������ּ���.");
			String how = sc.next();
			
			if(how.equals("+")) {
				c1.sum();
			}else if(how.equals("-")){
				c1.minus();				
			}else if(how.equals("/")) {
				c1.nanum();
			}else if(how.equals("*")) {
				c1.gob();
			}
			
			System.out.println("����� �Ϸ�Ǿ����ϴ�.");
			System.out.println("����� 'q'�� �Է��ϼ���.");
			String how2= sc.next();
			if(how2.equals("q")) {
				run = false;
			}else {
				continue;
			}

			
		}
		
		
	}

}
