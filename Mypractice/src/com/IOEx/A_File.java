package com.IOEx;

import java.io.File;
import java.io.IOException;

public class A_File {
	public static void main(String[] args) {
		
		A_File a = new A_File();
		a.method1();
		a.method2();
		
	}
	
	public void method1() {
		File file = new File("test.txt");
		
		System.out.println("���� �� : "+file.getName());
		System.out.println("���� ��� : "+file.getAbsolutePath());
		System.out.println("��� ��� : "+file.getPath());
		System.out.println("���� �뷮 : "+file.length());
		System.out.println("���� ���� ���� : "+file.exists());
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void method2() {
		File file = new File("d:/test/test.txt");
		File dir = new File("d:/test");
		
		dir.mkdirs();
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
