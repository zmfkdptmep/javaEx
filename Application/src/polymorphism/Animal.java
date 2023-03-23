package polymorphism;

public abstract class Animal {
	
	private String name;
	private String kinds;
	
	protected Animal() {}
	protected Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	public String toString() {
		return "���� �̸��� "+name+"�̰�, ������ "+kinds+"�Դϴ�.";
	}
	abstract void speak();
	}




