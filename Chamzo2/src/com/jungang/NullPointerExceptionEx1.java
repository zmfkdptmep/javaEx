package com.jungang;

public class NullPointerExceptionEx1 {
	public static void main(String[] args) {
		
		// 초기 값으로 null을 입력
		// 참조 변수가 아무런 객체도 참조하고 있지 않다는 의미
		// . : 주소 접근자, 객체 접근 연산자 ( 인스턴스. 하면 기능 쭉 뜨는거 말하는듯)
		// 필드, 메소드
		// 변수 이름.필드명: ex) A.a;
		// 변수 이름.메소드명(매개변수): ex) A.set(10);
		
		
		String name = null;
		name = "가나다라마바사아자차카타파하";
		// length() : 문자열의 총 길이를 반환
		// 해결 방안: 참조 변수가 null인 경우 실행되지 않도록 처리한다.
		if(name!=null) { // try..catch말고 NullPointerException 해결
			
		
		System.out.println("총 문자수 :"+name.length());
		
		}
		
		System.out.println("정상 종료 되었습니다.");
	}

}
