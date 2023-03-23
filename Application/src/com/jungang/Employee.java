package com.jungang;

public class Employee extends Person{ // Employee - ����, ������
	private int salary; // ������, �޿�
	private String dept; // �μ� �XƮ..?
	
	public Employee() {}
	public Employee(String name, int age, double weight, double height, int salary, String dept) {
		super(age,height,weight);
		super.setName(name);
		this.setSalary(salary);
		this.setDept(dept);
	}
	
	
	public String information() {
		return super.information()+", �޿�: "+getSalary()+", �μ�: "+getDept();
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
