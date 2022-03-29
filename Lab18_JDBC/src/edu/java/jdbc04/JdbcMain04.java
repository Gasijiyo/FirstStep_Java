package edu.java.jdbc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

import static edu.java.jdbc.ojdbc.OracleJdbc.*;

public class JdbcMain04 {

	public static void main(String[] args) {
		// Oracle JDBC를 사용한 delete
		
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// Oracle JDBC 드라이버를 등록(메모리 로딩)
			DriverManager.registerDriver(new OracleDriver());
			
			// Oracle DB와 연결
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// SQL 문
			// DELETE FROM blogs WHERE blog_no = ?
			String sql = "delete from " + TABLE_BLOGS
					+ " where " + COL_BLOG_NO + " = ?";
			System.out.println(sql);
			
			// PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			// 변경할 글 번호를 입력 받음.
			System.out.println("변경할 글 번호>>>");
			int no = Integer.parseInt(sc.nextLine());
			
			// pstmt를 완성
			pstmt.setInt(1, no);
			
			// SQL 문장 실행, 결과 처리
			int result = pstmt.executeUpdate();
			System.out.println(result + "행이 삭제됐습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
