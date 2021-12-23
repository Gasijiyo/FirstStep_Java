package edu.java.exception03;

/*
 * 다형성(polymorphism): SuperType var = new SubType();
 * 
 * Object
 * |__ Throwable
 *     |__ Exception
 *         |__ RuntimeException
 *             |__ ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, ...
 * 
 * catch 구문에서 super 타입의 예외로 변수를 선언하면, 그 아래의 모든 sub 타입의 예외들을 모두 잡을 수 있음.
 * (주의) super 타입의 예외를 먼저 catch하면, 그 다음에 나오는 catch 구문에서는 sub 타입들을 catch할 수 없음.
 * 
 */

public class ExceptionMain03 {

	public static void main(String[] args) {
		System.out.println("Exception 클래스의 상속 관계와 try-catch");
		
		try {
			int[] array = new int[0]; // 원소를 한 개도 저장하지 않는 배열을 생성
			array[0] = 1;
		} catch (Exception e) {
			// Exception 클래스와 Exception 클래스를 상속받는 모든 예외들을 처리할 수 있음.
			System.out.println("배열에 원소를 저장할 수 없음.");
		}
		// super 타입의 예외를 먼저 catch했기 때문에, 아래쪽 catch 블록은 절대 실행될 수 없다.
//		catch (ArrayIndexOutOfBoundsException e) {
//			
//		}
		
		try {
			int x = 123;
			int y = 0;
			System.out.println(x / y);
			
			int[] array = new int[10];
			array[0] = 1;
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 범위 밖");
		} catch (ArithmeticException e) {
			System.out.println("산술 연산 오류");
		} catch (Exception e) {
			System.out.println("예외 발생");
		}
		
		System.out.println("프로그램 정상 종료");
	}

}
