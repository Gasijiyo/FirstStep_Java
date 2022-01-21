package edu.java.list02;

import java.util.LinkedList;
import java.util.List;

public class ListMain02 {

	public static void main(String[] args) {
		// 정수(Integer)를 저장할 수 있는 LinkedList를 생성
		// 다형성, 생성자 호출에서는 원소 타입 생략
		List<Integer> list  = new LinkedList<>();
		System.out.println("size = " + list.size());
		System.out.println(list);
		
		// 리스트에 순서대로 100, 200, 300, 400, 500을 저장 - add
		for (int i = 0; i < 5; i++) {
			list.add((i + 1) * 100); // int 값 --> Integer 객체 변환 --> 리스트에 저장
		}
				
		// println 메서드를 사용해서 리스트 내용 출력
		System.out.println(list);
		
		// 향상된 for 구문을 사용해서 리스트 내용 출력
		for (Integer i : list) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		// 인덱스 0 위치의 원소를 123으로 변경 후 리스트를 출력 - set
		list.set(0, 123); // 123 숫자(int) --> Integer 객체로 변환 --> 리스트의 0번 원소 값 변경
		System.out.println(list);
		
		// 인덱스 1 위치의 원소를 삭제하고 리스트를 출력 - remove(int index)
		list.remove(1);
		System.out.println(list);
		
		// 123을 찾아서 (값으로) 삭제하고 리스트를 출력 - remove(Object value), Integer 클래스 사용
//		Integer value = 123;
//		list.remove(value);
		list.remove(Integer.valueOf(123)); // Integer.valueOf(int): int --> Integer 변환
		System.out.println(list);

	}

}
