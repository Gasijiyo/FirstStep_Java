package edu.java.array03;

public class ArrayMain03 {

	public static void main(String[] args) {
		// int 10개를 저장할 수 있는 배열 array1을 선언
				int[] array1 = new int[10];
				// array1에 5의 배수들을 저장(5, 10, 15, ..., 50)
				for (int i = 0; i < array1.length; i++) {
					array1[i] = 5 * (i + 1);
				}
				// array1의 원소들을 출력
				for (int x : array1) {
					System.out.print(x + " ");
				}
				System.out.println();

				// boolean 5개를 저장할 수 있는 배열 array2를 선언
				boolean[] array2 = new boolean[5];
				// array2의 기본값들을 출력(boolean의 기본값은 false)
				for (boolean x : array2) {
					System.out.print(x + " ");
				}
				System.out.println();
				// array2의 값들을 {true, false, true, false, true}로 변경
				for (int i = 0; i < array2.length; i++) {
//					if (i % 2 == 0) {  // 인덱스가 짝수이면
//						array2[i] = true;
//					} else {  // 인덱스가 홀수이면
//						array2[i] = false;
//					}
					array2[i] = (i % 2 == 0) ? true : false;
				}
				// array2의 원소들을 출력
				for (boolean x : array2) {
					System.out.print(x + " ");
				}
				System.out.println();
				
				// char(문자) 26개를 저장할 수 있는 배열 array3을 선언
				char[] array3 = new char[26];
				// array3에 영문 소문자들을 저장(a, b, c, ..., z)
				for (int i = 0; i < array3.length; i++) {
					array3[i] = (char)('a' + i);
				}
				// array3의 원소들을 출력
				for (char x : array3) {
					System.out.print(x + " ");
				}
				System.out.println();
				

	}

}
