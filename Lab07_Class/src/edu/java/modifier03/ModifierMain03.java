package edu.java.modifier03;

import edu.java.modifier02.PublicClass;
//import edu.java.modifier02.PackageClass; 

//클래스의 가시성(visibility). 접근(access)범위
//1.public class : 어디에나 공개된 클래스.
//	(1)같은 패키지에서는 import 문 없이 사용가능
//	(2)다른 패키지에 있으면 import문을 사용하거나 또는 패키지이름을 포함한 풀네임으로 사용가능
//2.(package)class : 수식어 없이 선언된 클래스. 같은 패키지 안에서만 공개된 클래스
//	패키지 공개수준의 클래스는 다른 패키지에서는 import 자체가 되지않음.
//public으로 선언하는 클래스는 클래스의 이름과 java파일 (소스코드)의 이름이 반드시 같아야한다.
//	-> 하나의 java파일에는 public 클래스는 오직 하나만 선언해야 함.
//	-> 하나의 java파일에 public이 아닌 (package 가시성) 클래스를 함께 선언하는 것은 가능.

//public class A{} 하나의 파일에 public이 두 개 있을 수 없다.
class B{} //public이 아닌 클래스는 하나의 파일에 함꼐 선언 가능. (그러나 비권장)

public class ModifierMain03 {

	public static void main(String[] args) {
		// edu.java.modifier02.PublicClass 인스턴스 생성
		PublicClass cls = new PublicClass();
	}

}
