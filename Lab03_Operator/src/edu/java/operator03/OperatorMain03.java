package edu.java.operator03;

public class OperatorMain03 {

	public static void main(String[] args) {
		// 비교(관계)연산자 : ==, !=, >,>=, <, <=
		//크기(대소) 비교해 결과를 true or false로 반환하는 연산자
		
		/*int number = 10;
		System.out.println(number == 10);
		System.out.println(number != 10);
		System.out.println(number >= 10);
		System.out.println(number < 10);
		*/
		
		//논리 연산자 : &&, ||, !
		//논리 연산 and, or, not의 결과(true or false)를 반환하는 연산자
		//a && b : a와 b가 모두 true면 true, 그렇지 않으면 false
		// a || b : a또는 b가 true면 true, 그렇지않으면 false
		// !a : a가 true 면 false, a가 false 면 true
		
		int score = 50;
		int mean = 55;
		System.out.println((score >=40) && (mean >= 60));
		System.out.println((score >=40) || (mean >= 60));
		System.out.println(!(score >= 40));
		
		// Lazy Evaluation(Short-circuit Evaluation):
		//a && b 계산 시, a의 결과가 false 면 b 계산 불필요
		//a || b 계산 시, a의 결과가 true 면 b 계산 불필요
		
		//삼항 연산자 (조건 선택 연산자)
		//(조건식) ?  (값1):(값2) ->
		// 조건식을 만족하는 (true)경우 (값1)을 선택
		// 조건식을 만족하지 못하는 (false)경우 (값2)를 선택
		
		int total = 60;
		String result = (total >= 50) ? "pass" : "fail";
		System.out.println(result);
		//total이 50점 이상이면 pass를 result에 저장, 
		//50점 미만이면 fail을 result에 저장
		
	}

}
