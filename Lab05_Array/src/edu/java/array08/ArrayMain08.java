package edu.java.array08;

import java.util.Random;

public class ArrayMain08 {

	public static void main(String[] args) {
		/* 과제
		 *  성적처리프로그램
		 */
		
		//난수 이용해 점수 만듦
		
		//0 ~ 10사이의 난수 5개를 저장할 수 있는 배열 선언
		//배열에 난수 5개를 저장
		//배열에 저장된 모든 점수를 한 줄에 출력
		//점수 총점 계산 후 출력
		//점수 평균 계산 후 출력
		//표준편차를 계산 후 출력
		//5개 중 최대값 출력
		//5개 중 최소값 출력
		
		//0 ~ 10사이의 난수 5개를 저장할 수 있는 배열 선언
		//배열에 난수 5개를 저장
		Random rand = new Random(); 
		int[] score = new int[5];			
		int sum = 0;
		
		//배열에 저장된 모든 점수를 한 줄에 출력
		System.out.print("모든 점수 : ");
		for (int i = 0; i < score.length ; i++) {
			score[i] = rand.nextInt(11);	
			sum += score[i];
			System.out.print(score[i] + " ");							
			
		}//end for	
		
		System.out.println("\n");
		
		//점수 총점 계산 후 출력
		int total = sum;
		System.out.println("점수 총계 : " + sum);
		
		//점수 평균 계산 후 출력
		double avg = (double)total / score.length ;
		System.out.println("점수 평균 : " + avg);
		
		//표준편차를 계산 후 출력
		double var = 0;
		double std = 0;
		sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += Math.pow(score[i] - avg, 2);
		}
		var = (double)sum / score.length;
		std = Math.sqrt(var);
		System.out.print("표준 편차 = " + std);
		
		System.out.println("\n");
		
		//5개 중 최대값 출력
		int max = score[0];
		for (int i = 1; i < score.length ; i++) {
			if (max < score[i]) {
				max = score[i];				
			}			
		}
		System.out.println("최대값 : " + max);
				
		//5개 중 최소값 출력	
		int min = score[0];
		for (int i = 1; i < score.length ; i++) {
			if (min > score[i]) {
				min = score[i];				
			}			
		}
		System.out.print("최소값 : " + min);
		
		
		
		

	} //end main

}
