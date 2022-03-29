package edu.java.jdbc.ojdbc;

public interface OracleJdbc {
	// Oracle DB 접속 주소(포트, SID)/접속 방식
	String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	// Oracle DB 접속 사용자 이름
	String USER = "scott";
	// Oracle DB 접속 비밀번호
	String PASSWORD = "tiger";
	
	// DB 테이블 이름
	String TABLE_BLOGS = "blogs";
	// blogs 테이블의 컬럼 이름
	String COL_BLOG_NO = "blog_no";
	String COL_TITLE = "title";
	String COL_CONTENT = "content";
	String COL_UPDATE_TIME = "update_time";
}
