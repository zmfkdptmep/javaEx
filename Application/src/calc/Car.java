package calc;




public class Car {
	
	int gas;
	boolean sound = true;
	boolean run = true;
	
	Car(){}
	Car(int gas){
		this.gas = gas;
	}
	
	
	void run() {
		while(true) {
			if(gas != 0) {
				gas--;
				sound();
				run1();
				System.out.println("³²Àº ±â¸§ ¾ç: "+gas);
				System.out.println("===============");
			}else {
				System.out.println("±â¸§ ¾ø¾î¿ë.");
				System.out.println("³²Àº ±â¸§ ¾ç: "+gas);
				return;
			}
		}
	}
	
	
	void sound() {
		if(sound) {
			System.out.println("»§»§");
		}
	}
	
	void run1() {
		if(run) {
			System.out.println("½ß½ß ´Þ¸³´Ï´Ù.");
		}else {
			System.out.println("¸ØÃä´Ï´Ù.");
		}
	}
	

}
