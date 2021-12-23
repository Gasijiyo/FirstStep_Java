package edu.java.exception08;

public class ExceptionMain08 {

	public static void main(String[] args) /* throws Exception */ {
		// 예외(Exception)을 던지는(throw)는 메서드 사용
		
		// Calculator 클래스 타입의 인스턴스를 생성
		Calculator calc = new Calculator();
		System.out.println(calc.divide(123, 10)); 
		// 메서드를 호출하는 곳에서 0으로 나누지 않도록 하거나, 또는 try-catch를 사용해서 예외 처리를 하면 됨.

		System.out.println();
		System.out.println(calc.divide2(123, 0));
		// 메서드를 호출한 곳에서는 0으로 나누는 예외를 신경쓰지 않아도 됨.
		
		System.out.println();
		try {
			System.out.println(calc.divide3(123, 0));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// 예외를 던진다고 선언한 메서드를 사용할 때는 반드시
		// (1) try-catch 블록으로 감싸주거나, 또는
		// (2) 사용하는 메서드에서 예외를 던진다고 선언.
	}

}

class Calculator {
	// 파라미터에서 발생할 수 있는 오류를 처리하지 않는 메서드
	public int divide(int x, int y) {
		return x / y;
	}
	
	// if-else를 사용해서 파라미터에서 발생할 수 있는 오류를 처리하는 메서드
	public int divide2(int x, int y) {
		if (y != 0) {
			return x / y;
		} else {
			System.out.println("0으로 나눌 수 없음!");
			return 0;
		}
	}
	
	// 예외를 던지는 메서드
	// [수식어] 리턴타입 메서드이름([파라미터 선언]) [throws 예외클래스이름] { ... }
	// 메서드 divide3은 Exception 클래스의 객체(인스턴스)를 던질 수 있다.
	public int divide3(int x, int y) throws Exception {
		if (y == 0) {
			Exception e = new Exception("0으로 나누는 예외"); // Exception 클래스의 객체 생성
			throw e; // throw: (메서드를 호출한 곳으로) 예외 객체를 던짐.
		}
		
		return x / y; // return: (메서드를 호출한 곳으로) 값을 반환 & 메서드를 종료.
	}
	
}
