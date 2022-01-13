package edu.java.interface01;

//extends(확장, 상속) + class, implements(구현) + interface

public class OracleDatabaseModule implements DatabaseModule {

	@Override
	public int select() {
		System.out.println("Oracle 데이터 검색");
		return 0;
	}

	@Override
	public int update(String pw) {
		System.out.println("Oracle 데이터 업데이트" + pw);
		return 0;
	}

}
