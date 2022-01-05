package edu.java.variable05;

public class VariableMain05 {

	public static void main(String[] args) {
		// 실수 타입의 기본 타입: double(8바이트)
		// 실수 리터럴은 기본적으로 double 타입으로 만들어짐.
		// 실수 리터럴을 float 타입으로 만들려면 숫자 뒤에 f 또는 F를 붙임.
		// 실수의 사칙연산은 double로 자동 변환 후 연산이 수행됨.
		double pi = 3.14;
		System.out.println("pi = " + pi);
		
		float number = 3.14f;
		System.out.println("number = " + number);
		
		float x = 1.0f;
		double y = 2.0;
		double z = x + y;  // x가 double 타입으로 자동 변환 후 덧셈이 수행.
		System.out.println(z);
		// 계산이 수행은 되지만 서로 다른 데이터 타입을 쓰는 것은 권장하지 않음.
		// 변수를 선언할 때부터 모두 double로 선언하는 것이 나음.
		
		// 정수 / 정수: 나눈 몫
		// 실수 / 실수, 정수 / 실수, 실수 / 정수: 소수점 이하까지 나누기 계산.
		System.out.println(10 / 3);  // int / int
		System.out.println(10.0 / 3.0);  // double / double

	}

}
