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
		
		System.out.println("파일 명 : "+file.getName());
		System.out.println("절대 경로 : "+file.getAbsolutePath());
		System.out.println("상대 경로 : "+file.getPath());
		System.out.println("파일 용량 : "+file.length());
		System.out.println("파일 존재 여부 : "+file.exists());
		
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
