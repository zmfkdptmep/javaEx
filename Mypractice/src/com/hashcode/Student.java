package com.hashcode;

public class Student {
	
	private String studentNum;
	
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudnetNum() {
		return studentNum;
	}
	@Override
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s1 = (Student)obj;
			if(this.studentNum==s1.studentNum) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}
