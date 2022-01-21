package edu.java.map01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Collection<E>
 * |__ List<E>, Set<E>
 * List<E>, Set<E> 공통점: 한 가지 타입의 객체 여러개를 저장하는 자료구조.
 * List<E>: 저장 순서 중요, 인덱스 있음. 같은 값을 저장할 수 있음.
 * Set<E>: 저장 순서 중요하지 않음, 인덱스 없음. 같은 값 저장 불가 
 * 
 * List<E>
 * |__ ArrayList<E>, LinkedList<E>
 * ArrayList<E>: add/remove 속도 느림. get 속도 빠름
 * LinkedList<E>: add/remove 속도 빠름. get 속도 느림.
 * 
 * Set<E>
 * |__ HashSet<E>, TreeSet<E>
 * HashSet<E>: 검색을 빨리 하기 위한 알고리즘 (hash 알고리즘)이 적용된 집합(set).
 * TreeSet<E>: (오름차순/내림차순) 정렬을 빨리 하기 위한 알고리즘 (Tree알고리즘) 이 적용된 집합(set).
 * 
 * Map<K, V> 
 * |__ HashMap<k, V>, TreeMap<K, V>
 * Map<K, V>: Key(키)와 Value(값)의 쌍으로 구성된 데이터를 저장하는 자료 구조.
 * 1) Key는 중복된 값을 가질 수 없음.
 * 2) Key의 목적은 데이터를 저장, 검색, 수정, 삭제를 할 때 값을 찾기 위한 용도
 * 3) Value(값)은 중복된 값을 가질 수 있음.
 * HashMap<K, V>: 검색을 빨리 하기 위한 hash 알고리즘이 적용된 Map.
 * TreeMap<K, V>: 정렬을 빨리 하기 위한 tree 알고리즘이 적용된 Map.
 * 
 * 
 * 
 */

public class MapMain01 {

	public static void main(String[] args) {
		// Key(정수) - Value(문자열) 타입의 HashSet 을 생성
		Map<Integer, String> students = new HashMap<>();
		
		//map에 저장된 원소의 개수
		System.out.println("size: " + students.size());
	
		//map에 새로운 데이터 추가(저장): put (key, value)
		//데이터 추가는 크게 add 또는 put이니 작성 시 확인
		students.put(1, "홍길동");
		System.out.println(students);
		System.out.println("size: " + students.size());
		
		students.put(10, "오쌤");
		System.out.println(students);
		System.out.println("size: " + students.size());
		
		//map에 저장된 데이터 삭제: remove(key), 해당 key의 데이터를 삭제
		//map은 value를 찾아 삭제하는 기능은 없음.
		students.remove(1);
		System.out.println(students);
		System.out.println("size: " + students.size());
		//매핑되어 있는 키가 없는 경우 null을 리턴. 에러 발생하지 않음
		
		//map에 저장된 데이터 검색: get(key) - 해당 키의 value를 리턴
		System.out.println(students.get(10));
		System.out.println(students.get(2));
		//매핑되어 있는 키가 없는 경우 get 메소드는 null을 리턴
	
		//map에서 특정 key의 값(value)을 수정하는 기능: put(key, value)
		//put(key, value) 메소드는 key가 map에 존재하지 않으면 새로운 key-value 쌍으로 구성된 아이템을 추가하고
		//key가 map에 존재하는 경우에는 그 key에 매핑된 값(value)을 변경한다.
		students.put(10, "아무개");
		System.out.println(students);
	
		students.put(100, "abc");
		students.put(1, "hello");
		
		//keySet(): map이 가지고 있는 key들의 집합(set)을 리턴하는 메소드
		Set<Integer> kset = students.keySet();
		System.out.println(kset);
		
		//map객체는 향상된 for 구문을 사용할 수 없지만,
		//keySet을 이용하면 향상된 for구문을 사용할 수 있다.
		for (Integer k : kset) {
			System.out.println("key= " + k + ", value= " + students.get(k));
		}
		
		//HashMap과 TreeMap 비교
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(10, "abc");
		map.put(100, "def");
		map.put(1, "aaa");
		Set<Integer> kset2 = map.keySet();
		System.out.println(kset2);	//TreeMap인 경우 keySet 메소드는 오름차순 정렬된 key들의 집합을 리턴.
		
		//TreeMap에는 HashMap이 가지고 있지 않은 descendingkeySet() 메소드가 있음.
		//내림차순 정렬된 key들의 집합을 리턴해줌.
		Set<Integer> kset3 = map.descendingKeySet();
		System.out.println(kset3);
		
		
		
		
	}

}
