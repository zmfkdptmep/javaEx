package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JSP");
		list.add("Parsec");
		
		//����
		list.remove(0);
		
		//���� 
		list.set(0, "BaBa");
		
		System.out.println(list.toString());
	}

}
