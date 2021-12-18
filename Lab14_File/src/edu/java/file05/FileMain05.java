package edu.java.file05;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/*
 * try-with-resource 구문(Java 7 버전부터 제공)
 * 
 * FIS, FOS과 같은 클래스의 생성자를 호출한 이후에는 반드시 생성된 객체에서 close() 메서드를 호출해야 함.
 * 기존 try-catch 구문에서는 생성자 호출 문장은 try 블록에서 작성, close() 메서드 호출 문장은 finally 블록에서 작성.
 * try-with-resource 구문을 사용하면, 생성자 호출 문장을 try () 안에서 작성하고 close() 메서드 호출 문장은 작성하지 않음.
 * -> Java Runtime이 생성된 리소스들의 close() 메서드를 자동으로 호출해 줌.
 * (주의) try-with-resource 구문은 close() 메서드를 가지고 있는 클래스 타입들만 사용할 수 있음.
 * 
 * try (리소스 생성 문장;) {
 *     정상적인 경우에 실행할 문장들;
 * } catch (예외클래스이름 변수) {
 *     예외가 발생했을 때 실행할 문장들;
 * }
 * 
 */

public class FileMain05 {

	public static void main(String[] args) {
		// try-with-resource 구문
		
		try (
				// 리소스 생성 문장
				FileInputStream in = new FileInputStream("data/test.txt");
				BufferedInputStream bin = new BufferedInputStream(in);
		) {
			int b = bin.read();
			System.out.println((char)b);
			b = bin.read();
			System.out.println((char)b);
			// BIS 객체 bin의 close가 자동 호출 -> FIS 객체 in도 함께 close됨
		} catch (Exception e) {
			e.printStackTrace();
			// BIS 객체 bin의 close가 자동 호출 -> FIS 객체 in도 함께 close됨
		}

	}

}
