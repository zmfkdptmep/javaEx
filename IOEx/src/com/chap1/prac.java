package com.chap1;

import java.io.FileOutputStream;
import java.io.IOException;

public class prac {
	public static void main(String[] args) {
		prac p = new prac();
		p.method1();
	}
	
	public void method1() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("test.dat");
			
			String a = "hello mother";
			byte[] byteArr = a.getBytes();
			fos.write(byteArr);
		}catch(IOException e) {
			e.getMessage();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
