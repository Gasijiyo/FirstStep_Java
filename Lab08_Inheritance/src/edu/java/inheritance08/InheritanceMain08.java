package edu.java.inheritance08;

//추상 메서드(abstract method):
//- 메서드의 signature(리턴 타입, 이름, 파라미터 선언)만 선언되어 있고 본체(body)가 없는 메서드.
//- 추상 메서드는 {}가 없기 때문에 반드시 세미콜론(;)으로 선언(문장)을 끝냄.
//- 추상 메서드를 선언할 때는 반드시 키워드 abstract 수식어를 사용해야 함.

//추상 클래스(abstract class):
//- abstract 키워드가 사용된 클래스.
//- 대부분의 경우, 추상 클래스는 한 개 이상의 추상 메서드를 가지고 있음.
//- 클래스에 한 개 이상의 추상 메서드가 선언되어 있으면, 반드시 클래스 선언할 때 abstract class라고 선언해야 함.
//- 추상 클래스는 생성자를 호출할 수 없음. 인스턴스를 생성할 수 없음.

//추상 메서드와 추상 클래스는 상속받는 클래스에서 구현을 목적으로 설계하는 것. 

public class InheritanceMain08 {

	public static void main(String[] args) {
		Animal dog = new Dog(); // 다형성
		dog.move();

		Animal fish = new Fish();
		fish.move();
	}

} // end class InheritanceMain08

//추상 클래스
abstract class Animal {
	// 필드(멤버 변수)
	protected String name;

	// 생성자
	public Animal(String name) {
		this.name = name;
	}

	// 추상 메서드 - body({})가 없는 메서드.
	public abstract void move();

} // end class Animal

class Dog extends Animal {

	public Dog() {
		// super 클래스가 기본 생성자를 갖고 있지 않기 때문에, 파라미터를 갖는 생성자를 명시적으로 호출해야 함.
		super("강아지");
	}

	// 추상 클래스인 부모로부터 상속받은 추상 메서드를 구현(implement)해야 abstract가 아닌 클래스가 될 수 있음.
	@Override
	public void move() {
		System.out.println(name + "는 깡총깡총...");
	}

} // end class Dog

class Fish extends Animal {

	public Fish() {
		super("금붕어");
	}

	@Override
	public void move() {
		System.out.println(name + "는 스윔스윔...");
	}

} // end class Fish