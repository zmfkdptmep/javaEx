package com.jungang;

import java.util.Scanner;

public class prac3Login {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵�:");
		String name = sc.nextLine();
		if(name.equals("java")) {
			System.out.println("���̵� ��ġ�մϴ�. �н����带 �Է����ּ���.");
			System.out.println("�н�����:");
			String strPassword = sc.nextLine();
			int password = Integer.parseInt(strPassword);
			if(password==12345) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("�н����尡 Ʋ�Ƚ��ϴ�.");
			}
		}else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�. ���̵� �ٽ� Ȯ�����ּ���.");
		}
		
		
		
	}

}
