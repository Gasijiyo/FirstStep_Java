package edu.java.conditional03;

import java.util.Scanner;

public class ConditionalMain03 {

	public static void main(String[] args) {
		// 시험 합격/불합격 여부 출력
		// 시험 과목(Java, SQL, JSP)의 점수를 정수로 입력받고 저장.
		// 모든 과목의 점수가 40점 이상이고, 평균이 60점 이상이면 합격
		// 그렇지 않으면 불합격을 출력
		
		// 입력 도구 생성
		Scanner sc = new Scanner(System.in);
		
		// 시험 과목 점수 입력
		System.out.println("Java 점수 입력>>>");
		int java = sc.nextInt();
		
		System.out.println("SQL 점수 입력>>>");
		int sql = sc.nextInt();
		
		System.out.println("JSP 점수 입력>>>");
		int jsp = sc.nextInt();
		
		// 입력 도구 닫기
		sc.close();
		
		// 세 과목의 평균 계산
		double mean = (java + sql + jsp) / 3.0;
		
		// 합격/불합격 여부 판단
		if ((java >= 40) && (sql >= 40) && (jsp >= 40) && (mean >= 60)) {
			// 모든 과목의 점수가 40점 이상이고, 평균이 60점 이상이면 합격
			System.out.println("합격");
		} else {
			// 그렇지 않으면 불합격
			System.out.println("불합격");
		}

	}

}
