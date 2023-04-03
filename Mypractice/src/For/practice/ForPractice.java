package For.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;


public class ForPractice {
	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] {4,5,2,3,1};
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int e:arr) {
			System.out.println(e);
		}
		
		String[] arr2 = {"Apple","Kiwi","Orange","Banana","Watermelon","Cherry"};
		
		
		
		
	
		
		System.out.println(Arrays.toString(arr2));
		
	}

}
