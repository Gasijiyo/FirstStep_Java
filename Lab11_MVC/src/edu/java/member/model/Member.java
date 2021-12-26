package edu.java.member.model;

//Model 클래스. VO(Value Object). DTO(Data Transfer Object).
public class Member {
	// field
	private String memberId;
	private String memberPassword;
	
	// constructor
	public Member() {}
	public Member(String memberId, String memberPassword) {
		this.memberId = memberId;
		this.memberPassword = memberPassword;
	}
	
	// getters & setters
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	
	@Override
	public String toString() {
		String info = "Member{ID:" + memberId + ", PW:" + memberPassword + "}";
		return info;
	}
}
