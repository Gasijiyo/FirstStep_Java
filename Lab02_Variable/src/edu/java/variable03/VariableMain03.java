package edu.java.variable03;

public class VariableMain03 {

	public static void main(String[] args) {
		// Java의 기본 데이터 타입(primitive data type)
		// 정수 타입: byte(1바이트), short(2바이트), int(4바이트), long(8바이트), char(2바이트)
		// 실수 타입: float(4바이트), double(8바이트)
		// 논리 타입: boolean(true 또는 false 만을 저장하는 타입)
		
		// byte 타입 변수 a를 선언하고, 값 1을 저장
		byte a = 1;
		System.out.println("a = " + a);
		
		// 변수 a의 값을 128로 변경하려고 하면 에러 발생
		// byte 타입에는 -128 ~ 127 범위의 숫자만 저장할 수 있기 때문에.
		// a = 128;
		
		// short 타입 변수 b를 선언하고, 값 128을 저장.
		short b = 128;
		System.out.println("b = " + b);
		
		// 변수 b의 값을 32768로 변경하려고 하면 에러 발생
		// short 타입에는 -32,768 ~ 32,767 범위의 숫자만 저장할 수 있기 때문에.
		// b = 32768;
	}

}
