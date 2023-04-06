package com.library.vo;

public class Member {
	private String name;
	private int age;
	private boolean isRent;
	
	public Member(String name, int age, boolean isRent) {
		this.name = name;
		this.age = age;
		this.isRent = isRent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isRent() {
		return isRent;
	}

	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
	
	@Override
	public String toString() {
		return getName()+" "+getAge()+" "+isRent+"\n";
	}
	
	

}
