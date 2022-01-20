package edu.java.exception02;

/*
 * try-catch 구문을 사용한 예외 처리:
 * 
 *  try {
 *  	정상적인 상황에서 실행할 코드들;
 *  } catch (Exception타입 변수이름) {
 *  	비정상적인 상황(예외 상황) 에서 실행할 코드들;
 *  } finally {
 *  	try 블록 또는 catch 블록이 끝난 후 실행할 코드들;
 *  	//예외가 발생하든 발생하지 않든 무조건 실행 코드
 *  } 
 *  
 * (1) 예외가 발생하지 않는 경우엔 try 블록안의 코드들을 모두 실행 후 finally 블록의 코드를 실행함. 
 * (2) try 블록안을 실행 중에 예외가 발행하면, try 블록은 예외가 발생한 위치에서 실행을 멈추고 
 * catch 블록으로 이동함. catch 에서 선언된 예외 타입들만 처리할 수 있음.
 * catch 블록을 모두 실행하면 finally 블록을 실행함.
 * (3) finally는 선택 (있어도되고 없어도됨)
 * (4) catch 에서 선언된 예외들 이외의 다른 예외가 발생하면 예외처리를 못하기 때문에 비정상종료가 됨
 * (5) catch 블록은 여러개를 만들 수 있음
 */

public class ExceptionMain02 {

	public static void main(String[] args) {
		System.out.println("try 구문을 사용한 예외 처리");
		
		try {
			String s = "";
			System.out.println("문자열길이 = " + s.length());
			
			int x = 123;
			int y = 0;
			System.out.println("몫 :" + (x / y));
			
		} catch (NullPointerException e) {
			System.out.println("문자열이 null 입니다");
			System.out.println(e.getMessage());
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");

	}

}
