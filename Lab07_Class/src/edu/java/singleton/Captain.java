package edu.java.singleton;

public class Captain {
	// 필드(멤버 변수)
	private static Captain instance = null; // private static 멤버 변수
	private String name = "캡틴 아메리카"; // 인스턴스 변수

	// private 생성자 -> 다른 클래스에서 보이지 않기 때문에 생성자를 호출할 수 없음.
	private Captain() {
	}

	// private 생성자를 호출할 수 있는 public static 메서드를 작성
	// public의 목적: 어디서나 사용할 수 있도록 공개하기 위해서
	// static의 목적: 객체(인스턴스)가 생성되지 않아도 호출할 수 있도록
	public static Captain getInstance() {
		if (instance == null) {
			instance = new Captain(); // private 생성자는 같은 클래스 내부에서만 호출 가능
		}

		return instance;
	}

	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}