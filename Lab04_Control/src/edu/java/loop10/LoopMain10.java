package edu.java.loop10;

public class LoopMain10 {

	public static void main(String[] args) {
		// while과 do-while 비교
		
		// 1부터 5까지 오름차순 출력
		int n = 1;  // 초기화 문장
		do {
			System.out.print(n + " ");  // 실행문
			n++;  // 변수 값 변경
		} while (n <= 5);  // 반복 조건 검사
		System.out.println();
		
		System.out.println("-----");
		// while문은 반복을 시작하기 전에 조건을 검사하기 때문에,
		// 실행 블록이 한번도 실행되지 않는 경우가 있을 수 있음.
		n = 5;
		while (n < 0) {
			System.out.println(n);
			n++;
		}
		System.out.println("while문 끝: n = " + n);
		
		// do-while문은 블록을 먼저 실행 후 반복할 지 말 지를 조건 검사를 함.
		n = 5;
		do {
			System.out.println(n);
			n++;
		} while (n < 0);
		System.out.println("do-while문 끝: n = " + n);

	}

}
