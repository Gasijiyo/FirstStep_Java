package edu.java.variable08;

// Scanner 클래스를 사용하기 위한 import 선언문
import java.util.Scanner;

public class VariableMain08 {

	public static void main(String[] args) {
		// 콘솔 창에서 숫자를 입력 받아서 변수에 저장하는 방법
		// 1. Scanner 타입의 변수를 선언하고 초기화.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력>>>");
		// 2. Scanner 도구의 기능을 이용해서 콘솔 창에서 정수를 입력받음.
		int number = sc.nextInt();
		System.out.println("number = " + number);
		
		System.out.println("두번째 정수를 입력>>>");
		int number2 = sc.nextInt();
		System.out.println("number2 = " + number2);
		
		sc.close();  // 입력 도구 사용을 끝냄.
		System.out.println("프로그램 끝");
	}

}
