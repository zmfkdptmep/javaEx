package com.jungang.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.jungang.Book;

public class FileDao implements Dao{

	@Override
	public List<Book> getBookList() {
		try(FileReader fr = new FileReader("bookList.txt");
				BufferedReader br = new BufferedReader(fr)){
			
			String str = "";
			while((str=br.readLine())!=null) {
				
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
				fw.write(book.info());
			}
			
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

}
