package edu.java.conditional05;

public class ConditionalMain05 {

	public static void main(String[] args) {
		
		int score = 85;
		
		// 시험 점수가 90점 이상이면 A
		// 시험 점수가 80점 이상이면 B
		// 시험 점수가 70점 이상이면 C
		// 시험 점수가 60점 이상이면 D
		// 시험 점수가 60점 미만이면 F
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
