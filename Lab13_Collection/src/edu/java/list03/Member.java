package edu.java.list03;

public class Member {
	//field
	private String memberId;
	private String memberPassword;
	
	
	//생성자 - 기본, 파라미터2개
	public Member() {
		//default 
	}
	
	public Member(String memberId, String memberPassword) {
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		
	}

	//getter & setter	
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
	
	public String toString() {
		return ("ID: " + memberId +" PW: " + memberPassword );
	}	//return super.toString;
	
	//equals, hashCode 메소드
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof Member) { // 파라미터 obj가 Point 타입의 인스턴스이면
			Member other = (Member) obj;	//casting (강제타입변환)
			if (this.memberId.equals(other.memberId)) {	//나의 memberID와 파라미터가 전달된 객체의 memberId와 같으면
				// 비교 시 '==' 사용하면 안됨. '=='는 주소값 비교
				// 문자열간의 비교는 equals 사용.  '==' 사용 불가!
				result = true;					
			}
		}
		return result;
	}
	
	//hashCode 메소드 override: equals 가 true 를 리턴하는 두 객체는 같은 hashCode값을 갖도록 구현
	@Override
	public int hashCode() {
		// equals() 메서드가 true를 리턴하는 인스턴스들은 hashCode()의 리턴값이 같아야 함!
		// equals를 override 할 때 memberId만 같으면 true가 되도록 구현했기 때문에
		// hashCode도 memberId(String 클래스 객체)의 hashCode를 이용하면 됨
		return this.memberId.hashCode();
	}
	
	
	
	
} //end class 
