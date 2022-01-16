package edu.java.inheritance09;

public class Circle extends Shape {
	// field
	private double radius;

	// constructor
	public Circle(double radius) {
		super("원");
		this.radius = radius;

	}

//	// 구현
//	public Circle() {
//		super("원");
//	}

	public double area() {
		return radius * radius * Math.PI;
	}

	public double perimeter() {
		return 2 * radius * Math.PI;
	}

//	public double getRadius() {
//		return radius;
//	}
//
//	public void setRadius(double radius) {
//		this.radius = radius;
//	}

}
