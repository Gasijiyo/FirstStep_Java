package edu.java.inner03;

import edu.java.inner01.Outer;

//외부 클래스(outer/enclosing class)
public class EnclosingClass {
	//멤버 변수
	private int instanceVar;	//인스턴스 변수 - 생성자 호출 이후에 메모리(Heap)에 생성되는 변수
	public static int classVar = 100;	
	//static 변수(클래스 변수) - 프로그램 로딩 시점(main 메소드 시작 전)에 메모리(method)에 생성되는 변수

	//생성자
	public EnclosingClass(int instanceVar) {
		this.instanceVar=instanceVar;
	}

	//메소드
	//인스턴스 메소드 (static이 아닌 메소드, 인스턴스가 생성되어야만 사용할 수 있는 메소드)
	public void printMembers() {
		System.out.println("-- 인스턴스 메소드 호출 --");
		System.out.println("인스턴스 변수 = " + instanceVar);
		System.out.println("클래스 변수 = " + classVar);
	}
	
	//클래스 메소드 (static 메소드, 인스턴스 생성 전에도 사용 할 수 있는 메소드)
	public static void staticMethod() {
		System.out.println("--클래스 메소드 호출--");
//		System.out.println("인스턴스 변수 = " + instanceVar);
		// -> static 메소드 안에서는 static이 아닌 멤버는 사용할 수 없다!
		System.out.println("클래스 변수 = " + classVar );
	}
	
	//static (멤버) 내부 클래스 - 중첩클래스(Nested Class)
	// - 외부 클래스의 생성자 호출 전(인스턴스 생성 전)에도 생성자를 호출할 수 있는 클래스.
	// - 외부 클래스의 인스턴스와 무관한 클래스.
	// - 외부 클래스의 static 멤버들만 접근이 가능함! static이 아닌 멤버들은 사용할 수 없음.
	public static class NestedClass {
		// 멤버 변수(필드)
		private String value;
		
		// 생성자
		public NestedClass(String value) {
			this.value = value;
		}
		
		// 메서드
		public void nestedClassMethod() {
			System.out.println("value = " + this.value); // 자기 자신 클래스의 멤버들은 당연히 사용 가능.
//			System.out.println(instanceVar);
			// -> 중첩 클래스 안에서는 바깥 클래스의 non-static 멤버를 사용할 수 없다!
			System.out.println("outer static member: " + classVar);
			// -> 중첩 클래스 안에서는 바깥 클래스의 static 멤버를 사용할 수 있다.
			
		}
		
	} // end class NestedCls
	
} // end class EnclosingCls
