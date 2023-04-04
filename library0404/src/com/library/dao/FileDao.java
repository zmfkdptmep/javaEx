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

public class FileDao implements Dao {
	
	/*
	 * 
	 */
	
	@Override
	public List<Book> getList(){
		System.out.println("FileDao.getList() 시작");
		List<Book> list = new ArrayList<Book>();
		
		/*
		 * 파일을 읽어서 리스트를 반환
		 */
		// 반납할 자원이 있는 경우 try () 안에서 생성합니다.
		// 그럼 자동으로 close 해줌.
		try(FileReader fr = new FileReader("bookList.txt");
				BufferedReader br = new BufferedReader(fr);){
			String str = "";
			// 파일로부터 한줄을 읽어들여 null이 될때까지 반복합니다.
			// null = 파일의 끝
			while((str=br.readLine())!=null) {
				Book book = makeBook(str);
				// makeBook은 오류가 생기면 null을 반환하기에
				// 이런 if문을 쓴다.
				if(book != null) {
					list.add(book);
				}
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
			e1.printStackTrace();
		}
		
		
		return list;
	}
			
	
	
	/*
	 * 문자열을 받아서 책을 반환합니다.
	 */
	
	
	public Book makeBook(String str) {
		Book book = null;
		try{
			// 0 책1 작가1 false
			// 공백을 이용해서 문자열을 잘라 배열로 반환
			String[] strArr = str.split(" ");
			int no = Integer.parseInt(strArr[0]);
			String title = strArr[1];
			String author = strArr[2];
			boolean isRent = Boolean.parseBoolean(strArr[3]);
			
			book = new Book(no,title,author,isRent);
		}catch(Exception e) {
			// 데이터 파싱 중 오류가 발생하더라도 프로그램이 종로되지 않도록
			// try구문을 화용하여 오류를 처리
			System.out.println("리스트 생성 중 오류가 발생하였습니다.");
			System.out.println("===== readLine() : "+str);
		}
		// 책이 정상적으로 생성된 경우 Book을 반환하고
		// 생성중 오류가 발생시 초기의 null을 반환.
		return book;
	}



	@Override
	public boolean saveFile(List<Book> list) {
		// 리스트를 파일로 저장합니다.
		try(FileWriter fw = new FileWriter("bookList.txt");
				BufferedWriter bw = new BufferedWriter(fw);){
			for(Book book:list) {
				// 책의 정보를 공백으로 연결하여 반환
				bw.write(book.toString()+"\n");
			}
			bw.flush();
			return true;
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}
		return false;
	}

}
