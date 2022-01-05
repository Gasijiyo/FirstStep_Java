package edu.java.variable04;

public class VariableMain04 {

	public static void main(String[] args) {
		// int: 4바이트 크기의 정수
		// long: 8바이트 크기의 정수
		// Java에서 정수 리터럴(literal)의 기본 타입은 int
		// 정수 리터럴을 long 타입으로 만들려면 숫자 뒤에 영문자 l 또는 L을 붙여줌.
		long longNumber = 12345678900L;
		System.out.println(longNumber);
		
		// 변수 타입 변환
		// 자동(암묵적) 타입 변환
		short shortNumber = 100;  // int 타입 리터럴 100이 short 타입으로 변환
		System.out.println(shortNumber);
		
		// 명시적 타입 변환(casting): (변환할 타입)값/변수
		int intNumber = (int)100L;
		System.out.println(intNumber);
		
		// 명시적 타입 변환 예
		byte x = 100;
		byte y = 28;
		byte add = (byte)(x + y);
		System.out.println(add);  // overflow: 변수 저장 범위가 넘침.
		
		// 다른 방법
		int add2 = x + y;
		System.out.println(add2);
		
		// Ctrl+Space: 코드 자동 완성 (힌트)
		// Ctrl+/: (현재 커서가 있는 라인) 주석 만들기/해제 토글

	}

}
