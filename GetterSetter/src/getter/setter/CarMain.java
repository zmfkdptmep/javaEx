package getter.setter;

public class CarMain {
	public static void main(String[] args) {
		Car c1 = new Car();
		// 필드는 현재 private 
		// setter 메소드를 이용해 필드의 값을 변경 가능
		
		c1.setSpeed(15);
		System.out.println(c1.getSpeed());
		
		c1.setGas(10);
		c1.setStop(true);
		System.out.println("남은 가스량: "+c1.getGas());
		c1.run();
	}

}
