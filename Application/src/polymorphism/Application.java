package polymorphism;





public class Application {
	
	static Animal random(int a) {
		if(a==0) {
			return new Dog("�ձ⿵","ġ�Ϳ�",70); 
		}  // �Ѵ� Animal�� ����ϰ� �ֱ⿡ ���� ����
		return new Cat("����","����","������ ��","��������");
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