package edu.java.exception05;

import java.util.Scanner;

public class ExceptionMain05 {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// try-catch 활용
		double x = inputDouble(); // double 타입의 값을 입력받음.
		double y = inputDouble2();
		
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));

	}

	private static double inputDouble() {
		double number = 0.0;
		
		while (true) {
			try {
				System.out.println("숫자 입력>>");
				String s = scanner.nextLine();
				number = Double.parseDouble(s);
				break; // 무한 루프 종료
			} catch (NumberFormatException e) {
				System.out.println("입력한 내용이 숫자(실수)가 아닙니다...");
			}
		}
		
		return number;
	}
	
	private static double inputDouble2() {
		while (true) {
			try {
				System.out.println("숫자 입력>>");
				String s = scanner.nextLine();
				double number = Double.parseDouble(s);
				
				return number; // return - 메서드를 호출한 곳에 값을 반환, 메서드를 종료.
			} catch (NullPointerException e) {
				System.out.println("숫자가 아닙니다...");
			}
		}
	}
	
}