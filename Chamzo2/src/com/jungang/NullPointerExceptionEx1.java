package com.jungang;

public class NullPointerExceptionEx1 {
	public static void main(String[] args) {
		
		// �ʱ� ������ null�� �Է�
		// ���� ������ �ƹ��� ��ü�� �����ϰ� ���� �ʴٴ� �ǹ�
		// . : �ּ� ������, ��ü ���� ������ ( �ν��Ͻ�. �ϸ� ��� �� �ߴ°� ���ϴµ�)
		// �ʵ�, �޼ҵ�
		// ���� �̸�.�ʵ��: ex) A.a;
		// ���� �̸�.�޼ҵ��(�Ű�����): ex) A.set(10);
		
		
		String name = null;
		name = "�����ٶ󸶹ٻ������īŸ����";
		// length() : ���ڿ��� �� ���̸� ��ȯ
		// �ذ� ���: ���� ������ null�� ��� ������� �ʵ��� ó���Ѵ�.
		if(name!=null) { // try..catch���� NullPointerException �ذ�
			
		
		System.out.println("�� ���ڼ� :"+name.length());
		
		}
		
		System.out.println("���� ���� �Ǿ����ϴ�.");
	}

}
