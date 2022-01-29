package edu.java.contact.ver04;

import java.util.List;

import edu.java.contact.model.Contact;

// MVC 아키텍쳐에서 Controller 인터페이스 - DAO(Data Access Object)
public interface ContactDao {
	
	/**
	 * 리스트에 저장된 연락처 정보를 리턴.
	 * 
	 * @return - 연락처 정보가 저장된 리스트.
	 */
	List<Contact> select();
	
	/**
	 * 인덱스에 해당하는 배열의 원소(Contact 객체)를 리턴.
	 * 
	 * @param index - 0 이상의 정수. 검색할 연락처의 인덱스.
	 * @return - index에 있는 Contact 객체. index가 리스트 범위 밖이면 null을 리턴. 
	 */
	Contact select(int index);
	
	/**
	 * Contact 객체를 전달받아서 리스트에 저장.
	 * 
	 * @param c - 리스트에 저장할 Contact 타입 객체.
	 * @return - 리스트에 연락처 저장을 성공하면 1, 실패하면 0을 리턴.
	 */
	int insert(Contact c);
	
	/**
	 * 리스트에서 업데이트할 데이터의 인덱스(index)와 업데이트할 정보(Contact 타입 객체)를 전달받아서,
	 * 리스트의 해당 인덱스 위치의 연락처 정보를 업데이트.
	 * 
	 * @param index - 0 이상의 정수. 리스트에서 업데이트할 연락처의 인덱스. 
	 * @param contact - Contact 타입 객체. 업데이트할 이름, 전화번호, 이메일 정보를 가지고 있음.
	 * @return - 업데이트 성공하면 1, 실패하면 0을 리턴.
	 */
	int update(int index, Contact contact);
	
	/**
	 * 리스트에서 index 위치에 있는 연락처 정보를 삭제.
	 * 
	 * @param index - 0 이상의 정수. 리스트에서 삭제할 연락처의 인덱스.
	 * @return - 삭제 성공하면 1, 실패하면 0을 리턴.
	 */
	int delete(int index);

}