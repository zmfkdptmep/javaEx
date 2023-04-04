package com.chap3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDao {
	public static void main(String[] args) {
		
		FileDao fd = new FileDao();
		fd.fileSave();
		fd.fileReader();
		
		
	}
	public void fileReader() {
		// 만들어 놓은 bookList.txt 지정
		try(BufferedReader br = new BufferedReader(new FileReader("bookList.txt"))){
		
		// 빈 str에 readLine()을 통해 읽어온 bookList.txt의 내용을 담는다.
		// String으로 리턴된다.
		// str.toString은 오버라이딩 안된 원본이다. String 타입 변수에 toString메소드를 호출하면 변수의 내용이 그대로 출력되므로
		// 쓰나마나다.
		String str = "";
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
	
	
	public void fileSave() {
		
		// split으로 배열에 넣은 뒤 add하기
		
		Library lib = new Library();
		String str2 = "책4/작가4/false";
		String[] strArr2 = str2.split("/");
		lib.addBook(strArr2[0], strArr2[1], (Boolean.parseBoolean(strArr2[2])));
		
		// 파일 출력
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("bookList.txt"));){
			
			for(Book book:lib.bookList) {
				bw.write(book.toString());
			}
			bw.flush();
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
