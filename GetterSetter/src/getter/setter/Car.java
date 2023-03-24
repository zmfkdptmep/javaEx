package getter.setter;

public class Car {
	private int speed;
	private boolean stop;
	private int gas;

	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		// �Ű������� speed ���� �޾� �ʵ忡 �����Ѵ�.
		// speed ���� ���� ��, ������� 0���� �ٲ��ش�.
		if(speed<0) {
			this.speed = 0;
		}else {
			this.speed = speed;
		}
	}
	
	
	// �޼ҵ� �̸��� is�� ��� boolean�� Ȯ���� ����.
	public boolean isStop(){
		return stop;
	}
	public void setStop(boolean stop) {
		// stop�� true ��� speed�� 0���� set�Ͽ� �����.
		if(stop) {
			this.setSpeed(0);
		}
		this.stop = stop;
	}
	
	public void run() {
		if(this.stop==false&&this.gas!=0) {
			System.out.println("���� �޸��ϴ�. ���� �ӵ��� "+this.speed+"km/h");
			System.out.println("���� ������ "+this.gas+"L�Դϴ�.");
			gas--;
		
		}else {
			System.out.println("���� ������ ���ų� �õ��� �������ϴ�.");
		}
			
		}
	
	public int getGas() {
		return this.gas;
	}
	public void setGas(int gas) {
		if(gas<0) {
			this.gas = 0;
		}else {
			this.gas = gas;
		}
	}
	}
	
	

