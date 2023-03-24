package Static.instance;

public class StaticMain {

	public static void main(String[] args) {
		
		StaticDemo1 s1 = new StaticDemo1();
		
		
		
		System.out.println(StaticDemo1.pi); // static 필드 호출( 가능 )
		System.out.println(StaticDemo1.plus(100, 20));// static 메소드
		System.out.println(StaticDemo1.minus(20, 10));
		// System.out.println(StaticDemo1.divide(10,2));
		// static을 붙히지 않은 인스턴스 메소드 호출 ( 불가능 )
		
		System.out.println(s1.divide(10, 2));
		// 인스턴스 생성후, 도트 연산자(.)를 사용해
		// 인스턴스 메소드 호출 ( 가능 )
		
		System.out.println(s1.pi2);
		// 인스턴스를 통해 인스턴스 필드 호출 ( 가능 )
	}
}
