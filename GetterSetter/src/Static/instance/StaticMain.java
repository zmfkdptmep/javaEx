package Static.instance;

public class StaticMain {

	public static void main(String[] args) {
		
		StaticDemo1 s1 = new StaticDemo1();
		
		
		
		System.out.println(StaticDemo1.pi); // static �ʵ� ȣ��( ���� )
		System.out.println(StaticDemo1.plus(100, 20));// static �޼ҵ�
		System.out.println(StaticDemo1.minus(20, 10));
		// System.out.println(StaticDemo1.divide(10,2));
		// static�� ������ ���� �ν��Ͻ� �޼ҵ� ȣ�� ( �Ұ��� )
		
		System.out.println(s1.divide(10, 2));
		// �ν��Ͻ� ������, ��Ʈ ������(.)�� �����
		// �ν��Ͻ� �޼ҵ� ȣ�� ( ���� )
		
		System.out.println(s1.pi2);
		// �ν��Ͻ��� ���� �ν��Ͻ� �ʵ� ȣ�� ( ���� )
	}
}
