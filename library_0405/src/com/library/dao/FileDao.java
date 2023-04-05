package com.library.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao{

	@Override
	public List<Book> getList() {
		// 파일로부터 데이터를 읽어서 리스트로 반환
		System.out.println("FileDao.getList() 시작");
		// 리스트 선언
		List<Book> list = new ArrayList<>();
		
		try(FileReader fr = new FileReader("bookList.txt");
				BufferedReader br = new BufferedReader(fr);){
			
			// readLine 한줄씩 읽어옵니다.
			// 파일의 끝(EOF) = null
			String str = "";
			// null이면 반복문 탈출
			while((str=br.readLine())!=null) {
				// 문자열을 이용해서 Book객체를 생성
				Book book = makeBook(str);
				// 생성된 객체를 리스트에 담아줍니다.
				if(book!=null) {
					list.add(book);
				}
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e1) {
			System.out.println(e1.getMessage());
		}
		System.out.println("FileDao.getList() 종료");
		return list;
	}
	

	
	
	
	/* 
	 * 1. 매개변수 str로 받은 String의 값을 String[] 배열 arr에 저장한다
	 * 2. 이때, 그냥 넣으면 arr의 원소 0번에 readLine()으로 불러온 
	 * 	  한줄이 전부 몰빵되기 때문에
	 * 3. split을 사용해 " " 공백을 기준으로 원소 0번, 원소 1번, 원소 2번
	 * 	  차례대로 넣는다.
	 * 4. 이때 str은 Book.toString이다. 
	 * 5. 즉 Book의 info이기때문에, Book의 no,title,author,isRent 값이
	 * 	  모두 들어있다.
	 * 6. 
	 */
	
	private Book makeBook(String str) {
		Book book = null;
		try {
			String[] arr = str.split(" ");
			
			// 강제 형변환시 오류가 발생할 수 있으므로
			// 파일이 올바르지 않은 형태로 저장될 경우 오류가 발생
			// 프로그램에서 오류가 발생했을때, 비정상적으로 종료되는 것을 막기 위해서
			// 예외처리를 한다.
			
			
			// 문자열을 int 타입으로 변환
			int no = Integer.parseInt(arr[0]);
			String title = arr[1];
			String author = arr[2];
			boolean isRent = Boolean.parseBoolean(arr[3]);
			
			book = new Book(no,title,author,isRent);
			// Book을 생성하기 위해 알맞은 타입으로 저장
			// 책을 반환
			// 오류가 발생할 경우 null 반환
		}catch(Exception e) {
			// 문자열 파싱중 오류가 발생할 경우 메세지 처리, return null;
			System.out.println(str+" : 파싱 중 오류가 발생하였습니다.");
			return null;
		}
		return book;
	}
	/*
	 * 리스트를 매개변수로 받아 파일로 출력합니다.
	 * boolean 메소드는 항상 true,false 리턴을 각자 만들자
	 */
	
	@Override
	public boolean listToFile(List<Book> list) {
		
		try(FileWriter fw = new FileWriter("bookList.txt");
				BufferedWriter bw = new BufferedWriter(fw);){
			
			// 리스트에 담긴 책의 정보를 파일로 출력합니다.
			for(Book book:list) {
				bw.write(book.toString());
			}
			bw.flush();
			
			return true;
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}	
		return false;
	}

}
