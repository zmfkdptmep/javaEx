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
		System.out.println("FileDao.getList() ����");
		List<Book> list = new ArrayList<Book>();
		
		/*
		 * ������ �о ����Ʈ�� ��ȯ
		 */
		// �ݳ��� �ڿ��� �ִ� ��� try () �ȿ��� �����մϴ�.
		// �׷� �ڵ����� close ����.
		try(FileReader fr = new FileReader("bookList.txt");
				BufferedReader br = new BufferedReader(fr);){
			String str = "";
			// ���Ϸκ��� ������ �о�鿩 null�� �ɶ����� �ݺ��մϴ�.
			// null = ������ ��
			while((str=br.readLine())!=null) {
				Book book = makeBook(str);
				// makeBook�� ������ ����� null�� ��ȯ�ϱ⿡
				// �̷� if���� ����.
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
	 * ���ڿ��� �޾Ƽ� å�� ��ȯ�մϴ�.
	 */
	
	
	public Book makeBook(String str) {
		Book book = null;
		try{
			// 0 å1 �۰�1 false
			// ������ �̿��ؼ� ���ڿ��� �߶� �迭�� ��ȯ
			String[] strArr = str.split(" ");
			int no = Integer.parseInt(strArr[0]);
			String title = strArr[1];
			String author = strArr[2];
			boolean isRent = Boolean.parseBoolean(strArr[3]);
			
			book = new Book(no,title,author,isRent);
		}catch(Exception e) {
			// ������ �Ľ� �� ������ �߻��ϴ��� ���α׷��� ���ε��� �ʵ���
			// try������ ȭ���Ͽ� ������ ó��
			System.out.println("����Ʈ ���� �� ������ �߻��Ͽ����ϴ�.");
			System.out.println("===== readLine() : "+str);
		}
		// å�� ���������� ������ ��� Book�� ��ȯ�ϰ�
		// ������ ������ �߻��� �ʱ��� null�� ��ȯ.
		return book;
	}



	@Override
	public boolean saveFile(List<Book> list) {
		// ����Ʈ�� ���Ϸ� �����մϴ�.
		try(FileWriter fw = new FileWriter("bookList.txt");
				BufferedWriter bw = new BufferedWriter(fw);){
			for(Book book:list) {
				// å�� ������ �������� �����Ͽ� ��ȯ
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
