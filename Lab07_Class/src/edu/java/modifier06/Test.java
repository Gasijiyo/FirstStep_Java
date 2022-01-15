package edu.java.modifier06;

public class Test {
	// field
	private boolean active;
	private int id;
	private String name;

	// 생성자(constructor): 마우스 오른쪽 클릭 -> Source -> Generate constructor using fields
	public Test() {
	}

	public Test(boolean active, int id, String name) {
		this.active = active;
		this.id = id;
		this.name = name;
	}

	// getter & setter: 마우스 오른쪽 클릭 -> Source -> Generate getters & setters
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}