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
	// id, pw�� �Ű������� �޾� Member�� �����ϴ� �޼ҵ�
	// PreparedStatement , prepareStatement = db���� ?�� set�� �� �� �ִ�.
	public MemberVo login(String id, String pw) {
		String sql = "select * from member where id =? and pw =?";
		System.out.println("�Է��� ���̵� : "+id);
		System.out.println("�Է��� �н����� : "+pw);

		try (Connection conn = DBUtil.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {
			// ù��° ����ǥ�� id ���� �����ϰڴ�.
			// �Ű������� admin, 1234�� ���´ٴ� �����϶�,
			// �� select * from member where id = 'admin' and pw = '1234'
			// ��� ������ �Ǿ� �ش� ������ ����Ѵ�.
			// ���� �ۼ��� id pw ���� �ش��ϴ� �����Ͱ� ���� ��� select ������ ������ �� ���̰�
			// SQLException�� �۵��� ���̴�.
			
			// �� �ش��ϴ� id pw�� �����ͺ��̽��� �ִ��� �����ϴ� �����̴�.
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			// pstmt�� ���� ����� rs�� ��ڴ�.
			ResultSet rs = pstmt.executeQuery();
			
			// ������ ����� ��, �ش� �������� �÷��� �����´�.
			// �ش� �÷� ������� ��ü�� �����ϰ� �����Ѵ�.
			// �� ������ �Ϸ�� ��ü�� id, adminYN, name�� �������ִ� ���̴�.
			if(rs.next()) {
				String adminYN = rs.getString("adminYN");
				String name = rs.getString("name");
				
				
				// �н������ ���� �������� ��� ��ġ�� �Ҿ���.
				// ���⼭ pw ������ ���� �������μ� ������ �츰��.
				MemberVo memberVo = new MemberVo(id,"",adminYN,name);
				return memberVo;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("dao ����");
		return null;
		// ���� ��� ���� ��� �Ű������� �ش��ϴ� id pw���� ���� ���̱⿡ null �� ����
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
			// ���� ���ֱ� ��ȯ = ó������
			int res = stmt.executeUpdate();
			return res;
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

}
