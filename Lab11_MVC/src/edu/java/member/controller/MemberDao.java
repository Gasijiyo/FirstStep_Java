package edu.java.member.controller;

import edu.java.member.model.Member;

// DAO(Data Access Object): Controller. 프로그램의 기능(비즈니스 로직).
public interface MemberDao {
	
	/**
	 * 신규 회원 가입 기능: 파라미터로 전달받은 Member 타입 객체를 배열에 저장.
	 * 
	 * @param m - Member 타입(memberId, memberPassword).
	 * @return - 배열에 회원 정보 추가가 성공하면 1, 실패하면 0을 리턴.
	 */
	int insert(Member m);

	/**
	 * 전체 회원 목록 검색 기능: 배열에 저장된 회원(Member 타입)들의 정보를 리턴.
	 * 
	 * @return - null이 아닌 값(Member 객체)가 있는 배열을 생성해서 리턴.
	 */
	Member[] select();
	
	/**
	 * 인덱스를 이용한 검색 기능: 검색할 인덱스를 전달 받아서, 배열에서 해당 인덱스의 Member 객체를 리턴.
	 * 
	 * @param index - int 타입. 검색할 (배열의) 인덱스. 0 이상의 정수.
	 * @return - index에 null이 아닌 Member 객체가 있으면 그 객체를 리턴. 
	 * index가 배열의 범위 밖에 있거나 해당 인덱스의 배열 원소가 null이면 null을 리턴.
	 */
	Member select(int index);
	
	/**
	 * 회원 정보 수정 기능: 업데이트할 회원의 인덱스와 수정할 비밀번호를 전달받아서 배열의 내용을 수정.
	 * 
	 * @param index - int. 0 이상의 정수. 수정할 (배열) 인덱스.
	 * @param password - String. 업데이트할 비밀번호.
	 * @return - 배열에서 회원 정보 수정이 성공하면 1, 실패하면 0을 리턴.
	 */
	int update(int index, String password);
	
}