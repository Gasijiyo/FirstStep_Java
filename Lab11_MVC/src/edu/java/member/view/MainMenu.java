package edu.java.member.view;

//인터페이스의 멤버: 1) public static final 멤버 변수, 2) public abstract 메서드
public interface MainMenu {
	// Main view(메인 클래스)에서 필요한 기능들 정의
	int QUIT = 0;            // 프로그램 종료
	int SELECT_ALL = 1;      // 회원 목록 전체 검색
	int SELECT_BY_INDEX = 2; // 인덱스로 회원 1명 정보 검색
	int INSERT = 3;          // 신규 회원 가입(추가)
	int UPDATE = 4;          // 회원 정보(비밀번호) 수정
}