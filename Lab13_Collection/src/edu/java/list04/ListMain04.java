package edu.java.list04;

public class ListMain04 {

	public static void main(String[] args) {
		// Score 클래스 인스턴스 생성
		Score score1 = new Score();
		System.out.println("score1: " + score1);
		
		Score score2 = new Score(0, 0);
		System.out.println("score2: " + score2);
	
		System.out.println("연산자 결과: " + (score1 == score2));
		// -> 참조타입 (클래스타입) 변수들을 == 연산자로 같은 지 비교 시
		//인스턴스가 생성된 메모리의 주소값이 같은 지를 비교하는 것
		System.out.println("equals 메소드 리턴 값: " + score1.equals(score2));
		//Object 클래스는 주소값을 기본으로 비교한다.
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println("== : " + (s1 == s2)); //->주소값 다름.
		System.out.println("equals: " + s1.equals(s2));	//문자열의 내용이 같다.
		System.out.println("s1 hashCode: " + s1.hashCode());
		System.out.println("s2.hashCode: " + s2.hashCode());
		
	}

}
