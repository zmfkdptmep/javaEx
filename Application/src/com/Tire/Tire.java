package com.Tire;

public class Tire {
	// �ִ� ȸ�� ���� ��
	int maxRotation;
	// ���� ȸ�� ��
	int rotation;
	// Ÿ�̾��� ��ġ
	String location;
	public Tire() {}
	public Tire(String location, int maxRotation) {
		// �ʵ带 �ʱ�ȭ
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 1�� ���ึ�� ���� ȸ�� ���� ����
	// ���� maxRotation���� ũ�� false�� �����մϴ�.
	
	public boolean roll() {
		rotation++;
		if(maxRotation>rotation) {
			System.out.println(location+" Tire ����: "+(maxRotation-rotation)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+" Tire ��ũ ***");
			return false;
		}
		
		
	}

}
