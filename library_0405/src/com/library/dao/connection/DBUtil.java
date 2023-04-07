package com.library.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	/*
	 * DB 커넥션을 생성하여 반환합니다.
	 * @return
	 */
	
	public static Connection getConnection() {
		// 접속 정보
		final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		final String id = "orauser";
		final String pw = "1234";
		Connection conn = null;
		
		
		// 커넥션 생성 ( oracle 라이브러리 사용 )
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,id,pw);
		conn.setAutoCommit(false);
		// true : 항상 커밋 
		// false : 커넥션이 종료될때 커밋!!
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
		
	}
	
	// connection 닫는 녀석
	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
		try {
			// 커밋 , Connection은 언제나 있기에 이거 하나면 된다.
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
