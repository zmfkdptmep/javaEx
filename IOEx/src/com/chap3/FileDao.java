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
		// ����� ���� bookList.txt ����
		try(BufferedReader br = new BufferedReader(new FileReader("bookList.txt"))){
		
		// �� str�� readLine()�� ���� �о�� bookList.txt�� ������ ��´�.
		// String���� ���ϵȴ�.
		// str.toString�� �������̵� �ȵ� �����̴�. String Ÿ�� ������ toString�޼ҵ带 ȣ���ϸ� ������ ������ �״�� ��µǹǷ�
		// ����������.
		String str = "";
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
	
	
	public void fileSave() {
		
		// split���� �迭�� ���� �� add�ϱ�
		
		Library lib = new Library();
		String str2 = "å4/�۰�4/false";
		String[] strArr2 = str2.split("/");
		lib.addBook(strArr2[0], strArr2[1], (Boolean.parseBoolean(strArr2[2])));
		
		// ���� ���
		
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
