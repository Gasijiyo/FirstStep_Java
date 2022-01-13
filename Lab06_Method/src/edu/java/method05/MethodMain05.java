package edu.java.method05;

public class MethodMain05 {

	public static void main(String[] args) {
		// 메서드 작성 연습
				int[] scores = {10, 20, 100, 90, 81};  // 정수 5개를 저장하는 배열
				int total = sum(scores);  // 정수 배열을 sum 메서드의 argument로 전달, 호출
				System.out.println("총점: " + total);
				
				// 평균 계산하는 메서드 호출, 그 결과 출력
				System.out.println("평균: " + mean(scores));
				
				// 표준편차 계산하는 메서드 호출, 그 결과 출력
				System.out.println("표준편차: " + standardDeviation(scores));
				
				// 최댓값 찾는 메서드 호출, 그 결과 출력
				System.out.println("최댓값: " + findMax(scores));
				// 최솟값 찾는 메서드 호출, 그 결과 출력
				System.out.println("최솟값:" + findMin(scores));
				
			}  // end main()
			
			/**
			 * 정수들의 배열을 전달 받아서, 배열의 모든 원소들의 합을 반환하는 메서드.
			 * 
			 * @param numbers 정수(int)들의 배열.
			 * @return 배열의 모든 원소들의 합.
			 */
			public static int sum(int[] numbers) {
				int total = 0;
				for (int x : numbers) {
					total += x;
				}
				return total;
			}  // end sum()
			
			// method overloading: 메서드의 파라미터 타입이 다르면 같은 이름으로 메서드를 정의할 수 있다.
			public static double sum(double[] numbers) {
				double total = 0.0;
				for (double x : numbers) {
					total += x;
				}
				return total;
			}
			
			/**
			 * 정수들의 배열을 전달받아서, 그 배열의 모든 원소들의 평균을 반환하는 메서드.
			 * 
			 * @param numbers 정수(int)들의 배열
			 * @return 배열의 원소들의 평균(double)
			 */
			public static double mean(int[] numbers) {
				int total = sum(numbers);  // 같은 클래스의 메서드를 사용해서 합계 계산
				double avg = (double)total / numbers.length;  // 평균 계산
				return avg;
			}  // end mean()
			
			public static double mean(double[] numbers) {
				double total = sum(numbers);  // 같은 클래스의 (overloading된) 메서드를 사용해서 합계 계산
				double avg = total / numbers.length;  // 평균 계산
				return avg;
			}
			
			/**
			 * 정수들의 배열을 전달받아서, 그 배열의 원소들의 표준편차를 반환하는 메서드.
			 * 
			 * @param numbers 정수(int)들의 배열
			 * @return numbers의 원소들의 표준편차(double)
			 */
			public static double standardDeviation(int[] numbers) {
				double mu = mean(numbers);  // 같은 클래스의 메서드를 사용해서 정수 배열의 평균을 계산
				
				// numbers 배열의 각 원소에서 평균을 빼고 제곱한 값((x_i - mu)^2)들을 저장할 배열을 선언.
				double[] squares = new double[numbers.length];
				for (int i = 0; i < numbers.length; i++) {
					squares[i] = (numbers[i] - mu) * (numbers[i] - mu);
					// Math.pow(numbers[i] - mu, 2)
				}
				
				double variance = mean(squares);  // 분산 = 제곱한 값들의 평균.
				double sd = Math.sqrt(variance);  // 표준편차 = 분산의 제곱근
				
				return sd;
			}
			
			/**
			 * 정수들의 배열을 전달받아서, 그 배열의 원소들 중 최댓값을 반환하는 메서드.
			 * 
			 * @param numbers 정수(int)들의 배열
			 * @return numbers의 원소들 중 최댓값(int)
			 */
			public static int findMax(int[] numbers) {
				int max = numbers[0];  // 배열의 첫번째 원소를 최댓값이라고 가정.
				for (int x : numbers) {  // 배열의 첫번째 원소부터 마지막 원소까지 하나씩 반복하면서
					if (max < x) {  // max 저장된 값보다 더 큰 값을 배열에서 찾았으면
						max = x;  // max를 배열에서 찾은 값(더 큰 값)으로 변경.
					}
				}
				
				return max;  // 찾은 최댓값을 반환
			}
			
			/**
			 * 정수들의 배열에서 최솟값을 찾아서 반환하는 메서드.
			 * 
			 * @param numbers 정수들의 배열(int[])
			 * @return 배열의 최솟값 - int
			 */
			public static int findMin(int[] numbers) {
				int min = numbers[0];  // 최솟값을 배열의 첫번째 값이라고 가정.
				for (int x : numbers) {  // 배열의 모든 원소에 대해서 반복.
					if (min > x) {  // min의 값보다 더 작은 값을 배열에서 찾았으면
						min = x;  // min을 찾은 값으로 변경
					}
				}
				
				return min;
			}
			
		}  // end class