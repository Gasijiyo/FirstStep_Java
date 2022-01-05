package edu.java.operator01;

public class OperatorMain01 {

	public static void main(String[] args) {
		// Java 연산자(Operator):
		// 할당(assignment) 연산자, 대입 연산자: =
		// 등호(=) 오른쪽의 값을 등호 왼쪽의 변수에 할당(저장)
		int number = 123;
		System.out.println("number = " + number);
		
		// 산술(arithmetic) 연산자: +, -, *, /, %
		int x = 3;
		int y = 2;
		System.out.println("plus = " + (x + y));
		System.out.println("minus = " + (x - y));
		System.out.println("multiply = " + (x * y));
		System.out.println("divide = " + (x / y));
		// (정수1)/(정수2)의 결과는 (정수1)을 (정수2)로 나눈 몫.
		System.out.println("remainder = " + (x % y));
		// (정수1)%(정수2)의 결과는 (정수1)을 (정수2)로 나눈 나머지.
		
		// 실수의 나눗셈(/)은 소수점까지 계산.
		System.out.println(3.0 / 2);
		
		// 문자열에서 사용되는 + 연산자: 두 개의 문자열을 이어붙임(concatenate).
		System.out.println("abc" + 1 + 2);

		// 복합 할당(대입) 연산자: +=, -=, *=, /=, %=, ...
		int intNum = 10;
		// intNum = intNum + 1;
		intNum += 1;
		System.out.println("intNum = " + intNum);
	}

}
