package com.Tire;

public class HankookTire extends Tire {
	
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	@Override
	public boolean roll() { // �ѱ� Ÿ�̾� ������ ���� �������̵�
		rotation++;
		if(rotation<maxRotation) {
			System.out.println(location+" HankookTire ����: "+(maxRotation-rotation)+"ȸ");
			return true;
		}else {
			System.out.println("*** "+location+" HankookTire ��ũ ***");
			return false;
		}
		
	}
	
	

}
