package polymorphism;





public class Application {
	
	static Animal random(int a) {
		if(a==0) {
			return new Dog("손기영","치와와",70); 
		}  // 둘다 Animal을 상속하고 있기에 리턴 가능
		return new Cat("돔베","벵갈","원준이 집","밝은갈색");
	}
	
	public static void main(String[] args) {
		Animal[] a1 = new Animal[5];
		Animal[] a2 = new Animal[2];
		
		a1[0] = random((int)(Math.random()*2));
		a1[1] = random((int)(Math.random()*2));
		a1[2] = random((int)(Math.random()*2));
		a1[3] = random((int)(Math.random()*2));
		a1[4] = random((int)(Math.random()*2));
		


		for(int i=0;i<a1.length;i++) {
			a1[i].speak();
		}
		
	

}
	

}