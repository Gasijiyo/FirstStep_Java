package edu.java.inheritance06;

public class InheritanceMain06 {

	public static void main(String[] args) {
		// Object 클래스의 메서드 override: toString(), hashCode(), equals(), ...

		Point pt1 = new Point();
		// 자바의 모든 클래스는 Object를 상속받기 때문에, Object 클래스의 public 메서드들을 사용할 수 있음.
		System.out.println(pt1.getClass());
		System.out.println(pt1.hashCode());
		System.out.println(pt1.toString());
		System.out.println(pt1);
		// System.out.println(Object) 메서드는 파라미터에 전달된 객체에서 toString() 메서드를 호출하고,
		// 그 객체의 toString() 메서드가 리턴해 주는 문자열을 콘솔창에 출력.
		// -> 클래스를 작성할 때 toString() 메서드를 override하면 출력문의 형식을 바꿀 수 있음.

		System.out.println();

		Point pt2 = new Point(0, 0);
		System.out.println(pt2);

		// ==, != 연산자는 인스턴스가 생성된 주소값(참조값)을 직접 비교.
		// 생성자를 호출할 때마다 새로운 인스턴스가 Heap에 생성됨.
		System.out.println("== 연산자: " + (pt1 == pt2)); // pt1과 pt2의 주소값은 서로 다름.

		// Object 클래스의 equals() 메서드는 원래 hashCode() 값으로 같은 지 다른 지 비교를 하고 있었지만,
		// Point 클래스에서 override한 equals() 메서드는 멤버 변수(필드) x, y 값으로 같은 지 다른 지를 비교함.
		System.out.println("equals 메서드: " + pt1.equals(pt2));

		// Object 클래스의 hashCode() 메서드는 인스턴스가 생성된 메모리 주소값을 리턴하고 있어지만,
		// Point 클래스에서 override한 hashCode() 메서드는 equals()가 true일 때 같은 정수 값이 되도록 구현.
		System.out.println(pt1.hashCode());
		System.out.println(pt2.hashCode());

		System.out.println();

		Point pt3 = new Point(1.0, 0.0);
		System.out.println(pt3);
		System.out.println(pt1.equals(pt3)); // -> false
		System.out.println(pt3.hashCode());

		System.out.println();
		// 문자열 비교
		String str1 = new String("자바 어렵나요?");
		String str2 = new String("자바 어렵나요?");
		System.out.println(str1 == str2); // 주소값 비교 -> false
		System.out.println(str1.equals(str2)); // 문자열 내용 비교 -> true
		// 기본 타입(boolean, int, double, ...)의 같음/다름 비교는 ==, != 연산자를 사용.
		// 참조 타입(String, Object, ...)의 같음/다름 비교는 equals() 메서드를 사용.

	} // end main()

} // end class InheritanceMain06

class Point {
	private double x; // x 좌표
	private double y; // y 좌표

	public Point() {
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override // 어노테이션(annotation) - 컴파일러에게 정보를 주기 위한 용도.
	public String toString() {
		String result = "Point(x=" + x + ", y=" + y + ")";
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof Point) { // 파라미터 obj가 Point 타입의 인스턴스이면
			Point other = (Point) obj;
			if (this.x == other.x && this.y == other.y) {
				result = true;
			}
		}

		return result;
	}

	@Override
	public int hashCode() {
		// equals() 메서드가 true를 리턴하는 인스턴스들은 hashCode()의 리턴값이 같아야 함!
		return Double.valueOf(x).hashCode() * 10 + Double.valueOf(y).hashCode();
	}

} // end class Point