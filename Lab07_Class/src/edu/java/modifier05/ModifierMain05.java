package edu.java.modifier05;

public class ModifierMain05 {

	public static void main(String[] args) {
		// Member 클래스의 인스턴스 생성.
		Member m1 = new Member("admin", "admin1234");
		// private 멤버(필드, 생성자, 메서드)는 직접 접근(사용) 불가.
		// System.out.println(m1.memberId);
		// m1.memberPassword = "!@#$";
		
		// public getter를 사용해서 private 멤버의 값을 간접적으로 읽어옮.
		System.out.println(m1.getMemberId());
		System.out.println(m1.getMemberPassword());
		
		// public setter를 사용해서 private 멤버의 값을 간접적으로 변경 가능.
		m1.setMemberPassword("adminadmin");  // memberPassword의 값을 "adminadmin"으로 변경.
		System.out.println(m1.getMemberPassword());

	}

}