package edu.java.loop12;

public class LoopMain12 {

	public static void main(String[] args) {
		// for구문, while 구문을 모두 사용
		
		/* 1. 아래와 같이 출력되도록 코드 작성
		 	(출력 결과)
		 	*
		 	**
		 	***
		 	****
		 	*****
		 */
		for (int i = 1; i <= 5; i++) {
			// 한 줄에 "*"들을 출력
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();  // 줄바꿈
		}
		
		System.out.println();
		
		int x = 1;
		while (x <= 5) {
			// 한 줄에 "*"를 출력
			int y = 1;
			while (y <= x) {
				System.out.print("#");
				y++;
			}
			System.out.println();  // 줄바꿈
			
			x++;
		}

	}

}
