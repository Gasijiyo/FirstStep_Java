package edu.java.method02;

public class MethodMain02 {
	
	//method 만들 수 있는 위치

	public static void main(String[] args) {
		System.out.println("메소드 선언과 호출 연습");
		
		double result = add(1.1, 2.2);
		System.out.println(result);
		
		//sub, mul, div 메소드 호출, 테스트
		result = sub(1.4, 3.1);
		System.out.println(result);
		//double result1 = sub(1.4, 3.1);
		//System.out.println(result1);
		result = mul(2.1, 4.1);
		System.out.println(result);
		//double result2 = mul(2.1, 4.1);
		//System.out.println(result2);
		result = div(6.3, 2.1);
		System.out.println(result);
		//double result3 = div(6.3, 2.1);
		//System.out.println(result3);
	}//end main

	/** 문서 작업 : 해당 작업 설명
	 * double 타입의 숫자 2개를 argument로 전달받아서 두 수의 합을 반환(return)하는 메소드.
	 * 
	 * @param x double 
	 * @param y double
	 * @return x + y  
	 */
	
	//[수식어] 리턴타입 이름([파라미터 선언]) { ... } 
	public static double add(double x, double y) {
		return x + y;
	} //end add()
	//메소드 이름앞엔 반환타잎이 있어야한다. 
	//파라미터 구분은 쉼표로
	
	public static double sub(double x, double y) {
		return x - y;
	}
	
	/** 
	 * subtract
	 * double 타입 숫자 x와 y를 전달받아 x-y를 반환하는 메소드
	 *
	 * @param x double
	 * @param y double
	 * @return x - y
	 * 
	 */
	
	public static double mul(double x, double y) {
		return x * y;
	}
	
	/**
	 * multiply
	 * double 타입 숫자 x와 y 를 전달 받아 x*y를 반환하는 메소드
	 * @param x double
	 * @param y double
	 * @return x*y
	 * 
	 */
	public static double div(double x, double y) {
		return x / y;
	}
	
	/**
	 * divide
	 * double 타입 숫자 x와 y를 전달 받아 x /y 반환하는 메소드
	 * @param x double
	 * @param y double
	 * @return x/y
	 */
	
}//end class
