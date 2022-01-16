package edu.java.inheritance04;

import edu.java.inheritance03.Car;
import edu.java.inheritance03.ElectricCar;

public class InheritanceMain04 {

	public static void main(String[] args) {
		// 다형성(polymorphism)의 장점 - 코드의 재사용성이 높아짐.
		String[] names = { "오쌤", "홍길동", "허균" };
		printArray(names);

		// Integer: 기본 타입인 int 값 하나를 멤버 변수로 갖는 클래스 타입
		Integer[] numbers = { 1, 3, 5, 7, 9 };
		printArray(numbers);

		Car[] cars = { new Car(0), new ElectricCar(0, 0) };
		printArray(cars);

	}

	// 메서드의 파라미터 타입을 super 타입으로 선언하면,
	// 메서드를 사용할 때 전달하는 argument는 super 타입 객체도 가능하고, 상속받는 sub 객체도 가능함.
	private static void printArray(Object[] array) {
		System.out.print("[ ");
		for (Object s : array) {
			System.out.print(s + ", ");
		}
		System.out.println("]");
	}

	/*
	 * // 메서드 overloading: 파라미터(타입, 개수)가 다르면 같은 이름으로 메서드를 여러개 정의할 수 있다. private
	 * static void printArray(Integer[] array) { System.out.print("[ "); for
	 * (Integer s : array) { System.out.print(s + ", "); } System.out.println("]");
	 * } private static void printArray(String[] array) { System.out.print("[ ");
	 * for (String s : array) { System.out.print(s + ", "); }
	 * System.out.println("]"); }
	 */

} // end class