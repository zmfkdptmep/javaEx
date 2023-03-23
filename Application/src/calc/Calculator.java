package calc;

public class Calculator {
	
	boolean powerOn; // 초기값 : false
	int sum = 0;
	// 전원을 조종합니다.
	
	public void powerOn() {
		if(powerOn) {  // 켜져있으면 꺼라
			powerOn = false;
			System.out.println("계산기를 종료합니다.");
		}else {        // 꺼져있으면 켜라
			powerOn = true;
			System.out.println("계산기를 실행합니다.");
		}
		
	}
	public void summary(int[] num) {
		if(powerOn) {
			for(int i=0;i<num.length;i++) {
				sum+=num[i];
			}
			System.out.println(sum);
		}else {
			System.out.println("계산기가 꺼져있어요.");
		}
	}

}
