package com.library.vo;

import java.util.ArrayList;
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.FileDao;

public class MemberList {
	
	private List<Member> list = new ArrayList<Member>();
	private Dao dao = new FileDao();
	
	MemberList(){}
	
	public Member makeMember(String name, int age, boolean isRent) {
		Member member = new Member(name,age,isRent);
		list.add(member);
		return member;
	}
	
	@Override
	public String toString() {
		
		for(Member member : list) {
			System.out.println(member.toString());
		}
		
		return "";
		}

}
