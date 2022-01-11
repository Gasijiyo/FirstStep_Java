package edu.java.switch02;

import java.util.Random;

public class SwitchMain02 {

	public static void main(String[] args) {
		// switch case 연습
		// 0 ~ 9 사이의 정수 난수를 생성해서 변수에 저장.
		// 숫자 짝수인 지 홀수인 지를 출력.
		
		Random rand = new Random();
		int number = rand.nextInt(10);
		System.out.println("number = " + number);
		
		switch (number % 2) {  // number를 2로 나눈 나머지가
		case 0:  // 0인 경우
			System.out.println("짝수");
			break;
		case 1:  // 1인 경우
			System.out.println("홀수");
			break;
		}

	}

}
