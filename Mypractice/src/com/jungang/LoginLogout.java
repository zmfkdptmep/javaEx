package com.jungang;

// login �޼ҵ�� id password�� ���ڷ� ���� ��
// id = "hong" password = "12345" = true , else false
// logout�� id�� ���� ��
// "�α׾ƿ� �Ǿ����ϴ�."

class MemberService{
	int id,password;
	
	
	boolean login(String id, String password) {
		if(id.equals("hong")) {
			if(password.equals("12345")) {
				return true;
			}
		}
		return false;
	}
	
	void logout(String id){
		if(id.equals("hong")) {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		}
		return;
	}
}
public class LoginLogout {
	public static void main(String[] args) {
		
		MemberService m1 = new MemberService();
		
		boolean result = m1.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			m1.logout("hong");
		}else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
		
		
		
		
	}

}
