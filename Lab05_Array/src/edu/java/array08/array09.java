package edu.java.array08;

import java.util.Random;

public class array09 {

	public static void main(String[] args) {
		/* 과제 성적처리프로그램		 
		
		난수 이용해 점수 만듦
		
		0 ~ 10사이의 난수 5개를 저장할 수 있는 배열 선언
		배열에 난수 5개를 저장
		배열에 저장된 모든 점수를 한 줄에 출력
		점수 총점 계산 후 출력
		점수 평균 계산 후 출력
		표준편차를 계산 후 출력
	    5개 중 최대값 출력
		5개 중 최소값 출력
		*/
		
		Random rand = new Random();
		int[] score = new int[5];
		int sum = 0;
		System.out.print("점수 출력 : ");
		
		for (int a = 0; a < score.length ; a++) {
			score[a] = rand.nextInt(11);
			System.out.print(score[a] + " ");
			sum += score[a];
		}
		
		//int sun = 0;
		//for (int s : scores) {
		//	sum += s;
		//}
		
		System.out.println("\n");
		//총점 과 평균
		int total = sum;
		System.out.println("점수 총점 : " + total);
		
		double avg = (double)total / score.length ;		
		System.out.println("점수 평균 : " + avg);
		//표준 편차	standard deviation = sqrt
		//분산 deviation = (x_0 - avg)^2 + (x_1 - avg)^2 + ...
		sum = 0;
		double var = 0;
		double std = 0;
		for (int b = 0; b < score.length ; b++) {
			sum += Math.pow(score[b]-avg, 2);
		}
		var = (double)sum / score.length ;
		std = Math.sqrt(var);
		System.out.println("표준 편차 : " + std);
		
		//double sumOfSquares = 0.0;
		//for (int s : scores) {
		//	sumOfSquares += (s - avg)*(s - avg);
		//}
		//double dev = sumOfSquares / scores.length;
		//double std = Math.sqrt(dev);
		
		System.out.println();
		
		int max = score[0];
		for (int c = 0; c < score.length ; c++) {
			if (max < score[c]) {
				max = score[c];
			}
			
		}		
		
		System.out.println("최고 점수 : " + max);		
		
		int min = score[0];
		for (int d = 0; d < score.length ; d++) {
			if (min > score[d]) {
				min = score[d];
			}
		}
		//for (int s : scores){
				//	if (min > s) {
				//		min = s;
				//	}
				//}
		
		System.out.println("최저 점수 : " + min);
		System.out.println();

	}

}
