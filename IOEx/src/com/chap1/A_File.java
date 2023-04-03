package com.chap1;

import java.io.File;
import java.io.IOException;

public class A_File {
	public static void main(String[] args) throws IOException {
		// ��ü ����
		A_File a = new A_File();
		
		a.method2();
	}
	// ��� �ֱ�
	public void method2(){
		File file = new File("d:/test/test.txt");
		File dir = new File("d:/test");
		// dir�� ������ �����, file�� txt������ �����.
		try {
			// ���丮 �����
			// ��λ� �Ѱ��� ���丮 ���� 
			dir.mkdir();
			
			// ��γ��� ���丮�� ������ �����Ǿ�� �� ���
			// dir.mkdirs();
			
			// ���� ����
			file.createNewFile();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public void method1() throws IOException {
		// ��θ� �������� ������ ���� ������Ʈ������ ������ �����մϴ�.
		// �޸𸮻󿡸� ����
		File file = new File("test.txt");
		
		System.out.println("���� �� : "+file.getName());
		System.out.println("���� ��� : "+file.getAbsolutePath());
		System.out.println("��� ��� : "+file.getPath());
		// ��� ��δ� ���� �ڹ� ������Ʈ �������� ��µȴ�.
		System.out.println("���� �뷮 : "+file.length());
		System.out.println("���� ���� ���� : "+file.exists());
		// ���� ���� ����
		file.createNewFile();
	}

}
