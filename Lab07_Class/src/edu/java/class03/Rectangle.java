package edu.java.class03;

public class Rectangle {
	// field(멤버 변수) - 속성, 데이터
	double width; // 직사각형의 가로 길이
	double height; // 직사각형의 세로 길이

	// constructor(생성자)
	// 1) default constructor: width와 height를 모두 0.0으로 초기화
	public Rectangle() {
		// Do nothing.
	}

	// 2) 파라미터가 1개인 생성자: width와 height를 같은 값으로 초기화
	public Rectangle(double length) {
//			this.width = length;
//			this.height = length;
		this(length, length); // 파라미터 2개인 생성자 호출
	}

	// 3) 파라미터가 2개인 생성자: 첫번째 argument로 width를 초기화, 두번째 argument로 height를 초기화
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// method - 기능
	// 1) 직사각형의 넓이를 리턴하는 메서드
	public double area() {
		return width * height;
	}

	// 2) 직사각형의 둘레 길이를 리턴하는 메서드
	public double perimeter() {
		return (width + height) * 2;
	}

}