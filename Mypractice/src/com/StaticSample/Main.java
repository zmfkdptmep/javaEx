package com.StaticSample;

public class Main {
	public static void main(String[] args) {
		
		StaticSample.setValue("asdfe");
		System.out.println(StaticSample.getValue());
		StaticSample.toUpper(StaticSample.getValue());
		System.out.println(StaticSample.getValue());
		StaticSample.setChar(0, 'S');
		System.out.println(StaticSample.getValue());
		StaticSample.stringConcat("HAHA");
		System.out.println(StaticSample.getValue());
		StaticSample.stringLength(StaticSample.getValue());
	}

}
