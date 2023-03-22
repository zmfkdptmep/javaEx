package com.jungang;

import java.util.*;

public class CalculatorMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator c1 = new Calculator();
		boolean run = true;
		
		while(run) {
			System.out.println("몇 개의 숫자를 계산할지 알려주세요.");
			
			c1.calNum = new int[sc.nextInt()];
			
			System.out.println("계산할 부호를 선택해주세요.");
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
			
			System.out.println("계산이 완료되었습니다.");
			System.out.println("종료는 'q'를 입력하세요.");
			String how2= sc.next();
			if(how2.equals("q")) {
				run = false;
			}else {
				continue;
			}

			
		}
		
		
	}

}
