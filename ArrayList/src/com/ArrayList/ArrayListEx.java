package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JSP");
		list.add("Parsec");
		
		//삭제
		list.remove(0);
		
		//변경 
		list.set(0, "BaBa");
		
		System.out.println(list.toString());
	}

}
