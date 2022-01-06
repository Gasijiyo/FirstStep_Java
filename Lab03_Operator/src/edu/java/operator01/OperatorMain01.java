package edu.java.operator01;

public class OperatorMain01 {

	public static void main(String[] args) {
		// Java연산자 (Operator):
		// 할당(Assignment)연산자, 대입연산자 : =
		// 등호 (=) 오른쪽의 값을 등호 왼쪽의 변수에 할당
		int number = 123;
		System.out.println("number = " + number);
		
		// 산술 (arithmetic) 연산자 : +,-,*,/, %
		int x = 1;
		int y = 2;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		//정수1을 정수2로 나눈 몫
		System.out.println(x%y);
		//정수1을 정수2로 나눈 나머지
		System.out.println(3.0/2);
		//실수의 나눗셈은 소수점까지 계산
		
		System.out.println("abc"+1+2);
		//문자열에서 사용되는 + : 두 개의 문자열을 이어붙임(concatenate)
		
		//복합 할당(대입)연산자 : +=, -=, *=, /=, %=, ...
		int intNum = 10;
		//intNum = intNum + 1;
		intNum += 1; // 출력 결과 : 11
		intNum *= 2;
		intNum /= 2;
		intNum -= 1;
		System.out.println("intNum = " + intNum);
		
	}
	
}
