package edu.java.class05;

public class Student {
	/**
	 * field
	 */
	 int id; //학번
	 String name; //이름
	 Score score; //학생이 수강신청한 과목의 점수들을 저장하는 객체
	 
	 
	//생성자 - default, 파라미터3개
	 public Student() {
		 
	 }
	 
	 public Student(int id, String name, Score score) {
		 this.id = id;
		 this.name = name;
		 this.score = score;
	 }
	 
	//메소드 - info : 학번, 이름, 과목점수들, 총점, 평균
	public void info() {
		System.out.println("----------");
		System.out.println("학번: " + id);
		System.out.println("이름: " + name);
		System.out.println("----------");
		if (score != null) {
		System.out.println("과목별 점수: ");
		System.out.print("국어: " + score.korean + " 영어: " + score.english + " 수학: " + score.math + " 과학: " + score.science);
		System.out.println();
		System.out.println("----------");
		System.out.println("총점: " + score.total());
		System.out.println("평균: " + score.avg());
		} else {
			System.out.println("score 정보 없음");
		}
	}
	
	
}
