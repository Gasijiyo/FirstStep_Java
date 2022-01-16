package edu.java.interface01;

public interface DatabaseModule {
	//필드 (맴버 변수) - public static final 생략 가능.
	int DB_VERSION = 1;
	
	//메소드 - public abstract 생략 가능.
	/**
	 * 데이터베이스에서 자료를 검색하는 기능.
	 * @return 검색된 자료의 개수(정수)
	 */	
	int select();
	
	/**
	 * 데이터베이스에서 비밀번호를 수정하는 기능.
	 * 
	 * @param pw 수정할 비밀번호.
	 * @return 수정된 자료의 개수(정수).
	 */	
	int update(String pw);
	
}
