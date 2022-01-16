package edu.java.inheritance02;

//class SubClass extends (확장하다) SuperClass
public class BusinessPerson extends Person {
	//필드 (맴버 변수, 속성, 특성)
	private String company;
	
	public BusinessPerson() {
		super(); //상위클래스의 기본생성자를 명시적으로 호출
		System.out.println("BusinessPerson() 생성자 호출");
	}
	
	public BusinessPerson(String name, String company) {
		System.out.println("BusinessPerson(name, company) 호출");
		setName(name); //부모클래스의 private필드를 접근하기위해 public 메소드 이용해야함
		this.company = company;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
}
// 상속관계에서 생성자 호출 순서
// 1.하위클래스의 생성자를 호출하면 상위클래스의 생성자가 먼저 호출된다.
// 2.하위클래스의 생성자에서 상위클래스의 생성자를 명시적으로 호출하지 않으면
//	상위클래스의 기본생성자(super()) 를 자동으로 호출함.
// 3.하위클래스의 생성자에서 상위클래스의 생성자를 명시적으로 호출할 수도 있음 
//	super();, super(param, ...); 형식으로 호출함.
//	비교 - 같은 클래스의 다른 (overloading 된) 생성자를 호출할 때는 this(), this(param, ...) 형식으로 호출함.
// 4.상위클래스가 기본생성자를 갖고 있지 않고 파라미터가 있는 생성자만 갖고 있을 때
//	하위클래스에서 상위클래스의 생성자를 명시적으로 호출하지 않으면 컴파일 에러(super() 생성자가 없다)가 발생. 
//	-> 해결1. 상위클래스에서 기본 생성자를 만듦.
//	-> 해결2. 하위클래스에서 상위클래스의 파라미터가 있는 생성자를 "명시적"으로 호출


