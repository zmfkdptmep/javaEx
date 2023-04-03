package com.jungang;

// login 메소드는 id password를 인자로 받을 것
// id = "hong" password = "12345" = true , else false
// logout은 id만 받을 것
// "로그아웃 되었습니다."

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
			System.out.println("로그아웃 되었습니다.");
		}
		return;
	}
}
public class LoginLogout {
	public static void main(String[] args) {
		
		MemberService m1 = new MemberService();
		
		boolean result = m1.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			m1.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		
		
		
	}

}
