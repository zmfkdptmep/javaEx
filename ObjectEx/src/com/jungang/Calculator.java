package com.jungang;

import java.util.*;

public class Calculator {
	
	Scanner sc = new Scanner(System.in);
	
	int[] calNum = null;
	int sum = 0;
	double base = 0;
	double result = 0;
	
	void sum() {
		System.out.println("������ �����մϴ�. ���ڸ� ���ʴ�� �Է����ּ���.");
		for(int i =0;i<calNum.length;i++) {
			calNum[i]=sc.nextInt();
			System.out.println("���� ���� :"+calNum[i]);
			sum+= calNum[i];
		}
		System.out.println("�հ��: "+sum+"�Դϴ�.\n");
		sum=0;
	}
	void minus() {
		System.out.println("������ �����մϴ�. ���ڸ� ���ʴ�� �Է����ּ���.");
		for(int i =0;i<calNum.length;i++) {
			calNum[i]=sc.nextInt();
			System.out.println("�� ���� :"+calNum[i]);
			if(i==0) {
				base = calNum[0];
			}
			if(i!=0) {
				sum+=calNum[i];
			}
		}
		result = (base -= sum);
		System.out.println("���� �����: "+(int)result+"�Դϴ�.\n");
		sum=0;
	}
	void nanum() {
		System.out.println("�������� �����մϴ�. ���ڸ� ���ʴ�� �Է����ּ���.");
		for(int i=0;i<calNum.length;i++) {
			calNum[i] = sc.nextInt();
			System.out.println("���� ���� :"+calNum[i]);
			if(i==0) {
				base = calNum[0];
			}
			if(i!=0) {
				base = (base/(double)calNum[i]);
			}
		}
		result = base;
		System.out.println("������ �����: "+result+"�Դϴ�.\n");
	}
	
	void gob() {
		System.out.println("������ �����մϴ�. ���ڸ� ���ʴ�� �Է����ּ���.");
		for(int i=0;i<calNum.length;i++) {
			calNum[i] = sc.nextInt();
			System.out.println("���� ���� : "+calNum[i]);
			if(i==0) {
				base = calNum[0];
			}
			if(i!=0) {
				base = base*calNum[i];
			}
		}
		result = base;
		System.out.println("���� �����: "+(int)result+"�Դϴ�.\n");
	}
}
