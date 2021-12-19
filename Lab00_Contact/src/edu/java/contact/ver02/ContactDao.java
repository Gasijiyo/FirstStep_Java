package edu.java.contact.ver02;

import edu.java.contact.model.Contact;

public interface ContactDao {
	
	/**
	 * 배열에 저장된 연락처 정보를 리턴.
	 * 
	 * @return - 배열에 저장된 원소 개수 크기의 Contact 배열.
	 */
	Contact[] select();
	
	/**
	 * 인덱스에 해당하는 배열의 원소(Contact 객체)를 리턴.
	 * 
	 * @param index - 0 이상의 정수. 검색할 인덱스
	 * @return - index에 배열 원소가 있으면 Contact 객체, 
	 * index에 원소가 없거나 index가 배열 크기 범위 밖이면 null을 리턴. 
	 */
	Contact select(int index);
	
	/**
	 * Contact 객체를 전달받아서 배열에 저장. 만약 배열에 빈 공간이 없으면 0을 리턴함.
	 * 
	 * @param c - 배열에 저장할 Contact 타입 객체.
	 * @return - 배열에 저장 성공하면 1, 실패하면 0을 리턴.
	 */
	int insert(Contact c);
		
	/**
	 * 배열에서 업데이트할 데이터의 인덱스(index)와 업데이트할 정보(Contact 타입 객체)를 전달받아서,
	 * 배열의 해당 인덱스 원소의 값들을 업데이트.
	 * index에 업데이트할 객체가 없거나, 배열 범위 밖이면 실패(0)를 리턴.
	 * 
	 * @param index - 0 이상의 정수. 배열에서 업데이트할 인덱스. 
	 * @param contact - Contact 타입 객체. 업데이트할 이름, 전화번호, 이메일 정보를 가지고 있음.
	 * @return - 업데이트 성공하면 1, 실패하면 0을 리턴.
	 */
	int update(int index, Contact contact);
//	int update(int index, String name, String phone, String email);
	
	
}
