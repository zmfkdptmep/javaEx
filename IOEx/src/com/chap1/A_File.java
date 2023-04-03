package com.chap1;

import java.io.File;
import java.io.IOException;

public class A_File {
	public static void main(String[] args) throws IOException {
		// 객체 생성
		A_File a = new A_File();
		
		a.method2();
	}
	// 경로 주기
	public void method2(){
		File file = new File("d:/test/test.txt");
		File dir = new File("d:/test");
		// dir로 폴더를 만들고, file로 txt파일을 만든다.
		try {
			// 디렉토리 만들기
			// 경로상 한개의 디렉토리 생성 
			dir.mkdir();
			
			// 경로내의 디렉토리가 여러개 생성되어야 할 경우
			// dir.mkdirs();
			
			// 파일 생성
			file.createNewFile();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public void method1() throws IOException {
		// 경로를 지정하지 않으면 현재 프로젝트폴더에 파일을 생성합니다.
		// 메모리상에만 존재
		File file = new File("test.txt");
		
		System.out.println("파일 명 : "+file.getName());
		System.out.println("절대 경로 : "+file.getAbsolutePath());
		System.out.println("상대 경로 : "+file.getPath());
		// 상대 경로는 현재 자바 프로젝트 기준으로 출력된다.
		System.out.println("파일 용량 : "+file.length());
		System.out.println("파일 존재 여부 : "+file.exists());
		// 실제 파일 생성
		file.createNewFile();
	}

}
