package edu.java.swing12;

public class Score {
	//멤버 변수
	private int kor;
	private int eng;
	private int mat;
	
	//생성자
	public Score() {}
	
	public Score (int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	
	//getters & setters
	public int getKor() {
		return kor;		
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	
	//총점 계산 메소드
	public int total() {
		return this.kor + this.eng + this.mat;
	}
	
	//평균 계산 메소드
	public double avg() {
		return (double)total()/3;
	}
	
		
}
