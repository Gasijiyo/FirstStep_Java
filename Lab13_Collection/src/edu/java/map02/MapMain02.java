package edu.java.map02;

import java.util.*;

public class MapMain02 {

	public static void main(String[] args) {
		// Key(String)-Value(Integer) 타입의 TreeMap을 생성
		TreeMap<String, Integer> menu = new TreeMap<>();
		
		//데이터 추가
		menu.put("짜장면", 5000);
		menu.put("짬뽕", 6000);
		menu.put("볶음밥", 6000);
		
		Set<String> kset1 = menu.keySet();  //오름차순 정렬도니 key들의 집합
		System.out.println(kset1);
		for (String k:kset1) {
			//데이터 읽기 : get(key)
			System.out.println(k+": " + menu.get(k));
		}
		
		Set<String> kset2 = menu.descendingKeySet();
		System.out.println(kset2);
		for (String k :kset2) {
			System.out.println(k+ ": " + menu.get(k));
		}
	}

}
