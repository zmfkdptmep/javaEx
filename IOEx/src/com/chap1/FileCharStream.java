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
		// ���ҽ��� �ڵ����� close()
		// FileWriter�� �̿��ؼ� ������ �����ϰ� �����͸� ���� ������ �����Ѵ�.
		try(FileWriter fw = new FileWriter("b_char.txt")){
			fw.write("IO ��Ű���?");
			fw.write("ȥ�ڼ��� ���� �� �ֽ��ϴ�.");
			fw.write('A');
			fw.write(' ');
			fw.write('\n');
			fw.write(new char[]{'a','b','c','d'});
			
			fw.flush();
		}catch(Exception e) {
			
		}finally {
			System.out.println("filesave() ����");
		}
		
	}

}
