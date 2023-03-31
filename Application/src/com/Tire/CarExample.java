package com.Tire;

public class CarExample {
	public CarExample() {}
	public static void main(String[] args) {
		Car c1 = new Car();
		
		for(int i=0;i<5;i++) {
			int problemLocation = c1.run();
			
			
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				c1.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				c1.frontRightTire = new KumhoTire("앞오른쪽", 13);
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				c1.backLeftTire = new HankookTire("뒤왼쪽", 14);
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				c1.backRightTire = new KumhoTire("뒤오른쪽", 17);
			}
			
			System.out.println("=============================");
			
			
		}
	}

}
