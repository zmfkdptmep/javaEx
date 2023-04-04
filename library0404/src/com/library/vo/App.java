package com.library.vo;

import java.util.List;

import com.library.dao.FileDao;

public class App {
	public static void main(String[] args) {
		
		Library lib = new Library();
		
		lib.insert(0, null, null, false);
		
		System.out.println(lib.toString());
	}

}
