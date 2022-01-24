package edu.java.file08;

import java.io.Serializable;

public class Score implements Serializable{
	// field
	private int korean;
	private int english;
	private int math;

	// TODO: constructor - 기본 생성자, 파라미터 3개(int, int, int)를 갖는 생성자
	public Score() {}	//생성자엔 리턴타입이 없다 (void 같은 건 메소드에 존재)
	public Score(int korean, int english, int math) {	//오버로딩 - 생성자, 메소드 가능, 같은이름 여러개가능(파라미터만 다름)
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	
	// TODO: getters & setters
	public int getKorean() {
		return this.korean;
	}
	
	public int getEnglish() {
		return this.english;
	}
	
	public int getMath() {
		return this.math;
	}
	
	public void setKorean(int korean) {		
		this.korean = korean;		
	}
		
	public void setEnglish(int english) {
		this.english = english;		
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	// TODO: toString 메서드 override
	@Override
	public String toString() {
		return "(Korean: " + this.korean + ", English: " + this.english + ", Math: " + this.math + ")";
	}
	
	
}