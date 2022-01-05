package edu.java.operator03;

public class OperatorMain03 {

	public static void main(String[] args) {
		// 비교(관계) 연산자: ==, !=, >, >=, <, <=
		// 크기(대소) 비교의 결과를 true 또는 false로 반환하는 연산자
		int number = 10;
		System.out.println(number == 10);  // number가 10과 같은가요?
		System.out.println(number != 10);  // number가 10과 다른가요?
		System.out.println(number >= 10);  // number가 10보다 크거나 같은가요?(10 이상인가요?)

		// 논리 연산자: &&, ||, !
		// 논리 연산 and, or, not의 결과(true 또는 false)를 반환하는 연산자
		// a && b: a와 b가 모두 true이면 true, 그렇지 않으면 false
		// a || b: a 또는 b가 true이면 true, 그렇지 않으면 false
		// !a: a가 true이면 false, a가 false이면 true를 반환.
		int score = 50;
		int mean = 55;
		System.out.println((score >= 40) && (mean >= 60));
		System.out.println((score >= 40) || (mean >= 60));
		System.out.println(!(score >= 40));
		
		// Lazy Evaluation(Short-Circuit Evaluation):
		// a && b를 계산할 때, a의 결과가 false이면 b를 계산하지 않고 false가 반환됨.
		// a || b를 계산할 때, a의 결과가 true이면 b를 계산하지 않고 true가 반환됨.
		
		// 삼항 연산자(조건 선택 연산자)
		// (조건식) ? (값1) : (값2)
		// 조건식을 만족하는 경우(조건식이 true가 되는 경우)에는 (값1)을 선택
		// 조건식을 만족하지 못하는 경우(조건식이 false가 되는 경우)에는 (값2)를 선택
		int total = 49;
		String result = (total >= 50) ? "합격" : "불합격";
		System.out.println(result);
	}

}
