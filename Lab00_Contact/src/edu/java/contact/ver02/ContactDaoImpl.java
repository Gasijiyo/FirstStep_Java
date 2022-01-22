package edu.java.contact.ver02;

import edu.java.contact.model.Contact;

public class ContactDaoImpl implements ContactDao {
	
	private static final int MAX_LENGTH = 3;	//배열의 크기
	private Contact[] contacts = new Contact[MAX_LENGTH];	//연락처를 저장할 배열
	private int count = 0;	//현재까지 배열에 저장된 연락처의 개수
	
	// Singleton 디자인 패턴 
	// 1) private static으로 자기자신 타입의 변수를 선언.
	private static ContactDaoImpl instance = null;
	
	// 2) 생성자를 private로 선언
	private ContactDaoImpl() {}
	
	// 3) 생성자대신에 인스턴스를 생성할 수 있는 public static 메소드를 제공
	public static ContactDaoImpl getInstance() {	
		if (instance == null) {
			// instance가 null 인 경우에만 생성자를 호출
			instance = new ContactDaoImpl();
		}
		return instance;	//생성된 객체의 주소값을 리턴
	}
	@Override
	public Contact[] select() {
		Contact[] result = new Contact[count];	
		// 저장하고 있는 원소 개수 만큼의 배열 생성
		for (int i = 0; i < count ; i++) {
			result[i] = contacts[i];
		}
		return result;
	}

	@Override
	public Contact select(int index) {
		Contact result = null;
		if (index >= 0 && index < MAX_LENGTH) {
			result = contacts[index];
		}
		return result;
	}

	@Override
	public int insert(Contact c) {
		int result = 0;
		if (count < MAX_LENGTH) { // 배열에 저장된 원소의 개수가 배열 크기보다 작으면 
			contacts[count] = c; // 배열에 저장된 가장 마지막 원소 바로 뒤에 전달받은 연락처를 추가
			count++; // 배열의 원소 개수를 증가
			result = 1; // 새 연락처 추가 결과를 성공(1)으로 설정.
		}
		return result;
	}

	@Override
	public int update(int index, Contact contact) {
		int result = 0;
		if (index >= 0 && index < count) {
//			contacts[index] = contact;
			contacts[index].setName(contact.getName());
			contacts[index].setPhone(contact.getPhone());
			contacts[index].setEmail(contact.getEmail());
			result = 1;
		}
		return result;
	}

}
