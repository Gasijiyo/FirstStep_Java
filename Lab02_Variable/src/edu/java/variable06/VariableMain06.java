package edu.java.variable06;

public class VariableMain06 {

	public static void main(String[] args) {
		// 문자 타입(char)
		// encoding: 문자 -> 숫자 코드 값
		// decoding: 숫자 코드 값 -> 문자
		// 문자를 유니코드16(utf-16) 표준의 코드 값(2바이트 정수)으로 저장함.
		char c = 'A';  // 문자 'A'를 변수 c에 할당(저장).
		// A 문자에 해당하는 유니코드 값(2바이트 정수)를 메모리에 저장 -> 인코딩
		System.out.println(c);
		// 2바이트 정수(유니코드 값)을 문자로 변환해서 출력 -> 디코딩

		char c2 = (char)(c + 1);  // 유니코드 값을 1 증가시키면
		System.out.println(c2);  // 그 다음 문자가 됨.
		
		// 문자 'A'의 유니코드 값
		System.out.println((int)c);  // char 타입을 정수 타입(int 또는 short)으로 변환 후 출력
		
	}

}
