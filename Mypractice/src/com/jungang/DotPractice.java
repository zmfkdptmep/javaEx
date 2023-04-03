package com.jungang;

class Dot{
	int a,b;
	int c;
	Dot(int...a){
		for(int i=0;i<a.length;i++) {
			c += a[i];
		}
		System.out.println(c);
	}
	void sum(int...is) { // int[] 형식으로 받는다. 인자 갯수를 모를때!
		int d=0;
		for(int i =0;i<is.length;i++) {
			d += is[i];
		}
		
		System.out.println(d);
	}
}


public class DotPractice {
	public static void main(String[] args) {
		
		Dot d1 = new Dot(1,2,3,4,5);
		
		d1.sum(10,24112,234234,23);
	}

}
