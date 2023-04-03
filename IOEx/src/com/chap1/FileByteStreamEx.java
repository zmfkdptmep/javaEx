package com.chap1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteStreamEx {
	public static void main(String[] args) {
		FileByteStreamEx ex = new FileByteStreamEx();
		
		ex.fileSave();
		ex.fileRead();
	}
	public void fileRead() {
		FileInputStream fis = null;
		System.out.println("파일 읽기 실행");
		try {
			fis = new FileInputStream("a_byte.dat");
			
			/*
			 * 파일로부터 데이터를 읽어올 때는 read() 메소드를 사용하면 된다.
			 * 하지만 실제로 파일에는 얼마만큼의 데이터가 있는지 모른다.
			 * read() 메소드는 더 이상 읽어올 데이터가 없으면 -1을 리턴한다.
			 * 따라서 반복문을 사용해서 read() 메소드에서 -1이 리턴되기 전까지
			 * 데이터를 읽어오면 된다.
			 */
			int value = 0;
			// 데이터를 읽어서 value 변수에 저장
			// -1 : 문장의 끝
			while((value=fis.read())!= -1) {
				System.out.print((char)value);
			}
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	
	public void fileSave() {
		FileOutputStream fos = null;
		System.out.println("파일 저장 실행");
		try {
			// 프로젝트 내부에 파일 생성
			fos = new FileOutputStream("a_byte.dat");
			fos.write(97); // a 저장
			fos.write('b');
			fos.write(10);
			//fos.write('한');
			
			byte[] byteArr = {'a','b','c','d'};
			fos.write(byteArr);
			fos.write(10);
			//(배열, 시작인덱스, 갯수)
			// 여기서 인덱스는 byteArr 배열의 인덱스를 말하는 것이다.
			fos.write(byteArr, 1, 2);
			// 파일 생성
			fos.flush();
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		} finally {
			// 사용중인 자원이 있다면 종료시킨다.
			// 내가 종료시켜야만 다른 사용자가 실행 가능하다.
			// fos.close();
			if(fos!=null) {
				try {
					fos.close();
					// sc.close()와 같이 다른 사용자가 실행 가능하도록
					// 빨대를 뽑는다.
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
