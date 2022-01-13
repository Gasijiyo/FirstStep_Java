package edu.java.method04;

public class MethodMain04 {

	public static void main(String[] args) {
		// method overloading 메소드 오버로딩
		// 메소드의 파라미터 개수나 파라미터 타입이 다르면
		// 같은이름으로 메소드를 선언할 수 있음
		// (주의) 메소드의 리턴타입만 다른경우에는 같은 이름으로 메소드를 선언할 수 없음
		System.out.println(1);	//print int
		System.out.println('a'); //print char
		System.out.println("hello"); //print string

		sayHello();
		sayHello("오쌤");
		sayHello(23);
		sayHello("박쌤", 29);
		sayHello(100, "손");
	}
	
	public static void sayHello() {
		System.out.println("안녕하세요~");
	}

	public static void sayHello(String name) {
		System.out.println("안녕하세요, 저는 " + name + "입니다.");
	}

	public static void sayHello(int age) {
		System.out.println("안녕하세요, 제 나이는" + age + "입니다.");
	}

	public static void sayHello(int age, String name) {
		System.out.println(age + name);
	}
	public static void sayHello(String name, int age) {
		System.out.println("안녕하세요..");
		System.out.println("전 " + name + "이고");
		System.out.println("나이는 " + age + "입니다");
	}
	
}
