package edu.java.method05;

public class MethodMain05a {

	public static void main(String[] args) {
		// 메소드 작성 연습
		int[] scores = {10,20,100,90,81}; //정수 5개를 저장하는 배열
		int total = sum(scores); //정수 배열을 sum메소드의 argument로 전달, 호출
		System.out.println("총점 : " + total);
		
		//과제 : 
		//평균 계산하는 메소드 호출, 결과 출력
		//표준편차 계산하는 메소드 호출, 결과출력
		//최대값, 최소값 메소드 호출, 결과출력
		//모든 메소드 파라미터 타입은 int[]
		
		int avg = avg(scores);
		System.out.println("평균 : " + avg);
				
		int std = std(scores);
		System.out.println("표준 편차 : " + std);
		
		System.out.println();
		
		int max = max(scores);
		System.out.println("최대값 : " + max);
		
		int min = min(scores);
		System.out.println("최소값 : " + min);
		
	}//end main
	
	//public static 리턴타입 메소드이름 (파라미터선언, ...){
	//}
	
	/** 정수들의 배열을 전달 받아서 배열의 모든 원소들의 합을 반환하는 메소드
	 * 
	 * @param numbers 정수(int)들의 배열
	 * @return 배열의 모든 원소들의 합
	 */
	
	public static int sum(int[] numbers) { //(scores 가 int배열) 
		//args 또는 params 많이 씀
		int total = 0;
		for (int x : numbers) {
			total += x;
		}
		return total;		
	} //end total
	
	//점수 평균
	public static int avg(int[] numbers) {
		int total = 0;
		int avg = 0;	
		
		for (int x : numbers) {
			total += x;			
			avg = total / numbers.length;
		}		
		return avg;
	} //end avg
	
	//점수 표준편차
	public static int std(int[] numbers) {
		int total = 0;
		int avg = 0;	
		
		for (int x : numbers) {
			total += x;			
			avg = total / numbers.length;	
		}
		
		int var = 0;
		int std = 0;
		int sum = 0;
		
		for(int y : numbers) {
			sum += Math.pow(y - avg, 2);
		}
		var = sum/numbers.length;
		std = (int) Math.sqrt(var);
		return std;
	} //end std
	
	//최대값
	public static int max(int[] numbers) {
		int max = numbers[0];
		for (int i : numbers) {
			if (max < i) {
				max = i;
			}
		}
		return max;
	} //end max
	
	//최소값
	public static int min(int[] numbers) {
		int min = numbers[0];
		for (int i : numbers) {
			if (min > i) {
				min = i;
			}
		}
		return min;
	} //end min
	
		
} //end class
