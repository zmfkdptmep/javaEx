package com.chap1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteStreamEx {
	public static void main(String[] args) {
		FileByteStreamEx ex = new FileByteStreamEx();
		
		ex.fileSave();
		ex.fileRead();
	}
	public void fileRead() {
		FileInputStream fis = null;
		System.out.println("���� �б� ����");
		try {
			fis = new FileInputStream("a_byte.dat");
			
			/*
			 * ���Ϸκ��� �����͸� �о�� ���� read() �޼ҵ带 ����ϸ� �ȴ�.
			 * ������ ������ ���Ͽ��� �󸶸�ŭ�� �����Ͱ� �ִ��� �𸥴�.
			 * read() �޼ҵ�� �� �̻� �о�� �����Ͱ� ������ -1�� �����Ѵ�.
			 * ���� �ݺ����� ����ؼ� read() �޼ҵ忡�� -1�� ���ϵǱ� ������
			 * �����͸� �о���� �ȴ�.
			 */
			int value = 0;
			// �����͸� �о value ������ ����
			// -1 : ������ ��
			while((value=fis.read())!= -1) {
				System.out.print((char)value);
			}
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	
	public void fileSave() {
		FileOutputStream fos = null;
		System.out.println("���� ���� ����");
		try {
			// ������Ʈ ���ο� ���� ����
			fos = new FileOutputStream("a_byte.dat");
			fos.write(97); // a ����
			fos.write('b');
			fos.write(10);
			//fos.write('��');
			
			byte[] byteArr = {'a','b','c','d'};
			fos.write(byteArr);
			fos.write(10);
			//(�迭, �����ε���, ����)
			// ���⼭ �ε����� byteArr �迭�� �ε����� ���ϴ� ���̴�.
			fos.write(byteArr, 1, 2);
			// ���� ����
			fos.flush();
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		} finally {
			// ������� �ڿ��� �ִٸ� �����Ų��.
			// ���� ������Ѿ߸� �ٸ� ����ڰ� ���� �����ϴ�.
			// fos.close();
			if(fos!=null) {
				try {
					fos.close();
					// sc.close()�� ���� �ٸ� ����ڰ� ���� �����ϵ���
					// ���븦 �̴´�.
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
