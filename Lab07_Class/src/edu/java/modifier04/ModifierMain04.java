package edu.java.modifier04;

public class ModifierMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ssam = new Person();
		
		
		//private 맴버들은 직접 접근(사용)이 불가능
//		ssam.name = "오쌤";
//		ssam.age = -16; //데이터 무결성이 깨짐
		
		//제공 된 public getter (읽기) 또는 setter (쓰기)를 사용할 수 있음.
		ssam.setName("오쌤");
		ssam.setAge(16);
		
		System.out.println("이름: " + ssam.getName());
		System.out.println("나이: " + ssam.getAge());
		
		//데이터 캡슐화(encapsulation)
//		맴버변수(필드, 데이터)를 private로 감추고
//		대신 필요한 경우에 한해서 public으로 공개된 getter 또는 setter 메소드를 통해
//		데이터를 접근(읽기, 쓰기)를 허용하는 프로그래밍 기법
//		보안성과 데이터 무결성을 유지하기 위해서 사용
//		
	}

}
