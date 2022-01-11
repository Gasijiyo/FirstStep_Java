package edu.java.switch03;

public class SwitchMain03 {

	public static void main(String[] args) {
		// switch (식) {case c1: ... case c2: ....} 구문에서 case에 사용되는 자료 타입(data type)
		// (1) 정수 타입: byte, short, int, long, char
		// (2) 문자열 타입: String
		// (3) enum 타입
		// (주의) case에는 실수 타입(float, double)은 사용할 수 없음!
		
		/* 아래 코드는 에러가 발생하는 경우.
		double x = 1.2345;
		switch (x) {
		case 1.1:
			break;
		case 1.2:
			break;
		}
		*/

		// switch-case 구문에서 char 타입이 사용되는 경우:
		char ch = 'c';
		switch (ch) {
		case 'a':
		case 'A':
			System.out.println("A");
			break;
		
		case 'b':
		case 'B':
			System.out.println("B");
			break;
			
		default:
			System.out.println("기타");
		}  // end switch
		
		// switch-case 구문에서 문자열(String) 타입이 사용되는 예:
		String position = "사장";
		switch (position) {
		case "부장":
			System.out.println("50% 보너스");
			break;
			
		case "과장":
			System.out.println("40% 보너스");
			break;
			
		default:
			System.out.println("30% 보너스");
		}  // end switch
		
	}  // end main

}
