package edu.java.loop05;

public class LoopMain05 {

	public static void main(String[] args) {
		/* 아래와 같이 출력되도록 for 반복문을 작성
		   1 2 3 ... 9 10
		   11 12 13 ... 19 20
		   21 22 23 ... 29 30
		   ...
		   91 92 93 ... 99 100
		   
		   (힌트)
			System.out.print(): 출력 후 줄바꿈이 없음.
		    System.out.println(): 출력 후 줄바꿈이 있음.
		 */
		for (int n = 1; n <= 100; n++) {
			System.out.print(n + " ");  // 숫자를 한 줄에 출력
			if (n % 10 == 0) {  // 10의 배수이면
				System.out.println();  // 줄바꿈
			}
		}

	}  // end main

}
