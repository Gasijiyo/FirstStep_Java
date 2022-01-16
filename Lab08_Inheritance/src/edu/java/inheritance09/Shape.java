package edu.java.inheritance09;

public abstract class Shape {
	// field
	protected String type; // 원, 사각형 등등

	// constructor
	public Shape(String type) {
		this.type = type;
	}

	// abstract method
	public abstract double area(); // 넓이

	public abstract double perimeter(); // 둘레길이

	// final method
	public final void draw() {
		String result = type + "(넓이:" + area() + ", 둘레:" + perimeter() + ")";
		System.out.println(result);
	}
}