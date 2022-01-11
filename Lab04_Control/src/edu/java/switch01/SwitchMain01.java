package edu.java.switch01;

import java.util.Random;

public class SwitchMain01 {

	public static void main(String[] args) {
		// switch - case 구문
		
		// 1 ~ 5 사이의 정수 난수를 만들고 변수 저장.
		Random rand = new Random();
		int number = rand.nextInt(5) + 1;
		System.out.println("number = " + number);
		
		if (number == 1) {
			System.out.println("하나");
		} else if (number == 2) {
			System.out.println("둘");
		} else if (number == 3) {
			System.out.println("셋");
		} else {
			System.out.println("몰라요~");
		}

		// 위의 결과와 같은 결과를 만드는 다른 문법:
		switch (number) {
		case 1:
			System.out.println("One");
			break;  // switch를 끝냄.
			
		case 2:
			System.out.println("Two");
			break;
			
		case 3:
			System.out.println("Three");
			break;
			
		default:  // 위의 어느 case에도 해당되지 않을 때
			System.out.println("I don't know~");
		}  // end switch
		
		// switch (식)에서 계산된 결과에 따라서 해당 case로 이동 후 break;를 만날 때까지 코드를 실행.
		// 위의 결과와 비교!!
		switch (number) {
		case 1:
			System.out.println("one");
			
		case 2:
			System.out.println("two");
			
		case 3:
			System.out.println("three");
			
		default:
			System.out.println("I have no idea~");
		}
		
	}  // end main

}  // end class
