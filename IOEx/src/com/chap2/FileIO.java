package com.chap2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {
	public static void main(String[] args) {
		FileIO io = new FileIO();
		long start, end;
		start = System.currentTimeMillis();
		io.fileIOCopy();
		end = System.currentTimeMillis();
		System.out.println("소요시간 : "+ (end - start));
	}
	
	/**
	 * 파일 복사하기
	 * 
	 * A_File.java 파일을 읽어서
	 * A_File_copy.java 파일을 생성 합니다.
	 */
	public void fileIOCopy() {
		
		long startTime, endTime;
		// 시작시간
		startTime = System.currentTimeMillis();
		
		
		File file = new File("D:\\javaEx\\IOEx\\src\\com\\chap1\\A_File.java");
		// 파일의 존재 여부를 확인후 존재하지 않으면 종료 
		if(!file.exists()) {
			System.out.print("파일이 존재하지 않습니다.");
			return;
		}
		
		try (FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream("A_File_copy.java")){
			
			int value =0;
			// 1바이트씩 읽어 옵니다.
			// -1 EndOfFile
			while( (value = fis.read()) != -1 ) {
				//System.out.print((char)value);
				fos.write(value);
			}
			
			fos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime - startTime));
		
	}
	

	/**
	 * 복사하기 - 복사할 파일을 준비
	 * 
	 * FileInputStream 읽어와서
	 * FileOutputStream 저장하기
	 */
	public void fileCopy() {
		
		try (
				FileInputStream fis 
					= new FileInputStream("예외클래스.pptx");
				FileOutputStream fos 
					= new FileOutputStream("예외클래스_copy.pptx");
				
				) {
			
			int value = 0;
			
			while((value = fis.read()) != -1) {
				fos.write(value);
			}
			
			fos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}
}





















