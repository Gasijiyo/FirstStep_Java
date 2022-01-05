package edu.java.variable09;

import java.util.Scanner;

public class VariableMain09 {

	public static void main(String[] args) {
		// 간단한 성적 처리 프로그램
		// Java, SQL, JSP 과목의 점수(int)를 Scanner를 사용해서 입력받음.
		// 세 과목의 점수를 출력
		// 세 과목의 총점을 출력
		// 세 과목의 평균을 출력 - 소수점이 계산되도록!

		Scanner sc = new Scanner(System.in);  // 입력 도구 생성
		
		System.out.println("Java 과목 점수를 입력>>>");
		int java = sc.nextInt();  // Java 점수를 입력받고 변수에 저장
		System.out.println("Java 점수: " + java);
		
		System.out.println("SQL 과목 점수를 입력>>>");
		int sql = sc.nextInt();
		System.out.println("SQL 점수: " + sql);
		
		System.out.println("JSP 과목 점수를 입력>>>");
		int jsp = sc.nextInt();
		System.out.println("JSP 점수: " + jsp);
		
		int total = java + sql + jsp;  // 세 과목의 총점을 계산하고 변수에 저장.
		System.out.println("총점: " + total);
		
		double mean = (double)total / 3;  // 평균을 계산하고 변수에 저장.
		System.out.println("평균: " + mean);
		
		sc.close();  // 입력 도구 닫음.
	}

}
