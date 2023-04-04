package com.jungang.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.jungang.Book;

public class FileDao implements Dao{

	@Override
	public List<Book> getBookList() {
		List<Book> list = new ArrayList();
		try(FileReader fr = new FileReader("bookList.txt");
				BufferedReader br = new BufferedReader(fr)){
			
			String str = "";
			while((str=br.readLine())!=null) {
				list.add(makeBook(str));
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean insertBook(List<Book> list) {
		try(FileWriter fw = new FileWriter("bookList.txt");
				BufferedWriter bw = new BufferedWriter(fw);){
			
			for(Book book:list) {
				bw.write(book.info());
			}
			bw.flush();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}
	public Book makeBook(String str) {
		Book book = null;
		try {
			String[] strArr = str.split(" ");
			String title = strArr[1];
			String author = strArr[2];
			book = new Book(title,author);
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return book;
	}

}
