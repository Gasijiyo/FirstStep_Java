package edu.java.conditional07;

import java.util.Random;

public class ConditionalMain07 {

	public static void main(String[] args) {
		// 1.
		// 0 이상 10 이하의 정수 난수 2개를 만들어서 변수에 저장.
		// 두 숫자의 차이(큰 수 - 작은 수)를 차이를 출력.
		Random rand = new Random();
		int x = rand.nextInt(11);  // 0 ~ 10 난수를 만들어서 저장.
		int y = rand.nextInt(11);
		System.out.println("x = " + x + ", y = " + y);
		int diff = (x > y) ? (x - y) : (y - x);  // 큰 수에서 작은 수를 뺀 값을 변수에 저장.
		System.out.println("diff = " + diff);
		
		if (x > y) {
			System.out.println("diff = " + (x - y));
		} else {
			System.out.println("diff = " + (y - x));
		}
		
		// 2.
		// 0 이상 10 미만의 정수 난수를 1개를 만들어서 변수에 저장.
		// 정수가 짝수인 지 홀수인 지를 출력.
		int z  = rand.nextInt(10);
		System.out.println("z = " + z);
		String result = (z % 2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
		
	}

}
