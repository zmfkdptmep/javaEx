package com.Switch;

enum Fruit{
	APPLE, PEACH, BANANA;
}
enum Company{
	GOOGLE, APPLE, ORACLE;
}


public class switchPrac {
	public static void main(String[] args) {
		
		Fruit type = Fruit.APPLE;
		switch(type) {
		case APPLE:
			System.out.println("1");
			break;
		case PEACH:
			 System.out.println("2");
		}
	
	}
	
	

}
