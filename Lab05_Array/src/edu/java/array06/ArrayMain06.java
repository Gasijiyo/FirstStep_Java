package edu.java.array06;

public class ArrayMain06 {

	public static void main(String[] args) {
		// 2차원 배열 선언과 생성
				int[][] numbers = new int[2][3];  // 행과 열의 크기가 정해져 있는 경우
				// 2개의 1차원 정수 배열을 원소로 갖는 2차원 배열 생성, 선언.
				// 각각의 1차원 정수 배열은 모두 원소를 3개씩 갖음.
				for (int[] arr : numbers) {
					for (int x : arr) {
						System.out.print(x + " ");
					}
					System.out.println();
				}
				
				System.out.println("-----");
				int[][] numbers2 = new int[3][];  // 행의 크기는 정해져 있고, 열의 크기가 정해지지 않은 경우
				// 3개의 1차원 정수 배열을 원소로 갖는 2차원 배열을 생성, 선언.
				// 각각의 1차원 정수 배열들이 몇 개의 원소를 갖는 지는 미정.
				numbers2[0] = new int[3];
				numbers2[1] = new int[5];
				numbers2[2] = new int[4];
				for (int[] arr : numbers2) {
					for (int x : arr) {
						System.out.print(x + " ");
					}
					System.out.println();
				}
				
				// (주의) int[][] array = new int[][]; 문장 처럼 숫자 2개를 모두 생략할 수는 없다!

	}

}
