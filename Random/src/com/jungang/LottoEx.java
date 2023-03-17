package com.jungang;

import java.util.*;

public class LottoEx {
	public static void main(String[] args) {
		
		// 겹치지 않는 6개 숫자 1~45
		
		HashSet<Integer> set = new HashSet<>();
				
		
		set.add((int)(Math.random()*44)+1);
		set.add((int)(Math.random()*44)+1);
		set.add((int)(Math.random()*44)+1);
		set.add((int)(Math.random()*44)+1);
		set.add((int)(Math.random()*44)+1);
		
		
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println("로또 번호는: "+ iter.next());
		}
		
		
	}

}
