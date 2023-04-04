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
		System.out.println("�ҿ�ð� : "+ (end - start));
	}
	
	/**
	 * ���� �����ϱ�
	 * 
	 * A_File.java ������ �о
	 * A_File_copy.java ������ ���� �մϴ�.
	 */
	public void fileIOCopy() {
		
		long startTime, endTime;
		// ���۽ð�
		startTime = System.currentTimeMillis();
		
		
		File file = new File("D:\\javaEx\\IOEx\\src\\com\\chap1\\A_File.java");
		// ������ ���� ���θ� Ȯ���� �������� ������ ���� 
		if(!file.exists()) {
			System.out.print("������ �������� �ʽ��ϴ�.");
			return;
		}
		
		try (FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream("A_File_copy.java")){
			
			int value =0;
			// 1����Ʈ�� �о� �ɴϴ�.
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
		System.out.println("�ҿ�ð� : " + (endTime - startTime));
		
	}
	

	/**
	 * �����ϱ� - ������ ������ �غ�
	 * 
	 * FileInputStream �о�ͼ�
	 * FileOutputStream �����ϱ�
	 */
	public void fileCopy() {
		
		try (
				FileInputStream fis 
					= new FileInputStream("����Ŭ����.pptx");
				FileOutputStream fos 
					= new FileOutputStream("����Ŭ����_copy.pptx");
				
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





















