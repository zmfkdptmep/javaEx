package com.Tire;

public class CarExample {
	public CarExample() {}
	public static void main(String[] args) {
		Car c1 = new Car();
		
		for(int i=0;i<5;i++) {
			int problemLocation = c1.run();
			
			
			
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� HankookTire�� ��ü");
				c1.frontLeftTire = new HankookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�տ����� KumhoTire�� ��ü");
				c1.frontRightTire = new KumhoTire("�տ�����", 13);
			case 3:
				System.out.println("�ڿ��� HankookTire�� ��ü");
				c1.backLeftTire = new HankookTire("�ڿ���", 14);
			case 4:
				System.out.println("�ڿ����� KumhoTire�� ��ü");
				c1.backRightTire = new KumhoTire("�ڿ�����", 17);
			}
			
			System.out.println("=============================");
			
			
		}
	}

}
