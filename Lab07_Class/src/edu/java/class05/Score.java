package edu.java.class05;

public class Score {
	
	// field
		
	int korean;
	int english;
	int math;
	int science;
		
	//생성자 - default, 파라미터4개 
	//데이터를 보유한 클래스에서 기능작업하여 리턴하는게 객체지향에 더 알맞다
	public Score() {
		
	}
	
	public Score(int korean, int english, int math, int science) {
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	//메소드 - 총점 리턴, 평균 리턴
	public int total() {
		return korean + english + math + science;
	}
		
	public double avg() {
		
		return (double)total() / 4;
	}
	

}
