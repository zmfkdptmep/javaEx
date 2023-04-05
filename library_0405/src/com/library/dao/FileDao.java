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
		// ���Ϸκ��� �����͸� �о ����Ʈ�� ��ȯ
		System.out.println("FileDao.getList() ����");
		// ����Ʈ ����
		List<Book> list = new ArrayList<>();
		
		try(FileReader fr = new FileReader("bookList.txt");
				BufferedReader br = new BufferedReader(fr);){
			
			// readLine ���پ� �о�ɴϴ�.
			// ������ ��(EOF) = null
			String str = "";
			// null�̸� �ݺ��� Ż��
			while((str=br.readLine())!=null) {
				// ���ڿ��� �̿��ؼ� Book��ü�� ����
				Book book = makeBook(str);
				// ������ ��ü�� ����Ʈ�� ����ݴϴ�.
				if(book!=null) {
					list.add(book);
				}
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e1) {
			System.out.println(e1.getMessage());
		}
		System.out.println("FileDao.getList() ����");
		return list;
	}
	

	
	
	
	/* 
	 * 1. �Ű����� str�� ���� String�� ���� String[] �迭 arr�� �����Ѵ�
	 * 2. �̶�, �׳� ������ arr�� ���� 0���� readLine()���� �ҷ��� 
	 * 	  ������ ���� �����Ǳ� ������
	 * 3. split�� ����� " " ������ �������� ���� 0��, ���� 1��, ���� 2��
	 * 	  ���ʴ�� �ִ´�.
	 * 4. �̶� str�� Book.toString�̴�. 
	 * 5. �� Book�� info�̱⶧����, Book�� no,title,author,isRent ����
	 * 	  ��� ����ִ�.
	 * 6. 
	 */
	
	private Book makeBook(String str) {
		Book book = null;
		try {
			String[] arr = str.split(" ");
			
			// ���� ����ȯ�� ������ �߻��� �� �����Ƿ�
			// ������ �ùٸ��� ���� ���·� ����� ��� ������ �߻�
			// ���α׷����� ������ �߻�������, ������������ ����Ǵ� ���� ���� ���ؼ�
			// ����ó���� �Ѵ�.
			
			
			// ���ڿ��� int Ÿ������ ��ȯ
			int no = Integer.parseInt(arr[0]);
			String title = arr[1];
			String author = arr[2];
			boolean isRent = Boolean.parseBoolean(arr[3]);
			
			book = new Book(no,title,author,isRent);
			// Book�� �����ϱ� ���� �˸��� Ÿ������ ����
			// å�� ��ȯ
			// ������ �߻��� ��� null ��ȯ
		}catch(Exception e) {
			// ���ڿ� �Ľ��� ������ �߻��� ��� �޼��� ó��, return null;
			System.out.println(str+" : �Ľ� �� ������ �߻��Ͽ����ϴ�.");
			return null;
		}
		return book;
	}
	/*
	 * ����Ʈ�� �Ű������� �޾� ���Ϸ� ����մϴ�.
	 * boolean �޼ҵ�� �׻� true,false ������ ���� ������
	 */
	
	@Override
	public boolean listToFile(List<Book> list) {
		
		try(FileWriter fw = new FileWriter("bookList.txt");
				BufferedWriter bw = new BufferedWriter(fw);){
			
			// ����Ʈ�� ��� å�� ������ ���Ϸ� ����մϴ�.
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
