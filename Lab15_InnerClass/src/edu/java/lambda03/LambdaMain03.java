package edu.java.lambda03;

import edu.java.lambda03.Calculator.Calculable;

public class LambdaMain03 {

	public static void main(String[] args) {
		// Calculator (계산기) 객체 생성
		Calculator calculator = new Calculator();
		
		
		//TODO: 1.변수 add가 두 숫자의 덧셈 결과가 저장되도록
		//익명 클래스를 사용
		
//		Calculable calc = new Calculable() {
//			
//			@Override
//			public double calculate(double x, double y) {
//				return x + y;
//			}
//			
//		};
		
//		double add = calculator.calculate(1.0, 2.0, calc );
		double add = calculator.calculate(1.0, 2.0, new Calculable() {
			
			@Override
			public double calculate(double x, double y) {
				return x + y;
			}
		});
				
		System.out.println("add = " + add); //-> 3.0
		
		//Todo: 2.변수 subtract가 두 숫자의 뺼셈 결과가 저장되도록
		//람다 표현식 사용
		
		double subtract = calculator.calculate(1.0, 2.0, (x,y) -> x - y);
		System.out.println("subtract = " + subtract);	//-> -1.0
	
	}

}
