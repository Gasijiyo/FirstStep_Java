package edu.java.loop14;

public class LoopMain14 {

	public static void main(String[] args) {
		/* 3. 369게임 출력
		 	(출력 결과)
		 	1 2 * 4 5 * 7 8 * 10
		 	11 12 * 14 15 * 17 18 * 20
		 	21 22 * 24 25 * 27 28 * *
		 	* * * * * * * * * 40
		 	...
		 	* * * * * * * * * 100
	 	*/

		for (int n = 1; n <= 100; n++) {
			// 숫자 대신 "*"을 출력하는 곳: 
			// (1) 1의 자릿수(10으로 나눈 나머지)가 3 또는 6 또는 9인 경우
			// (2) 10의 자릿수(10으로 나눈 몫)가 3 또는 6 또는 9인 경우
			int n1 = n % 10;  // 10으로 나눈 나머지 -> 1의 자릿수 저장
			int n10 = n / 10; // 10으로 나눈 몫 -> 10의 자릿수 저장
			boolean b1 = (n1 == 3) || (n1 == 6) || (n1 == 9);
			boolean b10 = (n10 == 3) || (n10 == 6) || (n10 == 9);
			
			if (b1 && b10) {
				System.out.print("# ");
			} else if (b1 || b10) {
				System.out.print("* ");
			} else {
				System.out.print(n + " ");
			}
			
			if (n % 10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		/*
		System.out.printf("%3d", 1);
		System.out.println();
		System.out.printf("%3d", 10);
		System.out.println();
		System.out.printf("%3d", 100);
		System.out.println();
		*/
		
		int n = 1;
		while (n <= 100) {
			int n1 = n % 10;  // 1의 자릿수
			int n10 = n / 10; // 10의 자릿수
			boolean b1 = (n1 == 3) || (n1 == 6) || (n1 == 9);
			boolean b10 = (n10 == 3) || (n10 == 6) || (n10 == 9);
			
			if (b1 && b10) {
				System.out.printf("%4s", "**");  // 4칸을 마련해서 문자열(%s)를 출력
			} else if (b1 || b10) {
				System.out.printf("%4s", "*");
			} else {
				System.out.printf("%4d", n);  // 4칸을 마련해서 정수(%d)를 출력
			}
					
			if (n % 10 == 0) {
				System.out.println();
			}
			n++;
		}
		
	}  // end main

}
