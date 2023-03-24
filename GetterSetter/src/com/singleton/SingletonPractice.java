package com.singleton;

public class SingletonPractice {
	
	private static SingletonPractice s1 = new SingletonPractice();
	String name;
	// 1. 생성자를 private로
	// 2. get 메소드를 통해 필드에 만든 자기 자신을 리턴한다.
	private SingletonPractice() {
	}
	
	
	// get 메소드이기에 어디서나 호출할 수 있게 static으로 해준다.
	// 다만 이렇게 되면 s1또한 new 과정에서 static이 되어야 한다.
	// non-static은 static에서 호출할 수 없기 때문이다.
	public static SingletonPractice getInstance() {
		return s1;
	}

}
