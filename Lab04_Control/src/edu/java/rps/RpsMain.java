package edu.java.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsMain {

	public static void main(String[] args) {
		// 가위/바위/보 게임(Rock Paper Scissors)
		// 가위=1, 바위=2, 보=3으로 정의
		
		// 사용자가 가위/바위/보 중에 하나를 선택:
		//   Scanner 사용해서 1, 2, 3 중에 하나를 입력 받고 저장함.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위/바위/보 게임");
		System.out.println("[1] 가위");
		System.out.println("[2] 바위");
		System.out.println("[3] 보");
		System.out.println("선택(1, 2, 3) >>>");
		int user = sc.nextInt();
		
		sc.close();
		
		// 컴퓨터가 가위/바위/보 중에 하나를 선택:
		//   Random 사용해서 1, 2, 3 중에 하나를 난수로 만들고 저장함.
		Random rand = new Random();
		int computer = rand.nextInt(3) + 1;
		
		System.out.println("user:computer = " + user + ":" + computer);
		
		String userChoice = "";
		switch (user) {
		case 1:
			userChoice = "가위";
			break;
		case 2:
			userChoice = "바위";
			break;
		case 3:
			userChoice = "보";
			break;
		}
		
		String comChoice = "";
		switch (computer) {
		case 1:
			comChoice = "가위";
			break;
		case 2:
			comChoice = "바위";
			break;
		case 3:
			comChoice = "보";
			break;
		}

		System.out.println("user:computer = " + userChoice + ":" + comChoice);
		
		// 사용자와 컴퓨터 중 누가 이겼는 지를 판단하고 그 결과를 출력.
		/*
		if (user == 1) {  // user: 가위
			if (computer == 1) {  // computer: 가위
				System.out.println("Tie");
			} else if (computer == 2) {  // computer: 바위
				System.out.println("You lose...");
			} else {  // computer: 보
				System.out.println("You win!!!");
			}
		} else if (user == 2) {  // user: 바위
			if (computer == 1) {  // computer: 가위
				System.out.println("You win!!!");
			} else if (computer == 2) {  // computer: 바위
				System.out.println("Tie");
			} else {  // computer: 보
				System.out.println("You lose...");
			}
		} else if (user == 3) {  // user: 보
			if (computer == 1) {  // computer: 가위
				System.out.println("You lose...");
			} else if (computer == 2) {  // computer: 바위
				System.out.println("You win!!!");
			} else {  // computer: 보
				System.out.println("Tie");
			}
		}
		*/
		
		/*
		if (user == computer) {  // 비기는 경우 3가지
			System.out.println("Tie");
		} else if (user == 1) {  // user: 가위
			if (computer == 2) {  // computer: 바위
				System.out.println("You lose...");
			} else {  // computer: 보
				System.out.println("You win!!!");
			}
		} else if (user == 2) {  // user: 바위
			if (computer == 1) {  // computer: 가위
				System.out.println("You win!!!");
			} else {  // computer: 보
				System.out.println("You lose...");
			}
		} else if (user == 3) {  // user: 보
			if (computer == 1) {  // computer: 가위
				System.out.println("You lose...");
			} else {  // computer: 바위
				System.out.println("You win!!!");
			}
		}
		*/
		
		int diff = user - computer;
		if (diff == 0) {  // 비기는 경우
			System.out.println("Tie");
		} else if (diff == 1 || diff == -2) {  // user 승리
			System.out.println("You win!!!");
		} else {  // diff == 2 || diff == -1: computer 승리
			System.out.println("You lose...");
		}
		
	}  // end main

}
