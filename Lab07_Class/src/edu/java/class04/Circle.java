package edu.java.class04;

//원(동그라미)를 표현하는 클래스
//속성(상태, 데이터): 중심의 좌표(x, y), 반지름
//생성자
//기능: 넓이(3.14 * r^2), 둘레의 길이(2 * Math.PI * r), 원의 중심을 이동, info
public class Circle {
	// field
	Point center;  // 클래스 이름은 '타입'이기 때문에 변수를 선언할 때 사용 가능.
	double radius;
	
	// 생성자
	// default 생성자: 모든 필드를 그 필드의 기본값으로 초기화 한다.
	public Circle() {
		center = new Point();  // center가 null이 되지 않도록 하기 위해서.
	}
	
	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(double x, double y, double r) {
		this.center = new Point(x, y);
		this.radius = r;
	}
	
	// 메서드
	public void info() {
		System.out.println("Circle(중심 x=" + this.center.x + ", 중심 y=" + this.center.y + ", 반지름=" + this.radius +")");
	}
	
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	public Circle move(double dx, double dy) {
//		this.center.x += dx;
//		this.center.y += dy;
		this.center.move(dx, dy);
		return this;
	}
	
}  // end class Circle