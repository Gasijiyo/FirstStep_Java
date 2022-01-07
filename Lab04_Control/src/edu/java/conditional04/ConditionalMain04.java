package edu.java.conditional04;

import java.util.Scanner;

public class ConditionalMain04 {

	public static void main(String[] args) {
		// if - else if - else 구문
		// 정수를 입력 받아서, 양수인지, 음수인지 또는 0인지를 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력>>>");
		int number = sc.nextInt();
		sc.close();
		
		if (number > 0) {
			System.out.println("positive number");
		} else if (number < 0) {
			System.out.println("negative number");
		} else {  // number가 0이면
			System.out.println("zero");
		}
	
		// 중첩 if 문: if 블록 또는 else 블록 내부에서 if 구문이 사용되는 것.
		if (number > 0) {  // number가 0보다 큰 경우
			System.out.println("양수");
		} else {  // number가 0보다 크지 않은 경우
			if (number < 0) {
				System.out.println("음수");
			} else {
				System.out.println("영");
			}
		}
		
	}  // end of main()

}
