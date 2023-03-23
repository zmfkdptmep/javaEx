package com.jungang;

public class Employee extends Person{ // Employee - 직원, 종업원
	private int salary; // 샐러리, 급여
	private String dept; // 부서 뎊트..?
	
	public Employee() {}
	public Employee(String name, int age, double weight, double height, int salary, String dept) {
		super(age,height,weight);
		super.setName(name);
		this.setSalary(salary);
		this.setDept(dept);
	}
	
	
	public String information() {
		return super.information()+", 급여: "+getSalary()+", 부서: "+getDept();
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	

}
