package calc;

public class Calculator {
	
	boolean powerOn; // �ʱⰪ : false
	int sum = 0;
	// ������ �����մϴ�.
	
	public void powerOn() {
		if(powerOn) {  // ���������� ����
			powerOn = false;
			System.out.println("���⸦ �����մϴ�.");
		}else {        // ���������� �Ѷ�
			powerOn = true;
			System.out.println("���⸦ �����մϴ�.");
		}
		
	}
	public void summary(int[] num) {
		if(powerOn) {
			for(int i=0;i<num.length;i++) {
				sum+=num[i];
			}
			System.out.println(sum);
		}else {
			System.out.println("���Ⱑ �����־��.");
		}
	}

}
