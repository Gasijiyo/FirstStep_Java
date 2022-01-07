package edu.java.conditional06;

import java.util.Random;

public class ConditionalMain06 {

	public static void main(String[] args) {
		// 삼항(조건 선택) 연산자와 if-else 구문
		
		// 0 ~ 9 사이의 정수 난수 2개를 만듦.
		Random rand = new Random();  // 난수를 만들어주는 객체를 생성.
		
		int number1 = rand.nextInt(10);  // 0 이상 10 미만의 정수 난수를 만들어서 변수에 저장.
		System.out.println("number1 = " + number1);

		int number2 = rand.nextInt(10);
		System.out.println("number2 = " + number2);
		
		// 두 숫자 중에서 더 큰(크거나 같은) 숫자를 출력
		int bigger1;  // number1과 number2 중에서 더 큰 정수를 저장하기 위한 변수를 선언.
		if (number1 > number2) {
			bigger1 = number1;  // 더 큰 숫자를 bigger1에 저장.
		} else {
			bigger1 = number2;
		}
		System.out.println("bigger1 = " + bigger1);
		
		// 삼항(조건 선택) 연산자 - (조건식) ? (값1) : (값2)
		int bigger2 = (number1 > number2) ? number1 : number2;
		System.out.println("bigger2 = " + bigger2);
	}

}
