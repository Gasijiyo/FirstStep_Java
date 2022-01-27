package edu.java.contact.model;

//연락처 프로그램에서 사용할 데이터 객체
public class Contact {
	// field
	private String name;
	private String phone;
	private String email;

	// 생성자 - default, 파라미터 3개인 생성자
	public Contact() {}

	public Contact(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	// getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// System.out.println(객체) 메서드의 출력문에서 참조값(@...) 대신에 원하는 문자열로 출력하기 위해서.
	@Override
	public String toString() {
		return "Contact{name:" + name + ", phone:" + phone + ", email:" + email + "}";
	}

} // end class Contact