package com.library.vo;

public class MemberApp {
	public static void main(String[] args) {
		
		MemberList mlist = new MemberList();
		
		mlist.makeMember("����", 28, false);
		mlist.makeMember("����", 24, false);
		mlist.makeMember("�ֿ�", 40, false);
		
		System.out.println(mlist.toString());
	}

}
