package com.jungang;

public class Person {
	
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	public Person(){}
	public Person(int age, double height, double weight){
		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight);
		
	}
	
	public String information() {
		return "이름: "+name+", 나이: "+age+", 키: "+height+", 몸무게: "+weight+", 급여: ";		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	


}
