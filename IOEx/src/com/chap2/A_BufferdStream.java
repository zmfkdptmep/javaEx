package com.chap2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ������Ʈ��
 * 	- ��ݽ�Ʈ��
 * 
 */


public class A_BufferdStream {
	public static void main(String[] args) {
		A_BufferdStream bufferedStreamEx = new A_BufferdStream();
		bufferedStreamEx.fileRead();
	}
	public void fileRead() {
		// ������Ʈ���� �ܵ����� �Ұ�
		// ��ݽ�Ʈ���� �������� �Ű������� �־��ֽø� �˴ϴ�.
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));
		){
			String str = "";
			
			// ��� ��Ʈ������ �������� �ʴ� �޼���
			// readLine() ������ �о�ö� ����Ѵ�.
			// read()�� �ٸ��� ���� ���� ���� ������
			// -1�� �ƴ� null�� �����ϱ⿡ while���� ������ �ٲ��.
			while((str = br.readLine())!=null) {
				System.out.println(str);
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void fileSave() {
		
		// true : �̾ �ۼ�
		// false : ����� <== �⺻��
		try(FileWriter fw = new FileWriter("c_buffer.txt",true);
				BufferedWriter bw = new BufferedWriter(fw)){
			
			bw.write("������");
			bw.newLine();
			bw.write("����� ���ض�\n");
			bw.write("������ ������");
			
			bw.flush();
			
		/* �Ű������� �ٷ� ����
		 * BufferedWriter bw =
		 *  new BufferedWriter(new FileWriter("c_buffer.txt"));
		 */
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
