package edu.java.file08;

import java.io.Serializable;

public class Student implements Serializable{
	// field
	private int id;
	private String name;
	private Score score;
	
	// TODO: constructor - 기본 생성자, 파라미터 3개(int, String, Score)를 갖는 생성자
	public Student () {}
	public Student (int id, String name, Score score ) {
		this.id = id;
		this.name = name;
		this.score = score;
		
	}
		
	// TODO: getters & setters
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Score getScore() {
		return score;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setScore(Score score) {
		this.score = score;
	}
	
	// TODO: toString 메서드 override
	@Override
	public String toString() {
		return "{Student ID: " + id + ", Name: " + name + ", Score: " + score + "}";
	}
}
