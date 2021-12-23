package edu.java.exception04;

import java.util.Scanner;

public class ExceptionMain04 {

	public static void main(String[] args) {
		// 예외 처리를 한 숫자 입력 받기
		Scanner sc = new Scanner(System.in);

		while (true) { // 무한 루프
			try {
				System.out.println("정수 입력>>");
				String s = sc.nextLine(); // 문자열로 입력받음.
				int n = Integer.parseInt(s); // 입력받은 문자열을 정수로 변환.
				System.out.println("n = " + n);
				break; // 무한 루프 종료
			} catch (NumberFormatException e) {
				System.out.println("정수가 아닙니다...");
			}
		} // end while

	} // end main()

} // end class
