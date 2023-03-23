package calc;

public class CalculatorMain {
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		
		c1.powerOn();
		
		int[] numbers = {1,2,3,4,5};
		
		c1.summary(numbers);
		
		
		c1.summary(new int[] {1,2,3}); // 메소드 사용과 동시에 배열 선언
		
		
	}

}
