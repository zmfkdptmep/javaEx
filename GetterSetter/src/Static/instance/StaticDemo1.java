package Static.instance;

public class StaticDemo1 {
	
	// 필드 선언
	static double pi = 3.14;
	double pi2 = 3.15;
	// 메소드 선언
	// 어디에서나 사용 가능한
	// 프로그램 시작과 동시에 사용 가능한
	
	public static int plus(int a, int b) {
		return a+b;
	}
	public static int minus(int a, int b) {
		return a-b;
	}
	public int divide(int a, int b) {
		return a/b;
	}

}
