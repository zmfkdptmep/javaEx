package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.conn.DBUtil;
import com.library.vo.BookVo;

public class BookDao {

	// 데이터 베이스의 테이블을 받아 List에 저장하는 역할
	// Library가 하던 list 역할을 여기서만 한다.
	public List<BookVo> getList() {
		List<BookVo> list = new ArrayList<>();
		String sql = "select * from book order by bookNo asc";
		try (Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while (rs.next()) {
				int bookNo = rs.getInt("bookNo");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String rentYN = rs.getString("rentYN");

				BookVo bookVo = new BookVo(bookNo, title, author, rentYN);
				list.add(bookVo);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	public int insertBook(BookVo bookVo) {
		int res = 0;
		String sql = "insert into book values (?, ?, ?, ?)";
		// prepared를 사용해 이런식으로 편하게 넣을 수 있다.
		try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql);) {
			stmt.setInt(1, bookVo.getBookNo());
			stmt.setString(2, bookVo.getTitle());
			stmt.setString(3, bookVo.getAuthor());
			stmt.setString(4, bookVo.getRentYN());

			res = stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			res = -1;
		}
		return res;
	}

	public int delete(int no) {
		int res = 0;
		String sql = "delete from book where bookNo = ?";
		try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql);) {
			stmt.setInt(1, no);
			res = stmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			res = -1;
		}
		return res;
	}

	public int update(int no, String rentYN) {
		int res = 0;
		String sql = "update book set rentYN = ? where bookNo = ?";
		try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, rentYN);
			stmt.setInt(2, no);

			res = stmt.executeUpdate();
			return res;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	public boolean selStatus(int no) {
		String sql = "select rentYN from book where bookNo =?";
		boolean res = false;
		String rentYN = "";
		try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, no);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				rentYN = rs.getString("rentYN");
			}
			res = (rentYN.equalsIgnoreCase("Y"))?false:true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return res;
	}

}
