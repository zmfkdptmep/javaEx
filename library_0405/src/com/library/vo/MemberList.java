package com.library.vo;

import java.util.ArrayList;
import java.util.List;

public class MemberList {
	
	private List<Member> list = new ArrayList<Member>();
	
	MemberList(){}
	
	public Member makeMember(String name, int age, boolean isRent) {
		Member member = new Member(name,age,isRent);
		return member;
	}
	
	@Override
	public String toString() {
		
		String str = "";
		for(Member member:list) {
			str = list.toString();
		}
		
		return str;
		}

}
