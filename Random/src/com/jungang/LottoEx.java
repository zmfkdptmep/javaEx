package com.jungang;

import java.util.*;

public class LottoEx {
	public static void main(String[] args) {
		
		// ��ġ�� �ʴ� 6�� ���� 1~45
		
		HashSet<Integer> set = new HashSet<>();
				
		
		set.add((int)(Math.random()*44)+1);
		set.add((int)(Math.random()*44)+1);
		set.add((int)(Math.random()*44)+1);
		set.add((int)(Math.random()*44)+1);
		set.add((int)(Math.random()*44)+1);
		
		
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println("�ζ� ��ȣ��: "+ iter.next());
		}
		
		
	}

}
