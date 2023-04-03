package com.NonStaticSample;

public class Main {
	public static void main(String[] args) {
		
		
		NonStaticSample n1 = new NonStaticSample();
		NonStaticSample n2 = new NonStaticSample();
		
		n1.setValue("korea");
		n1.setChar(0, 'C', n1.getValue());
		System.out.println(n1.getValue());
		
		n1.setChar(n2, "hi");
		System.out.println(n2.getValue());
	}

}
