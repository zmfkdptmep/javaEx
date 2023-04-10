package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.conn.DBUtil;
import com.library.vo.MemberVo;

public class MemberDao {
	// id, pw를 매개변수로 받아 Member를 리턴하는 메소드
	// PreparedStatement , prepareStatement = db문의 ?에 set을 할 수 있다.
	public MemberVo login(String id, String pw) {
		String sql = "select * from member where id =? and pw =?";
		System.out.println("입력한 아이디 : "+id);
		System.out.println("입력한 패스워드 : "+pw);

		try (Connection conn = DBUtil.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
			// 첫번째 물음표에 id 값을 대조하겠다.
			// 매개변수로 admin, 1234가 들어온다는 가정일때,
			// 즉 select * from member where id = 'admin' and pw = '1234'
			// 라는 문장이 되어 해당 정보를 출력한다.
			// 만약 작성한 id pw 값에 해당하는 데이터가 없을 경우 select 문에서 오류가 날 것이고
			// SQLException이 작동될 것이다.
			
			// 즉 해당하는 id pw가 데이터베이스에 있는지 검증하는 로직이다.
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			// pstmt의 실행 결과를 rs에 담겠다.
			ResultSet rs = pstmt.executeQuery();
			
			// 검증이 통과된 후, 해당 데이터의 컬럼을 가져온다.
			// 해당 컬럼 정보들로 객체를 생성하고 리턴한다.
			// 즉 검증이 완료된 객체의 id, adminYN, name을 리턴해주는 것이다.
			if(rs.next()) {
				String adminYN = rs.getString("adminYN");
				String name = rs.getString("name");
				
				
				// 패스워드는 위의 검증에서 사용 가치를 잃었다.
				// 여기서 pw 변수를 넣지 않음으로서 보안을 살린다.
				MemberVo memberVo = new MemberVo(id,"",adminYN,name);
				return memberVo;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("dao 실패");
		return null;
		// 검증 통과 못한 경우 매개변수에 해당하는 id pw값은 없는 것이기에 null 을 리턴
	}
	public List<MemberVo> getList(){
		List<MemberVo> list = new ArrayList<>();
		String sql = "select * from member";
		try(Connection conn = DBUtil.getConnection(); 
				Statement stmt = conn.createStatement(); 
				ResultSet rs = stmt.executeQuery(sql)){
			while(rs.next()) {
				String id = rs.getString("id");
				String adminYN = rs.getString("adminYN");
				String name = rs.getString("name");
				
				MemberVo member = new MemberVo(id,"",adminYN,name);
				list.add(member);
			}
			
			
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	public int insertMember(MemberVo member) {
		String sql = "insert into member values (?,?,?,?)";
		try(Connection conn = DBUtil.getConnection(); 
				PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setString(1, member.getId());
			stmt.setString(2, member.getPw());
			stmt.setString(3, member.getAdminYN());
			stmt.setString(4, member.getName());
			int res = stmt.executeUpdate();	
			return res;
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}
	public int deleteMember(String id) {
		String sql = "delete from member where id =?";
		System.out.println(id);
		try(Connection conn = DBUtil.getConnection(); 
				PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setString(1, id);
			// 실행 해주기 반환 = 처리갯수
			int res = stmt.executeUpdate();
			return res;
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

}
