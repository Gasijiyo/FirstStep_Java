package edu.java.inheritance09;

public class Rectangle extends Shape {
	// field
	private double width;
	private double height;

	// constructor
	public Rectangle(double width, double height) {
		super("직사각형");
		this.width = width;
		this.height = height;
	}

	
//	// TODO: 구현
//	public Rectangle() {
//		super("직사각형");
//	}
//	
	
	//상위클래스 shape가 가지고 있는 추상메소드를 override해서 구현
	public double area () {
		return width * height;
	}
	
	public double perimeter() {
		return (width + height) * 2;
	}
	
	

//	public double getWidth() {
//		return width;
//	}
//
//	public double getHeight() {
//		return height;
//	}
//	
//	
//	public void setWidth(double width) {
//		this.width = width;
//	}
//
//
//	public void setHeight(double height) {
//		this.height = height;
//	}
//	
	
	
}