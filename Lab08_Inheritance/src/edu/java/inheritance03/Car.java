package edu.java.inheritance03;

public class Car {
	// 필드(멤버 변수)
	private int speed;

	// 생성자
	public Car(int speed) {
//		super();  // 모든 클래스의 부모인 Object 클래스의 기본 생성자 (자동) 호출.
		this.speed = speed;
	}

	// 메서드
	public void drive() {
		System.out.println("자동차 운행: 현재 스피드=" + speed);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}