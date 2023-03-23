package com.jungang;

public class Student extends Person{
	
	private int grade;
	private String major;  // 메이저, 전공, 전문적
	
	
	public Student() {}
	public Student(int grade, String major, String name, int age, double height, double weight) {
		super(age,height,weight);
		super.setName(name);
		this.setGrade(grade);
		this.setMajor(major);
		
	}
	public String information() {
		return super.information()+", 전공: "+getMajor()+", 학년: "+getGrade();
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return major;
	}


}
