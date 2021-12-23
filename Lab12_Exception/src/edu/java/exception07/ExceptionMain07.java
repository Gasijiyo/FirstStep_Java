package edu.java.exception07;

public class ExceptionMain07 {

	public static void main(String[] args) {
		// multi-catch 구문 (Java 7 버전부터 생김)
		// 하나의 catch 구문에서 여러개의 Exception 클래스들을 선언하고 예외 처리를 하는 방법.
		// (주의) multi-catch를 사용할 때는 상속관계에 있는 예외 클래스들을 사용할 수는 없음!
		// catch (NullPointerException | Exception e) 컴파일 에러!
		
		try {
			int x = 123;
			int y = 0;
			System.out.println("몫 = " + (x / y));
			
			String s = null;
			System.out.println("문자열 길이 = " + s.length());
			
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("예외 발생");
		} finally {
			System.out.println("--- finally ---");
		}

	}

}
