package edu.java.wrapper01;

import java.util.Scanner;

//Wrapper class : 자바의 기본 데이터타입을 감싸는 클래스
//java.lang 패키지에 포함. import 문 없이 사용 가능
//기본데이터타입 (primitive type) : boolean, byte short, int, long, char, float, double
//wrapper class : Boolean, Byte, Short, Integer, Long, Character, Float, Double
//클래스 = 데이터 (+생성자) + 기능 = 데이터타입
//wrapper class 만든 목적:
// 1)기본타입 데이터를 다루는 메소드를 제공
// 2)다형성을 사용하기 위해서
// 3)generic 클래스에서 사용하기 위해서

public class WrapperMain01 {

	public static void main(String[] args) {
		Integer num1 = Integer.valueOf("1");
		//정수 1을 담고 있는 Integer객체를 생성 -> boxing
		System.out.println(num1); //Integer 클래스는 Object 클래스의 toString() 메소드를 override
		
		Integer num2 = Integer.valueOf("2");
		//문자열 "2"를 정수 2로 변환해서 정수를 담고 있는 Integer 객체를 생성 -> boxing
		System.out.println(num2);
		
		int x = num1.intValue();
		//Integer 객체(상자)가 담고 있는 기본 타입(int)의 값을 리턴 -> unboxing 
		System.out.println(x);
		
		int y = num2.intValue();
		System.out.println(y);
		
		//Java 5 버전부터 auto-boxing, auto-unboxing 기능을 제공함.
		Integer num3 = 100; //auto-boxing : 정수(int)를 자동으로(Integer) 객체로 변환해 저장
		int z = num3; //auto-unboxing : 클래스 (Integer) 객체에서 정수(int)값을 추출해서 기본 타입 변수에 저장.
		System.out.println(z);
		
		//Integer.parseInt(String) : 문자열 (String)을 기본 타입 int값으로 변환해서 리턴.
		int number = Integer.parseInt("123");
		System.out.println(number);
		
		//parseInt 메소드 응용
		//(1) 정수 입력 -> (2) 문자열 입력
		//Scanner 클래스의 nextInt()를 사용하면 정수 뒤에 입력된 엔터를 제거하기위해 nextLine()메소드를 호출해야만 
		Scanner sc = new Scanner (System.in);
		System.out.println("정수입력>>");
		String s = sc.nextLine();
		int value = Integer.parseInt(s);	//입력받은 문자열을 정수int로 변환
		System.out.println(value);
		
		System.out.println("문자열입력 >>");
		String s2 = sc.nextLine();
		System.out.println(s2);
		
		
	}

}
