package edu.java.file08;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
//import java.util.Random;

public class FileMain08 {

	public static void main(String[] args) {
//		Random rand = new Random();
//		for (int i = 0; i < 3 ; i++) {
//			Score score = new Score(rand.nextInt(101),rand.nextInt(101),rand.nextInt(101));
//			Student stu = new Student(rand.nextInt(100), "학생"+i, score);
//			System.out.println(stu);
//		}
		
		
		// TODO 1: ArrayList<Student>를 생성
		// ArrayList에 Student 객체 5개를 추가
		// ArrayList를 파일에 write (Serialize)
		
		
		try(FileOutputStream out = new FileOutputStream("data/student_list.dat"); 
				BufferedOutputStream bout = new BufferedOutputStream(out);
				ObjectOutputStream oout = new ObjectOutputStream(bout);) {
			
			ArrayList<Student> list = new ArrayList<>();
			for (int i = 0 ; i < 5 ; i++) {
				Score score = new Score(90,80,70);
				Student s = new Student((i+101), "Student"+(i+1), score);
				list.add(s);				
			}
			
			//Student stu2 = new Student(2,"bbb", new Score(50,60,70));
			
			oout.writeObject(list);
			System.out.println("작업 완료");
			System.out.println();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		

		// TODO 2: 1번에서 저장된 파일에서 객체를 read
		// 객체를 ArrayList로 타입 변환
		// ArrayList에 저장된 원소들을 모두 출력
		
		try(FileInputStream in = new FileInputStream("data/student_list.dat");
				ObjectInputStream oin = new ObjectInputStream(in);) {
			
			ArrayList<Student> list = (ArrayList<Student>)oin.readObject();
			for(Student s:list) {
				System.out.println(s);
			}
			
			
//			Object obj = oin.readObject();
//			if (obj instanceof ArrayList<?>) {
//				ArrayList<Student> list = (ArrayList<Student>)obj;
//				for(int i = 0; i < 5; i++) {
//				System.out.println(list.get(i));
//				}
//			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}