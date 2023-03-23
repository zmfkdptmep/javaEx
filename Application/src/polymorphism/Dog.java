package polymorphism;

public class Dog extends Animal{
	
	public static String PLACE = "�ְ�ī��";
	private int weight;
	
	public Dog(){}
	public Dog(String name, String kinds, int weight) {
		super(name,kinds);
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void speak() {
		System.out.println(toString()+" �����Դ� "+weight+"kg �Դϴ�.");
	}
	

}
