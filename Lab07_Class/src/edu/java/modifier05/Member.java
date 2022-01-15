package edu.java.modifier05;

public class Member {
	// field
	private String memberId;
	private String memberPassword;

	// constructor - 파라미터 2개인 생성자만 만듦. 기본 생성자는 만들지 않음.
	public Member(String memberId, String memberPassword) {
		this.memberId = memberId;
		this.memberPassword = memberPassword;
	}

	// 아이디와 비밀번호에 대한 getter(읽기) 메서드 작성
	// getter: 필드(멤버 변수)의 값을 리턴하는 메서드.
	public String getMemberId() {
		return memberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	// 비밀번호에 대한 setter 메서드 작성
	// setter: 필드(멤버 변수)의 값을 설정(변경)하는 메서드.
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

}
