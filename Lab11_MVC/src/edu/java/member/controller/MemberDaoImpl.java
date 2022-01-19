package edu.java.member.controller;

import edu.java.member.model.Member;

// Controller 인터페이스를 구현하는 클래스 - 모든 View 클래스에서 동일한 인스턴스를 사용하도록 singleton 패턴 적용
public class MemberDaoImpl implements MemberDao {
	// 배열 최대 크기 정의
	private static final int MAX_LENGTH = 3;
	
	// 회원 정보를 저장하기 위한 배열
	private Member[] memberList = new Member[MAX_LENGTH];
	
	// 배열에 저장된 회원 정보 개수를 저장하기 위한 변수
	private int count = 0;
	
	// singleton 디자인 패턴
	// 1) private static 자기자신 타입 변수를 선언
	private static MemberDaoImpl instance = null;
	// 2) 생성자를 private으로 선언 - 다른 클래스에서 호출하지 못하도록
	private MemberDaoImpl() {}
	// 3) public static 메서드를 제공해서 오직 한 개의 instance만 생성되도록 함.
	public static MemberDaoImpl getInstance() {
		if (instance == null) {
			instance = new MemberDaoImpl();
		}
		return instance;
	}

	

	@Override
	public Member[] select() {
		Member[] list = new Member[count];  // 현재까지 저장된 회원 숫자만큼의 배열을 생성.
		for (int i = 0; i < count; i++) {
			list[i] = memberList[i];
		}
		
		return list;
	}

	@Override
	public Member select(int index) {
		Member member = null;
		if (index >= 0 && index < MAX_LENGTH) { // index가 배열의 범위 안에 있으면
			member = memberList[index];
		}
		
		return member;
	}

	@Override
	public int insert(Member m) {
		int result = 0;
		if (count < MAX_LENGTH) { // 현재까지 배열에 저장된 원소의 개수가 배열의 최대 크기를 넘지 않으면
			memberList[count] = m; // 배열에 원소 추가 
			count++; // 원소 개수를 1 증가
			result = 1;  // 결과 - 성공
		}
		
		return result;
	}
	
	@Override
	public int update(int index, String password) {
		int result = 0;
		if (index >= 0 && index < count) { // index가 현재 저장된 원소 개수 미만이면
			memberList[index].setMemberPassword(password); // Member 클래스의 setter 사용
			result = 1;
		}
		
		return result;
	}

}