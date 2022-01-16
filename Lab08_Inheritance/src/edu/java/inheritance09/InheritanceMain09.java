package edu.java.inheritance09;

public class InheritanceMain09 {

	public static void main(String[] args) {
		// Shape 타입 2개를 저장할 수 있는 배열을 선언
		// Rectangle 객체를 생성하고 배열의 첫번째 원소로 저장
		// Circle 객체를 생성하고 배열의 두번째 원소로 저장
		// 향상된 for 문을 사용해서 배열의 원소들의 draw() 메서드를 호출하고 결과 확인
		
		Shape[] s = new Shape[2];
		
		Rectangle r = new Rectangle(2.0, 3.0);
		s[0] = r;
		//s[0] = new Rectangle (4,5);
		
		Circle c = new Circle(2.0);
		s[1] = c;
		
		for(Shape i : s) {
			i.draw();
		}
		
		
	}

}