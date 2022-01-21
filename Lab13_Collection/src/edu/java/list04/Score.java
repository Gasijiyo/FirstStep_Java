package edu.java.list04;

public class Score {
	//field
	private int korean;
	private int english;
	
//	constructor
	public Score() {}
	public Score(int korean, int english) {
		this.korean = korean;
		this.english = english;
	}
	
	//getters & setters
	public int getKorean() {
		return this.korean;
	}
	
	public int getEnglish()	{
		return this.english;
	}
	
	public void setKorean(int korean) {
		this.korean = korean;
	}
	
	public void setEnglish(int english) {
		this.english = english;
	}
	
	@Override
	public String toString()	{
		return "Score{Korean= " + korean + ", English= " + english + "}";
	}
	
	@Override	//"두 점수가 같다" 를 재정의
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof Score) {
			Score score = (Score)obj;	//casting
			if(this.korean == score.korean && this.english == score.english) {
				result = true;
				//String 은 기본이 아님
			}
		}
			
		return result;
		
	}
	
	//equals 메소드가 true를 리턴하는 두 객체는 hashCode가 리턴하는 int값이 같아야한다.
	//hashCode값이 다르면 equals는 false를 리턴!
	//equals 메소드가 false일 때 hashCode 값이 같아야 되는 지 달라야 되는지의 제약조건 없음
	@Override
	public int hashCode() {
		return this.korean + this.english;
	}
	
}
