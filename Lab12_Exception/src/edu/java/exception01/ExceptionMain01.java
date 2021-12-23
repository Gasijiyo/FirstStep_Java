package edu.java.exception01;

//오류(error) vs 예외 (Exception)
//오류의 종료
// 1. compile error: 문법적인 오류, 소스코드를 class 파일로 변환 불가능 -> 반드시 수정해야함
// 2. out-of-memory(oom) error: 컴퓨터의 메모리가 부족해서 발생하는 에러 -> 수정 불가능
// 3. 논리적인 오류: 프로그램은 정상적으로 실행/종료가 되는데 원하는 결과가 나오지 않는 경우 -> 반드시 수정. 힘듦
// 4. 예외: 프로그램이 실행 중에 발생할 수 있는 비정상적인 상황 -> 반드시 수정
//	(1) if-else 구문
//	(2) try-catch 구문


public class ExceptionMain01 {

	public static void main(String[] args) {
		System.out.println();
		String s = "";
		if (s != null) {
			System.out.println("문자열길이: " + s.length());			
		} else {
			System.out.println("문자열 생성안됨");
		}
		
		int x = 123;
		int y = 10;
		System.out.println("몫" + x/y);

	}

}
