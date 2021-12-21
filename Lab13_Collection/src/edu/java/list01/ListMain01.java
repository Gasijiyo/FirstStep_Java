package edu.java.list01;

import java.util.ArrayList;

/*
 * Collection<E>
 * |__ List<E>
 *     |__ ArrayList<E>, LinkedList<E>
 * 
 * 리스트(list)의 특징:
 * 1) 값들이 저장되는 순서가 중요 - index를 가지고 있음.
 * 2) 값들을 저장할 때마다 index가 자동으로 증가 - 저장 용량이 자동으로 증가됨.
 * 3) 리스트 중간에 있는 값을 삭제하면 인덱스가 자동으로 재배열됨.
 * 4) 같은 값들을 여러번 저장할 수 있음.
 * 5) 배열(array)를 좀 더 편리하게 사용할 수 있도록 여러가지 메서드들을 제공하는 클래스 
 * 6) <E>는 리스트가 저장하는 데이터 타입을 의미 - 반드시 클래스 이름으로만 사용 가능
 * 
 * ArrayList<E>의 특징
 * 1) 데이터를 저장(add)하는 속도가 느림
 * 2) 데이터를 삭제(remove)하는 속도가 느림
 * 3) 데이터를 검색(get)하는 속도가 매우 빠름
 * 
 * LinkedList<E>의 특징
 * 1) 데이터를 저장(add)하는 속도가 빠름
 * 2) 데이터를 삭제(remove)하는 속도가 빠름
 * 3) 데이터를 검색(get)하는 속도가 느림
 */

public class ListMain01 {

	public static void main(String[] args) {
		// 문자열을 저장하는 ArrayList 객체를 생성
		ArrayList<String> list = new ArrayList<String>();  // new ArrayList<>();
		// 저장하는 원소의 타입을 <>안에 클래스 이름으로 작성.
		// 생성자를 호출할 때 리스트가 저장할 수 있는 원소의 최대 개수를 지정하지 않음.
		// 변수를 선언할 때는 원소의 타입(<String>)을 반드시 써야 함. 생성자 호출에서는 원소 타입을 생략해도 됨.
		
		// 리스트가 저장하고 있는 원소의 개수
		System.out.println("size = " + list.size());
		
		// 리스트에 새로운 원소를 추가: add(Object element)
		list.add("Java");
		System.out.println("size = " + list.size());
		list.add("SQL");
		list.add("HTML/CSS/JavaScript");
		list.add("JSP");
		list.add("Spring");
		System.out.println("size = " + list.size());
		
		// 리스트의 특정 인덱스에 있는 원소를 검색: get(int index)
		System.out.println(list.get(0)); // 인덱스의 시작은 0
		System.out.println(list.get(4)); // 마지막 인덱스 = size - 1
		
		// 리스트의 특정 인덱스에 있는 원소의 값을 다른 값으로 변경: set(int index, Object value)
		System.out.println("변경 전: " + list.get(2)); 
		list.set(2, "Front End"); // 인덱스 2 위치의 원소를 "Front End"로 바꿈
		System.out.println("변경 후: " + list.get(2));
		
		// 리스트의 특정 인덱스에 있는 원소를 삭제: remove(int index)
		System.out.println("삭제 전: " + list.get(2));
		list.remove(2);  // 인덱스 2 위치의 원소를 삭제
		System.out.println("삭제 후: " + list.get(2));
		
		// 리스트에 저장된 값을 찾아서 원소를 삭제: remove(Object value)
		list.remove("JSP");
		System.out.println("size = " + list.size());
		
		// 리스트와 반복문
		// 인덱스를 사용
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println();
		
		// 향상된 for 구문
		for (String s : list) {
			System.out.print(s + ", ");
		}
		System.out.println();
		
		// List<E> 클래스는 toString() 메서드를 override하고 있어서, 출력문에서 원소들을 바로 출력할 수 있음.
		System.out.println(list);
	}

}
