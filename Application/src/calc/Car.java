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
				System.out.println("���� �⸧ ��: "+gas);
				System.out.println("===============");
			}else {
				System.out.println("�⸧ �����.");
				System.out.println("���� �⸧ ��: "+gas);
				return;
			}
		}
	}
	
	
	void sound() {
		if(sound) {
			System.out.println("����");
		}
	}
	
	void run1() {
		if(run) {
			System.out.println("�߽� �޸��ϴ�.");
		}else {
			System.out.println("����ϴ�.");
		}
	}
	

}
