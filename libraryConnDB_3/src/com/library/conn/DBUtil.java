package com.library.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DB ���� ���� �� 
// Connection, Statement, ResultSet ��ü�� �������� �ʰ�
// �ܺο��� commit, close, rollback �� ����� �� �ְ� ����� �޼ҵ�

public class DBUtil {
	public static void main(String[] args) {
		System.out.println(DBUtil.getConnection());
	}
	
	public static Connection getConnection() {
		final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		final String id = "orauser";
		final String pw = "1234";
		
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			conn.setAutoCommit(false);
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}catch(ClassNotFoundException e1) {
			System.out.println(e1.getMessage());
			System.out.println("���̺귯���� Ȯ���� �ּ���.");
		}
		return conn;
	}
	
	public static void commit(Connection conn) {
		try {
			if(conn!=null&&!conn.isClosed()) conn.commit();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	} 
	public static void rollback(Connection conn) {
		try {
			if(conn!=null&&!conn.isClosed()) conn.rollback();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void close(Connection conn, Statement stmt) {
		try {
			if(conn!=null&&!conn.isClosed()) conn.close();
			if(stmt!=null&&!stmt.isClosed()) stmt.close();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(conn!=null&&!conn.isClosed()) conn.close();
			if(stmt!=null&&!stmt.isClosed()) stmt.close();
			if(rs!=null&&!rs.isClosed()) rs.close();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
