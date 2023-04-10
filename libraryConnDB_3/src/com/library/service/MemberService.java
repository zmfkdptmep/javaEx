package com.library.service;

import com.library.dao.MemberDao;
import com.library.vo.MemberVo;

public class MemberService {
	
	MemberDao dao = new MemberDao();
	
	// MemberDao�� �޼ҵ� login()�� ���� ������ �Ѵ�.
	
	// ������ ���� ���� ������ ���� �ξ���.
	// ����(MemberDao), ���� ����(MemberService) 
	
	public MemberVo login(String id, String pw) {
		MemberVo memberVo = dao.login(id, pw);
		if(memberVo!=null) {
			System.out.println(memberVo.getName()+"�� ȯ���մϴ�.");
			return memberVo;
		} else {
			System.err.println("���̵�/��й�ȣ�� ��ġ���� �ʰų� ���� �����Դϴ�.");
			// �α��� ���н� null ��ȯ
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
			System.err.println("��� �� ������ �߻��Ͽ����ϴ�.");
		}else {
			System.out.println("��� �Ǿ����ϴ�.");
		}
		return res;
	}
	public int deleteMember(String id) {
		int res = dao.deleteMember(id);
		if(res==0) {
			System.err.println("���� �� ������ �߻��Ͽ����ϴ�.");
		}else {
			System.out.println("���� ����");
		}
		return res;
	}
	

}
