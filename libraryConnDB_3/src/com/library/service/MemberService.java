package com.library.service;

import com.library.dao.MemberDao;
import com.library.vo.MemberVo;

public class MemberService {
	
	MemberDao dao = new MemberDao();
	
	// MemberDao의 메소드 login()을 통해 검증을 한다.
	
	// 검증과 검증 후의 로직을 따로 두었다.
	// 검증(MemberDao), 후의 서비스(MemberService) 
	
	public MemberVo login(String id, String pw) {
		MemberVo memberVo = dao.login(id, pw);
		if(memberVo!=null) {
			System.out.println(memberVo.getName()+"님 환영합니다.");
			return memberVo;
		} else {
			System.err.println("아이디/비밀번호가 일치하지 않거나 없는 계정입니다.");
			// 로그인 실패시 null 반환
			return null;
		}
	}
	public void getList() {
		for(MemberVo member:dao.getList()) {
			System.out.println(member.toString());
		}
	}
	public int insertMember(String id, String pw, String name, String adminYN) {
		MemberVo member = new MemberVo(id, pw, adminYN, name);
		System.out.println(id);
		System.out.println(pw);
		System.out.println(adminYN);
		System.out.println(name);
		int res = dao.insertMember(member);
		if(res==0) {
			System.err.println("등록 중 오류가 발생하였습니다.");
		}else {
			System.out.println("등록 되었습니다.");
		}
		return res;
	}
	public int deleteMember(String id) {
		int res = dao.deleteMember(id);
		if(res==0) {
			System.err.println("삭제 중 오류가 발생하였습니다.");
		}else {
			System.out.println("삭제 성공");
		}
		return res;
	}
	

}
