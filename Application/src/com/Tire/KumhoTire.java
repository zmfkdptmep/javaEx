package com.Tire;

public class KumhoTire extends Tire {
	
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
	}

	@Override
	public boolean roll() {
		rotation++;
		if(rotation<maxRotation) {
			System.out.println(location+" KumhoTire ����: "+(maxRotation-rotation)+"ȸ");
			return true;
		}else {
			System.out.println(" *** "+location+" KumhoTire ��ũ ***");
			return false;
		}
	}
	

}
