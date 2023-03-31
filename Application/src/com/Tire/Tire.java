package com.Tire;

public class Tire {
	// 최대 회전 가능 수
	int maxRotation;
	// 누적 회전 수
	int rotation;
	// 타이어의 위치
	String location;
	public Tire() {}
	public Tire(String location, int maxRotation) {
		// 필드를 초기화
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 1번 실행마다 누적 회전 수를 증가
	// 만약 maxRotation보다 크면 false를 리턴합니다.
	
	public boolean roll() {
		rotation++;
		if(maxRotation>rotation) {
			System.out.println(location+" Tire 수명: "+(maxRotation-rotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+" Tire 펑크 ***");
			return false;
		}
		
		
	}

}
