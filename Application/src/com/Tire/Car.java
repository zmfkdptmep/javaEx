package com.Tire;

public class Car {
	
	Tire frontRightTire = new Tire("�տ�����",2);
	Tire backRightTire = new Tire("�ڿ�����", 4);
	Tire backLeftTire = new Tire("�տ���",6);
	Tire frontLeftTire = new Tire("�ڿ���",3);
	
	public Car() {}
	
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll()==false) {stop(); return 1;}
		if(frontRightTire.roll()==false) {stop(); return 2;}
		if(backLeftTire.roll()==false) {stop(); return 3;}
		if(backRightTire.roll()==false) {stop(); return 4;}
		return 0;
	}
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}	
	

}
