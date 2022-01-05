package edu.java.variable01;

public class VariableMain01 {

	public static void main(String[] args) {
		// 변수(variable): 프로그램 실행 중에 필요한 데이터를 저장하는 공간을 부르는 이름.
		// 변수 사용 방법 1: 변수 선언과 초기화(값을 할당)을 한 문장으로.
		// 변수타입 변수이름 = 값;
		int number1 = 20;  // 변수 number1에 정수 20을 할당(저장)함.
		int number2 = 5;  // 변수 number2에 정수 5을 저장.
		
		// number1을 출력
		System.out.println(number1);
		// number2를 출력
		System.out.println(number2);
		// 두 변수의 사칙 연산 결과를 출력
		System.out.println(number1 + number2);
		System.out.println(number1 - number2);
		System.out.println(number1 * number2);
		System.out.println(number1 / number2);
		
		// println() 기능
		System.out.println("number1 = " + number1);
		System.out.println("number1 + number2 = " + number1 + number2);  // (1)
		System.out.println("number1 + number2 = " + (number1 + number2));  // (2)
		// (1)과 (2) 출력 결과 차이
	}

}