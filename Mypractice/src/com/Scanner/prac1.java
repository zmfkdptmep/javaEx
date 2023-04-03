package com.Scanner;

import java.util.Scanner;

public class prac1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i =0;
		
		while(true) {
			try {
				i = sc.nextInt();
				System.out.println(i);
				break;
			}catch(Exception e){
				if(sc.next().equalsIgnoreCase("q")) {
					System.exit(0);
				}
				System.out.println(sc.next());
			}
		
		}
	}
	

}
