package edu.java.interface01;

public class MySQLDatabaseModule implements DatabaseModule {

	@Override
	public int select() {
		System.out.println("MySQL select");
		return 0;
	}
	
	@Override
	public int update(String pw) {
		System.out.println("MySQL update(" + pw + ")");
		return 0;
	}
	
}
