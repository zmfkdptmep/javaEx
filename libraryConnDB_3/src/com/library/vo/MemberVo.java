package com.library.vo;

public class MemberVo {
	String id;
	String pw;
	String adminYN;
	String name;
	
	// �н������ set�� �� �� �ְ�(ȸ�� ���Ը� �� �� �ְ�)
	public MemberVo(String id, String pw, String adminYN, String name) {
		this.id = id;
		this.pw = pw;
		this.adminYN = adminYN;
		this.name = name;
	}
	@Override
	public String toString() {
		return getId()+" "+getAdminYN()+" "+getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getAdminYN() {
		return adminYN;
	}

	public void setAdminYN(String adminYN) {
		this.adminYN = adminYN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	
	
	

}
