package edu.java.modifier04;

public class Person {
	//field (맴버 변수)
	private String name;
	private int age;
	
	//getter: private 필드(맴버 변수)의 값을 다른 클래스에 알려주기위한 public 메소드
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//setter: private 필드(맴버변수)의 값을 변경(설정)하기 위한 public 메소드. 
	public void setName(String name) {
		this.name = name;
		
	}
	
	public void setAge(int age) {
		if (age >= 0) {	 //나이가 정상적인 값(0 또는 양수)이면
			this.age = age; //필드의 값을 변경
		} else {	//정상적인 값이 아니면
			System.out.println("나이는 0보다 작을 수 없음!"); //경고메세지 출력
		}
	}
	
	
	
}
