package com.library.vo;

public class MemberApp {
	public static void main(String[] args) {
		
		MemberList mlist = new MemberList();
		
		mlist.makeMember("원준", 28, false);
		mlist.makeMember("수진", 24, false);
		mlist.makeMember("주영", 40, false);
		
		System.out.println(mlist.toString());
	}

}
