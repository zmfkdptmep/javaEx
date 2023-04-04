package com.library.vo;

import java.util.List;

import com.library.dao.FileDao;

public class App {
	public static void main(String[] args) {
		
		Library lib = new Library();
		
		
	
		lib.insert(3, "책3", "작가3", false);
		System.out.println(lib.toString());
	}

}
