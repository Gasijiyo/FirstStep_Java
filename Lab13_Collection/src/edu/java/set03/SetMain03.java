package edu.java.set03;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetMain03 {

	public static void main(String[] args) {
		// 정수(Integer)를 저장할 수 있는 HashTree를 생성
		
		//0이상 9이하의 서로 다른 (int)난수 5개를 저장
		Set<Integer> set = new HashSet<>();
		System.out.println(set);
		Random r = new Random();
		
//		for (int i = 0; i < 5; i++) {
//			int a = r.nextInt(10);
//			set.add(a);		//5번 반복 동안 중복 숫자가 발생
//		}
//		System.out.println(set);
		
		while(true) {
			int a = r.nextInt(10);
			set.add(a);	//난수를 set에 추가(다른 숫자면 추가, 같은 숫자면 추가안됨)
		
			if(set.size() == 5) { //set의 원소가 5개면
				break;	//종료
			}
		}
		System.out.println(set);
		
	}

}
