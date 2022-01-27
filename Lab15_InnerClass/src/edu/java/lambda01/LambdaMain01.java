package edu.java.lambda01;

public class LambdaMain01 {

	public static void main(String[] args) {
		//목적: Calculable 인터페이스를 구현한 클래스의 객체를 사용	(메소드 calculate를 호출해서 값 계산)
		//1.Calculable을 구현하는 클래스를 정의.
		Calculable adder = new Adder();	//다형성
		// adder 객체의 기능을 사용
		double result = adder.calculate(1.0, 2.0);	//객체가 가지고 있는 메소드 호출
		System.out.println(result);
		
		//2. Calculable을 구현하는 지역 클래스(local inner class) 사용
		class Subtracter implements Calculable{

			@Override
			public double calculate(double x, double y) {
				return x - y;
			}
			
		}//end local class Subtracter
		
		Calculable subtracter = new Subtracter();
		result = subtracter.calculate(1.0, 2.0);
		System.out.println(result);
		
		
		//3. 익명 (내부) 클래스 (anonymous inner class) - 객체 생성과 클래스 정의(선언)을 동시에
		Calculable multiplier = new Calculable() {
			@Override
			public double calculate(double x, double y) {
				return x * y;
			}
			
		};
		result = multiplier.calculate(2.0, 3.0);
		System.out.println(result);
		
		//4.람다 표현식 (lambda expression)
		//객체 생성과 클래스 정의를 동시에 하는 익명 클래스 객체 생성을 간단히 표현하는 문장.
		//Functional interface 인 경우에만 람다 표현식을 사용할 수 있음
		Calculable divider = (x, y) -> x / y;
		result = divider.calculate(4.0, 2.0);
		System.out.println(result);
		
		
	}//end main
}
