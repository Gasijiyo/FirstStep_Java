package edu.java.modifier07;

public class MySystem {
	// out: static 필드(멤버 변수)
		public static MyPrintStream out = new MyPrintStream();  // static 변수 초기화
	}


	class MyPrintStream {
		// 인스턴스 메서드
		public void print() {
			System.out.println("MyPrintStream print 메서드");
		}
	}