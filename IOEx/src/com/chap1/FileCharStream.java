package com.chap1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharStream {
	public static void main(String[] args) {
		FileCharStream fcs = new FileCharStream();
		
		
		fcs.fileRead();
		
	}
	public void fileRead() {
		try(FileReader fr = new FileReader("b_char.txt")){
			
			int value = 0;
			while((value=fr.read())!=-1) {
				System.out.print((char)value);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileSave() {
		// 리소스를 자동으로 close()
		// FileWriter를 이용해서 파일을 생성하고 데이터를 문자 단위로 저장한다.
		try(FileWriter fw = new FileWriter("b_char.txt")){
			fw.write("IO 어떠신가요?");
			fw.write("혼자서도 잘할 수 있습니다.");
			fw.write('A');
			fw.write(' ');
			fw.write('\n');
			fw.write(new char[]{'a','b','c','d'});
			
			fw.flush();
		}catch(Exception e) {
			
		}finally {
			System.out.println("filesave() 종료");
		}
		
	}

}
