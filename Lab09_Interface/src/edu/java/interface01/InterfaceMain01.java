package edu.java.interface01;

//인터페이스(interface) : 
//사용목적: 팀/회사 간의 분업/협업을 하기 위해 메소드(기능)들의 원형(prototype, signature)을 약속하기 위한 규약.
//인터페이스가 가질 수 있는 맴버들:
//1) 모든필드 (맴버 변수)는 public static final 임. public static final은 보통 생략해서 필드를 선언함.
//2) 모든 메소드는 "public abstract"임. public abstract는 보통 생략해서 메소드 선언함.
//인터페이스는 interface 키워드를 사용해서 java 파일을 작성.
//인터페이스의 추상 메소드들을 구현하는 클래스는 implements 키워드를 사용함.
//	-> class InterfaceImple implements InterfaceName
//클래스는 단일 상속만 가능하지만 인터페이스는 구현하는 개수 제한이 없음.
//
//

public class InterfaceMain01 {

	public static void main(String[] args) {
		// 구현된 인터페이스의 기능들을 사용
		// DatabaseModule.DB_VERSION = 2; -> final 이라 변경불가
		
		//인터페이스이름 변수 = new 구현클래스생성자();
//		DatabaseModule db = new OracleDatabaseModule(); //다형성 polymorphism
//		데이터베이스 모듈이 Oracle 에서 MySQL로 바뀐경우..
		DatabaseModule db = new MySQLDatabaseModule();
		
		//select 와 update와 같은 메소드를 사용하는 방법은 바뀌지않음
		db.select();
		db.update("df");
		//변수선언, 클래스선언, 메소드 이용해 변수값 입력수정 
		
		
	}

}
