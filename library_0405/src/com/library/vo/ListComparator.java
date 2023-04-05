package com.library.vo;

import java.util.Comparator;

public class ListComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		int no1 = o1.getNo();
		int no2 = o2.getNo();
		
		
		if(no1>no2) {
			return -1;
		}else if(no1<no2) {
			return 1;
		}else {
			return 0;
		}
		
		
	
	} 

}
