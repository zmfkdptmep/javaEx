package com.library.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	/*
	 * DB Ŀ�ؼ��� �����Ͽ� ��ȯ�մϴ�.
	 * @return
	 */
	
	public static Connection getConnection() {
		// ���� ����
		final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		final String id = "orauser";
		final String pw = "1234";
		Connection conn = null;
		
		
		// Ŀ�ؼ� ���� ( oracle ���̺귯�� ��� )
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,id,pw);
		conn.setAutoCommit(false);
		// true : �׻� Ŀ�� 
		// false : Ŀ�ؼ��� ����ɶ� Ŀ��!!
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
		
	}
	
	// connection �ݴ� �༮
	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
		try {
			// Ŀ�� , Connection�� ������ �ֱ⿡ �̰� �ϳ��� �ȴ�.
			if(conn != null && !conn.isClosed()) conn.commit();
			
			if(conn != null && !conn.isClosed()) conn.close();
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(rs != null && !rs.isClosed()) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void closeConnection(Connection conn, Statement stmt) {
		try {
			if(conn != null && !conn.isClosed()) conn.commit();
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
