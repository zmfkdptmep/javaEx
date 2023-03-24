package com.singleton;

public class SingletonPractice {
	
	private static SingletonPractice s1 = new SingletonPractice();
	String name;
	// 1. �����ڸ� private��
	// 2. get �޼ҵ带 ���� �ʵ忡 ���� �ڱ� �ڽ��� �����Ѵ�.
	private SingletonPractice() {
	}
	
	
	// get �޼ҵ��̱⿡ ��𼭳� ȣ���� �� �ְ� static���� ���ش�.
	// �ٸ� �̷��� �Ǹ� s1���� new �������� static�� �Ǿ�� �Ѵ�.
	// non-static�� static���� ȣ���� �� ���� �����̴�.
	public static SingletonPractice getInstance() {
		return s1;
	}

}
