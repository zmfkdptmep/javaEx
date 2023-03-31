package com.Tire;

public class HankookTire extends Tire {
	
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	@Override
	public boolean roll() { // 한국 타이어 수명을 위한 오버라이드
		rotation++;
		if(rotation<maxRotation) {
			System.out.println(location+" HankookTire 수명: "+(maxRotation-rotation)+"회");
			return true;
		}else {
			System.out.println("*** "+location+" HankookTire 펑크 ***");
			return false;
		}
		
	}
	
	

}
