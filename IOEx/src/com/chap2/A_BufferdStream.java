package com.chap2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 보조스트림
 * 	- 기반스트림
 * 
 */


public class A_BufferdStream {
	public static void main(String[] args) {
		A_BufferdStream bufferedStreamEx = new A_BufferdStream();
		bufferedStreamEx.fileRead();
	}
	public void fileRead() {
		// 보조스트림은 단독으로 불가
		// 기반스트림을 생성자의 매개변수로 넣어주시면 됩니다.
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));
		){
			String str = "";
			
			// 기반 스트림에서 제공하지 않는 메서드
			// readLine() 한줄을 읽어올때 사용한다.
			// read()와 다르게 더는 읽을 것이 없으면
			// -1이 아닌 null을 리턴하기에 while문의 조건이 바뀐다.
			while((str = br.readLine())!=null) {
				System.out.println(str);
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void fileSave() {
		
		// true : 이어서 작성
		// false : 덮어쓰기 <== 기본값
		try(FileWriter fw = new FileWriter("c_buffer.txt",true);
				BufferedWriter bw = new BufferedWriter(fw)){
			
			bw.write("ㅎㅇ요");
			bw.newLine();
			bw.write("대답을 잘해라\n");
			bw.write("뒤지기 싫으면");
			
			bw.flush();
			
		/* 매개변수에 바로 생성
		 * BufferedWriter bw =
		 *  new BufferedWriter(new FileWriter("c_buffer.txt"));
		 */
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
