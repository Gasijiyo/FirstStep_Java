package edu.java.jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

import static edu.java.jdbc.ojdbc.OracleJdbc.*;

public class JdbcMain02 {

	public static void main(String[] args) {
		// JDBC - 테이블에 레코드 삽입(insert)
		
		Scanner sc = new Scanner(System.in); // 콘솔 창에서 문자열 입력받기 위해서
		
		Connection conn = null; // DB와 연결을 맺기 위한 객체
		PreparedStatement pstmt = null; // SQL 문장을 실행시키기 위한 객체
		
		try {
			// Oracle JDBC 라이브러리(드라이버)를 로딩(등록, register).
			DriverManager.registerDriver(new OracleDriver());
			
			// DB 서버와 연결 맺기(로그인)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 실행할 insert SQL 문장 템플릿 - ? 부분은 콘솔에서 입력한 내용으로 채워야 함.
//			String sql = "insert into blogs (title, content) values (?, ?)";
			String sql = "insert into " + TABLE_BLOGS  
					+ " (" + COL_TITLE + ", " + COL_CONTENT + ")"
					+ " values (?, ?)";
			
			// SQL 문장을 실행시킬 수 있는 Statement 객체 생성
			// 완성된 SQL 문장을 사용할 때: createStatement() 메서드 사용 -> Statement 객체 생성
			// SQL 템플릿을 사용할 때: prepareStatement() 메서드 사용 -> PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			// PreparedStatement (SQL 문장 템플릿)의 ?를 채우기 위해서 제목/본문을 입력 받음.
			System.out.println("글 제목 입력>>");
			String title = sc.nextLine();
			
			System.out.println("글 본문 입력>>");
			String content = sc.nextLine();
			
			// PreparedStatement의 ? 부분을 채움 -> SQL 문장 완성
			pstmt.setString(1, title); // pstmt의 첫번째 ?를 title로 채움.
			pstmt.setString(2, content); // pstmt의 두번째 ?를 content로 채움.
			
			// SQL 실행, 결과 확인
			// select 문(DQL): executeQuery() 메서드 사용 -> 리턴 타입: ResultSet
			// insert, update, delete 문(DML): executeUpdate() 메서드 사용  -> 리턴 타입: int
			int result = pstmt.executeUpdate();
			System.out.println(result + "개 행이 삽입됐습니다.");
			
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