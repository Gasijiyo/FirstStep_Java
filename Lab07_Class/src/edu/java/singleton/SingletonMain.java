package edu.java.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		// Captain 클래스의 인스턴스 생성하기 위해서는
		// private 생성자를 호출할 수는 없고, public static으로 제공된 메서드를 사용할 수 있음.
		Captain captain1 = Captain.getInstance();
		System.out.println(captain1);

		Captain captain2 = Captain.getInstance();
		System.out.println(captain2);
		// captain1과 captain2는 같은 인스턴스를 가리킨다.
		// Singleton 디자인 패턴:
		// 생성자가 오직 한 번만 호출되도록 함으로써, 인스턴스가 오직 한 개만 생성되도록 클래스를 설계하는 디자인 패턴.

		System.out.println(captain1.getName());
		System.out.println(captain2.getName());

		captain1.setName("아이언맨");
		System.out.println(captain1.getName());
		System.out.println(captain2.getName());

	}

}