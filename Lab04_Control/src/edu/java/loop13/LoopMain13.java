package edu.java.loop13;

public class LoopMain13 {

	public static void main(String[] args) {
		/* 2. 아래와 같이 출력되도록 코드 작성
		 	(출력 결과)
		 	1꼬마 2꼬마 3꼬마 인디언
		 	4꼬마 5꼬마 6꼬마 인디언
		 	7꼬마 8꼬마 9꼬마 인디언
		 	10꼬마 인디언 소년~
		 */
		for (int n = 1; n <= 10; n++) {
			System.out.print(n + "꼬마 ");
			if (n % 3 == 0) {  // n이 3의 배수이면
				System.out.println("인디언");  // 줄바꿈
			}
		}
		System.out.println("인디언 소년~");
		
		System.out.println();
		int n = 1;
		while (n <= 10) {
			System.out.print(n + " little ");
			if (n % 3 == 0) {
				System.out.println("indian");
			}
			n++;
		}
		System.out.println("indian boys~");

	}

}
