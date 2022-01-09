package edu.java.loop03;

public class LoopMain03 {

	public static void main(String[] args) {
		// for 반복문을 사용해서 0, 2, 4, 6, 8, 10을 한줄씩 출력
		for (int n = 0; n <= 10; n += 2) {  // n은 0부터 10보다 작거나 같을 때까지 2씩 증가시키면서
			System.out.println(n);          // n을 출력
		}
		
		System.out.println("-----");
		
		for (int n = 0; n <= 5; n++) {  // n은 0부터 5보다 작거나 같을 때까지 1씩 증가시키면서
			System.out.println(2 * n);  // 2*n을 출력
		}
		
		System.out.println("-----");
		
		for (int n = 0; n <= 10; n++) {  // n은 0부터 10보다 작거나 같을 때까지 1씩 증가시키면서
			if (n % 2 == 0) {            // n이 짝수이면
				System.out.println(n);   // n을 출력
			}
		}
		
	}  // end main

}
