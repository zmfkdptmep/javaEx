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

// if �� i�� j�� ���� �� ũ�� ��� ����
// 1�� ���̳��� �׸��̴�.
// ù��°�� �ι�°, �ι�°�� ����°�� Ȯ���ϸ� �Ǳ� �����̴�.
// �ϳ��ϳ� �Ȱ��ٸ� i-1 �� �Ǿ� �ش� ���Ҹ� �ٽ� �������� �̱� ������
// ����°�� ù��°�� ��ġ�ų� �� ���� ����.
// �ϳ��� Ȯ���ϸ鼭 ���� ���Ҹ� �̱� �����̴�.

// 1-0, 2-0, 2-1, 3-0, 3-1, 3-2 �� ���Ұ� ������ Ȯ���Ͽ�
// ���ٸ� i�� 1 ��Ƽ� �ٽ� �̰� �����.