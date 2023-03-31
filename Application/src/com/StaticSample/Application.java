package com.StaticSample;

public class Application {
	public static void main(String[] args) {
		
		StaticSample.setValue("Java");
		System.out.println(StaticSample.getValue());
		StaticSample.toUpper();
		System.out.println(StaticSample.getValue());
		System.out.println(StaticSample.valueLength());
		StaticSample.valueConcat("PROGRAMMING");
		System.out.println(StaticSample.getValue());
		StaticSample.setChar(0,'C');
		System.out.println(StaticSample.getValue()); 
		// value를 참조하기에 CAVA만 나오지 않고
		// Cancat메소드에서 붙힌 문자열이 합쳐진 채로 출력됌.
		
		System.out.println("=======================");
		StaticSample.setA("Java");
		StaticSample.setB("Java");
		System.out.println(StaticSample.getA());
		StaticSample.toUpper();
		System.out.println(StaticSample.getA());
		System.out.println(StaticSample.aLength());
		StaticSample.valueConcat2("PROGRAMMING");
		System.out.println(StaticSample.getA());
		System.out.println(StaticSample.getB());
	}

}
