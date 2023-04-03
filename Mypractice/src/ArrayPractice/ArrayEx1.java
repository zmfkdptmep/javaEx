package ArrayPractice;

class ArrayPrac{
	int age = 10;
	
}

public class ArrayEx1 {
	public static void main(String[] args) {
		
		ArrayPrac[] ap = new ArrayPrac[10];
		int a = 0;
		while(a<3) {
			ArrayPrac a1 = new ArrayPrac();
			ap[a] = a1;
			System.out.println(ap[a]);
			a++;
		}
		
		
		

	}

}
