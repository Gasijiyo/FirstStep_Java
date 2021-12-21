package edu.java.set01;

import java.util.Set;
import java.util.TreeSet;

/*
 * Collection<E>
 * |__Set<E>
 * 		|__HashSet<E>, TreeSet<E>
 * 
 * Set<E>의 특징:
 * 1) 중복된 값을 저장할 수 없음. -> {1,2,3} = {1,2,2,3,3,3}
 * 2) 저장순서 중요하지 않음. -> 인덱스가 없음!
 * 
 * HashSet<E> : Hash 알고리즘 (검색을 빨리할 수 있는 알고리즘)을 사용한 Set(집합).
 * TreeSet<E> : Tree 알고리즘 (정렬을 빨리할 수 있는 알고리즘)을 사용한 Set(집합).
 * 
 */


public class SetMain01 {

	public static void main(String[] args) {
		//String을 저장하는 TreeSet을 생성
		Set<String> set = new TreeSet<>();
		//변수를 선언할 때 Set이 저장하는 원소타입을 생략할 순 없지만
		//생성자를 호출할 때는 원소타입을 생략할 수 있음.
		System.out.println("size: " + set.size());
		System.out.println(set);
		
		//List<E>는 add(Object), remove(int), remove(Object), get(int), set(int, Object) 메소드를 가지고 있지만
		//Set<E>은 add(Object), remove(Object), 메소드만 가지고있음, 인덱스(int)를 이용하는 메소드는 없음.
		set.add("hello");
		System.out.println("size: "+set.size());
		System.out.println(set);
		
		set.add("hello");
		System.out.println(set);	//-> Set<E>은 중복된 값을 저장하지 않음.
		
		set.add("apple");
		System.out.println(set);
		
		set.add("banana");
		System.out.println(set);
		// -> add순서와 println에서 출력하는 원소들의 순서가 다름!
		
		//Set<E>이 가지고 있는 원소삭제 - remove
		set.remove("banana");
		System.out.println(set);
		
		//Advanced for 구문 사용 가능
		//일반 for구문 사용 불가 -> 인덱스가 없기 때문
		for (String s : set) {
			System.out.println(s);
		}
		
	}

}
