package com.prac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class prac1 {
	public static void main(String[] args) {
		
		prac1 p = new prac1();
		long start,end;
		start = System.currentTimeMillis();
		p.fileIOCopy();
		end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	public void fileIOCopy() {
		File file = new File("D:\\javaEx\\IOEx\\myPrac.txt");
		if(!file.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		
		try(FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream("myPrac_copy.txt");){
			
			int value = 0;
			while((value=fis.read())!=-1) {
				fos.write(value);
			}
			fos.flush();
			
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}
	}
	
	
	public void fileCopy() {
		try(FileInputStream fis = new FileInputStream("b_char.txt");
		FileOutputStream fos = new FileOutputStream("myPrac.txt");){
			
			
			int value = 0;
			while((value=fis.read())!=-1) {
				fos.write(value);
			}
			fos.flush();
				
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}
	}
	
	

}
