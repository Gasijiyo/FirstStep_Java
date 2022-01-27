package edu.java.inner01;

public class Outer {
	// field, member variable
	private int x;
	private int y;
	
	// constructor
	public Outer(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// method
	public void printOuter() {
		System.out.println("x = " + this.x);
		System.out.println("y = " + this.y);
	}
	
	// inner class
	public class Inner {
		private int z;
		private int y; // 내부 클래스와 외부 클래스에서 같은 이름의 변수가 있는 경우
		
		public Inner(int z) {
			this.z = z;
		}
		
		public void printInner() {
			// 내부 클래스는 외부 클래스의 모든 멤버들을 접근할 수 있음.
			System.out.println("--- Inner Class ---");
			printOuter(); // 외부 클래스의 메서드 호출
			System.out.println("x = " + x); // 외부 클래스의 멤버 변수 접근(Outer.this.x)
			System.out.println("z = " + z); // 내부 클래스의 멤버 변수 접근(this.z)
			System.out.println("Inner y = " + y); // y와 this.y는 같은 의미.
			System.out.println("Outer y = " + Outer.this.y); // 같은 이름의 외부 클래스 멤버 사용 방법
		}
		
	} // end class Inner

} // end class Outer