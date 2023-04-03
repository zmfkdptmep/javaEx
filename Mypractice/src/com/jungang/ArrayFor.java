package com.jungang;

public class ArrayFor {
	public static void main(String[] args) {
		
		
		int[] array = new int[10];
		
		for(int i=0;i<array.length;i++) {
			array[i] = i+10;
			System.out.println(array[i]);
		}
		
		int[][] array2 = new int[5][5];
		
		int up = 0;
		
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) {
				array2[i][j] = up+10;
				up++;
				System.out.println("array2["+i+"]["+j+"]="+array2[i][j]);
			}
		}
			
		
		
	}

}
