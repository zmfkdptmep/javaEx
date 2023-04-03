package com.NonStaticSample;

public class NonStaticSample {
	
	private String value;

	
	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public void setChar(int index, char c, String value) {
		char[] cArr = this.value.toCharArray();
		cArr[index] = c;
		this.value = value;
	}
	
	public void setChar(NonStaticSample value, String value2) {
		value.value = value2;
	}
	

}
