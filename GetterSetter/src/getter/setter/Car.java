package getter.setter;

public class Car {
	private int speed;
	private boolean stop;
	private int gas;

	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		// 매개변수로 speed 값을 받아 필드에 저장한다.
		// speed 값을 검증 후, 음수라면 0으로 바꿔준다.
		if(speed<0) {
			this.speed = 0;
		}else {
			this.speed = speed;
		}
	}
	
	
	// 메소드 이름이 is일 경우 boolean일 확률이 높다.
	public boolean isStop(){
		return stop;
	}
	public void setStop(boolean stop) {
		// stop이 true 라면 speed을 0으로 set하여 멈춘다.
		if(stop) {
			this.setSpeed(0);
		}
		this.stop = stop;
	}
	
	public void run() {
		if(this.stop==false&&this.gas!=0) {
			System.out.println("차가 달립니다. 현재 속도는 "+this.speed+"km/h");
			System.out.println("남은 가스는 "+this.gas+"L입니다.");
			gas--;
		
		}else {
			System.out.println("차에 가스가 없거나 시동이 꺼졌습니다.");
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
	
	

