package edu.java.array04;

public class ArrayMain04 {

	public static void main(String[] args) {
		// 2차원 배열: 1차원 배열을 원소로 갖는 배열
				// 2차원 배열은 인덱스가 2개.
				// 타입[][] 변수이름 = new 타입[개수][개수];
				// 타입[][] 변수이름 = { {...}, {...} };
				
				int[][] array = { 
						{1, 2, 3, 4},
						{10, 20, 30, 40},
						{11, 21, 31, 41} 
				};
				System.out.println(array);  // [[I: 정수들의 2차원 배열
				System.out.println(array[0]);  // [I: 정수들의 1차원 배열
				System.out.println(array[0][0]);  // 1
				System.out.println(array[0][1]);  // 2
				
				// 2차원 배열의 원소의 개수:
				// 2차원 배열이 가지고 있는 1차원 배열의 개수
				System.out.println(array.length);
				
				// 2차원 배열의 첫번째 원소(1차원 배열)의 길이(원소 개수)
				System.out.println(array[0].length);
			
				// 2중 for 구문을 사용해서 array의 모든 원소들을 출력
				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[i].length; j++) {
						System.out.print(array[i][j] + " ");
					}
					System.out.println();
				}
				
				System.out.println("-----");
				
				// 향상된 for 구문을 사용해서 array의 모든 원소들을 출력
				for (int[] numbers : array) {
					for (int x : numbers) {
						System.out.print(x + " ");
					}
					System.out.println();
				}

	}

}
