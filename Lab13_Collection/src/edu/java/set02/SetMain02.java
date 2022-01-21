package edu.java.set02;

import java.util.HashSet;
import java.util.Set;

import edu.java.list04.Score;
public class SetMain02 {

	public static void main(String[] args) {
		//edu.java.list04.Score를 저장하는 HashSet을 생성
		//Set : 중복된 (같은) 값을 저장하지 않음. add순서가 중요하지 않음
		//HashSet: 검색이 빠른 Set(집합).
		Set<Score> set = new HashSet<>();
		System.out.println(set);
		
		set.add(new Score());
		System.out.println(set);
		System.out.println();
		
		//equals() 의 결과가 true면, hashCode()의 리턴값이 같다.
		//hashCode()의 리턴 값이 다르면, equals()의 결과가 false이다.
		//HashSet<E>은 원소를 추가(add)할 때 hashCode() 값이 다르면 equals 검사를 하지 않고 add한다.
		//그래서 equals와 hashCode를 같이 만들어 놓아야 함.
		
		set.add(new Score(0,0));
		System.out.println(set);
		
		set.add(new Score(100,100));
		System.out.println(set);
		
		Score s = new Score(100, 100);
		set.remove(s);
		System.out.println(set);
	
		
	}

}
