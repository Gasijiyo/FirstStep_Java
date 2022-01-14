package edu.java.class05;

public class ClassMain05 {

	public static void main(String[] args) {
		
//		Student st0 = new Student();
//		st0.info();		
//		
//		System.out.println();
		
		Score score1 = new Score(73,61,43,90);
		Student st1 = new Student(101, "박양수", score1);
		st1.info();
				
		System.out.println();
		
		Score score2 = new Score(0,0,0,0);
		Student st2 = new Student(102, "오쌤", score2);
		st2.info();
	}

}
