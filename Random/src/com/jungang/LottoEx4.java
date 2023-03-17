package com.jungang;

public class LottoEx4 {
	public static void main(String[] args) {
		
		int[] number = new int[6];
		
		for(int i=0;i<number.length;i++) {
			number[i]=(int)((Math.random()*45)+1);
			for(int j=0;j<i;j++) {
				if(number[i]==number[j]) {
					i--;
				}
			}
		}
		
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		System.out.println(number[3]);
		System.out.println(number[4]);
		System.out.println(number[5]);
	}

}

// if 의 i와 j는 누가 더 크냐 상관 없이
// 1만 차이나면 그만이다.
// 첫번째와 두번째, 두번째와 세번째를 확인하면 되기 때문이다.
// 하나하나 똑같다면 i-1 이 되어 해당 원소를 다시 랜덤으로 뽑기 때문에
// 세번째와 첫번째가 겹치거나 할 일은 없다.
// 하나씩 확인하면서 다음 원소를 뽑기 때문이다.

// 1-0, 2-0, 2-1, 3-0, 3-1, 3-2 의 원소가 같은지 확인하여
// 같다면 i를 1 깎아서 다시 뽑게 만든다.