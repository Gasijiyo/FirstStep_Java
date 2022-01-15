package edu.java.modifier02;

import java.util.Date;

import edu.java.modifier01.AccessTest;
//같은 패키지에 있는 클래스는 import문 없이 변수 선언할 떄 클래스 이름을 사용할 수 있음.
//다른 패키지에 있는 클래스로 변수를 선언할 때는
//	(1) import문을 작성하고 클래스 이름을 사용.
//	(2) 패키지를 포함한 클래스의 full name으로 변수를 선언.
//java.lang 패키지의 모든 클래스는 import문 없이 사용가능 : ex)String

public class ModifierMain02 {

	public static void main(String[] args) {
		// edu.java.modifier01.AccessTest 클래스 인스턴스 생성
		AccessTest test = new AccessTest();
		//Main 01 과 다른점은 import 가 생겨났다는 점.
		// 이유는 패키지가 달라서
		//edu.java.modifier01.AccessTest test = new edu.java.modifier01.AccessTest();
		//위처럼 써야하는걸 간략히 하기위해 import 문 사용
		
		String name;
		Date d;
		//다른 2가지의 Date를 사용하려면 하나는 import, 하나는 edu.java...와 같이 풀네임을 써야함. 
		
		//test.을 했을 때 보이는 맴버 : public field, public  method 
		test.printAllFields(); //public method를 사용해 간접적으로 맴버들에게 접근할 수는 있음
	
	}

}
