package edu.java.class02;

public class ClassMain02 {

	public static void main(String[] args) {
		// Student 클래스의 인스턴스 생성
		Student stu1 = new Student(); //기본 생성자(default constructor) 호출
		System.out.println(stu1); //참조변수 : 인스턴스 주소값
		System.out.println(stu1.id); //id필드(변수) : 0으로 초기화
		System.out.println(stu1.name); //name 필드 (변수) : null으로 초기화
		//데이터타입 기본값 default value
		//boolean - false
		//정수타입 - 0 byte, short, int, long, char
		//실수타입 - 0.0 float, double
		//참조타입 - null (클래스) String,Random,Scanner,BasicTv,Student
		//null의 의미 : 인스턴스가 생성되지 않음, 참조 주소값 없음
	
		//stu1에게 학번(id)과 이름(name)을 부여
		stu1.id = 101;
		stu1.name = "오쌤";
		
		//id가 201이고, 이름이 "홍길동"		
		Student stu2 = new Student(201, "홍길동");
		System.out.println(stu2.id);
		System.out.println(stu2.name);
		
		stu2.id = 201;
		stu2.name = "홍길동";
		
		
		Student stu3 = new Student(301);
		System.out.println(stu3.id);
		System.out.println(stu3.name);
		
		
	} //end main()

} //end ClassMain02
