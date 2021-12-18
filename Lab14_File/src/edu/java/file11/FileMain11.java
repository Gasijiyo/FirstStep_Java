package edu.java.file11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileMain11 {

	public static void main(String[] args) {
		// Writer 객체들을 사용한 파일 쓰기
		// OutputStreamWriter ==> FileOutputStream ==> File
		
		try(FileOutputStream out = new FileOutputStream("data/writer_test.txt");
				OutputStreamWriter writer = new OutputStreamWriter(out, "UTF-8");
				BufferedWriter bw = new BufferedWriter(writer)){
		bw.write("Hello, Java!");
		bw.newLine(); //줄바꿈
		bw.write("안녕, 자바");
		bw.newLine();
		bw.write("123 456 789 0");
		bw.newLine();
		
		System.out.println("작성 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}

		//위에서 작성된 파일 읽기
		//BufferedReader <== InputStreamReader <== FileInputStream  <== File
		//BufferedReader 클래스의 readLine() 메소드 사용해 한 줄씩 읽기
		
		
		try(FileInputStream in = new FileInputStream("data/writer_test.txt");
				InputStreamReader iin = new InputStreamReader(in, "UTF-8");
				BufferedReader br = new BufferedReader(iin)){
			
			
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
