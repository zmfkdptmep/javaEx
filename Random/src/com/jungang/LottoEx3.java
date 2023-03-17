package com.jungang;

import java.util.*;

public class LottoEx3 {
	public static void main(String[] args) {
		
		
		
		int[] Lotto = new int[6];
		
		
		for(int i=0; i<Lotto.length;i++) {
			Lotto[i]=(int)((Math.random()*45)+1);
			for(int j=0;j<i;j++) {
				if(Lotto[i]==Lotto[j]) {
					i--;
				}
			}
		}
		
		
		System.out.println(Lotto[0]);
		System.out.println(Lotto[1]);
		System.out.println(Lotto[2]);
		System.out.println(Lotto[3]);
		System.out.println(Lotto[4]);
		System.out.println(Lotto[5]);
		
		
			
		}
		
				
		
		
		
	
		
		
		
		
		
	}

	

