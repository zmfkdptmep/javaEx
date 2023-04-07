package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.library.dao.connection.DBUtil;
import com.library.vo.Book;

public class DatabaseDao implements Dao {

	@Override
	public List<Book> getList() {
		List<Book> list = new ArrayList<Book>();
		
		try {
		Connection conn = DBUtil.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from book order by no");
		
		while(rs.next()) {
			int no = rs.getInt("no");
			String title = rs.getString("title");
			String author = rs.getString("author");
			// Y,N
			String isRentStr = rs.getString("isRent");
			// (조건) ? 참일때 반환값 : 거짓일때 반환값
			boolean isRent = ("Y".equals(isRentStr))?true:false;			
			
			Book book = new Book(no,title,author,isRent);
			list.add(book);
			conn.commit();
		}
		
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	@Override
	public boolean listToFile(List<Book> list) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int delete(int no) {
		int res = 0;
		try {
		Connection conn = DBUtil.getConnection();
		Statement stmt = conn.createStatement();
		String sql = "delete book where no = "+no;
		res = stmt.executeUpdate(sql);
		conn.commit();
		System.out.println("삭제 완료");
		
		DBUtil.closeConnection(conn, stmt);
		
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return res;
	}

	@Override
	public int update(int no, String isRent) {
		int res = 0;
		try {
		Connection conn = DBUtil.getConnection();
		Statement stmt = conn.createStatement();
		String sql = "update book set isRent = '"+isRent+"' where no ="+no;
		res = stmt.executeUpdate(sql);
		conn.commit();
		System.out.println("업데이트 완료");
		
		DBUtil.closeConnection(conn, stmt);
		
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return res;
	}

	@Override
	public int insert(Book book) {
		int res = 0;
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			String str = (book.isRent())?"Y":"N";
			String sql = "insert into book values("+book.getNo()+",'"+book.getTitle()+"','"+book.getAuthor()+"','"+str+"',sysdate,null)";
			res = stmt.executeUpdate(sql);
			conn.commit();
			System.out.println("삽입 완료");
			
			DBUtil.closeConnection(conn, stmt);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return res;
	}

}
