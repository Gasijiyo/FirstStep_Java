package edu.java.array07;

import java.util.Random;

public class ArrayMain07 {

	public static void main(String[] args) {
		// 1 ~ 5 사이의 정수 난수 3개를 저장하는 배열을 만드세요.
				// 단, 3개의 숫자는 모두 달라야 함.
				
				Random rand = new Random();  // 난수 만드는 도구
				int[] numbers = new int[3];  // 정수 3개를 저장하는 배열
				int count = 0;  // 배열에 저장된 난수 개수
				while (count < numbers.length) {  // 배열에 저장된 난수 개수가 3개보다 작으면 반복
					int r = rand.nextInt(5) + 1;
					System.out.println(r);
					
					boolean isSame = false;  // 배열에서 같은 숫자가 있으면 true로 바꿀 변수
					for (int i = 0; i < count; i++) {
						if (numbers[i] == r) {
							isSame = true;
							break;  // for 문 종료
						}
					}

					if (isSame == false) {  // 같은 숫자를 발견하지 못했을 때
						numbers[count] = r;  // 배열에 난수 저장
						count++;  // 저장된 난수 개수를 1 증가
					}
					
				}  // end while

	}

}
