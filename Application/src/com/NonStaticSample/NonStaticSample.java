package com.NonStaticSample;

public class NonStaticSample {
	
	public void printLottoNumbers() {
		int[] random = new int[6];
		for(int i = 0;i<random.length;i++) {
			random[i] = (int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(random[i]==random[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("1. 랜덤 값 : ");
		for(int e : random) {
			System.out.print(e+" ");
		}
		System.out.println("");
	}
	
	public void outputChar(int num, char c) {
		System.out.print("2. "+c+"문자 "+num+"개 출력 : ");
		for(int i=0;i<num;i++) {
			System.out.print(c+" ");
		}
		System.out.println("");
	}
	// 65 ~ 90 대문자 , 97~122 소문자
	public char alphabette() {
		
		char result = (char)random01((int)(Math.random()*2));
		System.out.println("3. 랜덤 영문자 출력 : "+result);
		return result;
	}
	
	
	public int random01(int random) {
		if(random==0) {
			return ((int)((Math.random()*26)+65));
		}
		return ((int)((Math.random()*26)+97));
	}
	
	public String mySubstring(String str, int index1, int index2) {
		
		String result = str.substring(index1,index2);
		System.out.println("4. "+str+"의 "+index1+"번"+index2+"번 인덱스 사이의 값 출력 : "+result);
		return result;
			
	}

}
