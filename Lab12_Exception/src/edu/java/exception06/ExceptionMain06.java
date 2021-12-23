package edu.java.exception06;

public class ExceptionMain06 {

	public static void main(String[] args) {
		// finally 구문:
		// try 블록이 정상적으로 모두 실행이 되거나 또는 catch 블록에서 예외 처리가 끝난 경우 모두
		// 실행해야 할 코드가 있다면 finally 블록을 사용함.
		// (주의) try 또는 catch 블록 내부에 return 문이 있는 경우, finally 블록이 실행된 후 return 문이 호출됨!
		
		try {
			String s = null;
			System.out.println("문자열 길이 = " + s.length());
			System.out.println("--- try 끝 ---");

		} catch (NullPointerException e) {
			System.out.println("문자열이 null입니다...");
			System.out.println("--- catch 끝 ---");
			return; // main 메서드 종료 - 프로그램 종료
		} finally {
			System.out.println("언제 실행될까요?");
		}

		System.out.println("프로그램 종료...");
	}

}