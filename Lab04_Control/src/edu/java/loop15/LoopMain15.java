package edu.java.loop15;

import java.util.Scanner;

public class LoopMain15 {

	public static void main(String[] args) {
		// 무한 반복문
		// for (;;) {...}
		// while (true) {...}
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {  // 무한 반복문
			System.out.println("[1, 2, 3] 중에 입력>>>");
			int choice = sc.nextInt();
			
			// 사용자가 1, 2, 3 중에 하나를 입력했을 때만 무한 반복문를 종료
			if (choice == 1 || choice == 2 || choice == 3) {
				System.out.println("choice = " + choice);
				break;  // 반복문 종료
			}
			System.out.println("잘못된 선택... 다시 입력...");
		}

		sc.close();
	}

}
