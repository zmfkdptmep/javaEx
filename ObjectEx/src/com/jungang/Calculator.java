package com.jungang;

import java.util.*;

public class Calculator {
	
	Scanner sc = new Scanner(System.in);
	
	int[] calNum = null;
	int sum = 0;
	double base = 0;
	double result = 0;
	
	void sum() {
		System.out.println("덧셈을 시작합니다. 숫자를 차례대로 입력해주세요.");
		for(int i =0;i<calNum.length;i++) {
			calNum[i]=sc.nextInt();
			System.out.println("더할 숫자 :"+calNum[i]);
			sum+= calNum[i];
		}
		System.out.println("합계는: "+sum+"입니다.\n");
		sum=0;
	}
	void minus() {
		System.out.println("뺄셈을 시작합니다. 숫자를 차례대로 입력해주세요.");
		for(int i =0;i<calNum.length;i++) {
			calNum[i]=sc.nextInt();
			System.out.println("뺄 숫자 :"+calNum[i]);
			if(i==0) {
				base = calNum[0];
			}
			if(i!=0) {
				sum+=calNum[i];
			}
		}
		result = (base -= sum);
		System.out.println("뺄셈 결과는: "+(int)result+"입니다.\n");
		sum=0;
	}
	void nanum() {
		System.out.println("나눗셈을 시작합니다. 숫자를 차례대로 입력해주세요.");
		for(int i=0;i<calNum.length;i++) {
			calNum[i] = sc.nextInt();
			System.out.println("나눌 숫자 :"+calNum[i]);
			if(i==0) {
				base = calNum[0];
			}
			if(i!=0) {
				base = (base/(double)calNum[i]);
			}
		}
		result = base;
		System.out.println("나눗셈 결과는: "+result+"입니다.\n");
	}
	
	void gob() {
		System.out.println("곱셈을 시작합니다. 숫자를 차례대로 입력해주세요.");
		for(int i=0;i<calNum.length;i++) {
			calNum[i] = sc.nextInt();
			System.out.println("곱할 숫자 : "+calNum[i]);
			if(i==0) {
				base = calNum[0];
			}
			if(i!=0) {
				base = base*calNum[i];
			}
		}
		result = base;
		System.out.println("곱셈 결과는: "+(int)result+"입니다.\n");
	}
}
