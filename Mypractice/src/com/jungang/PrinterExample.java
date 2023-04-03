package com.jungang;

class Printer{
	
	void println(int a) {
		System.out.println(a);
	}
	void println(String a) {
		System.out.println(a);
	}
	void println(boolean a) {
		System.out.println(a);
	}
	void println(double a) {
		System.out.println(a);
	}
}

public class PrinterExample {
	public static void main(String[] args) {
		Printer p1 = new Printer();
		p1.println(10);
		p1.println(true);
		p1.println(5.7);
		p1.println("ȫ�浿");
	}

}
