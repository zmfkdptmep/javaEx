package getter.setter;

public class CarMain {
	public static void main(String[] args) {
		Car c1 = new Car();
		// �ʵ�� ���� private 
		// setter �޼ҵ带 �̿��� �ʵ��� ���� ���� ����
		
		c1.setSpeed(15);
		System.out.println(c1.getSpeed());
		
		c1.setGas(10);
		c1.setStop(true);
		System.out.println("���� ������: "+c1.getGas());
		c1.run();
	}

}
