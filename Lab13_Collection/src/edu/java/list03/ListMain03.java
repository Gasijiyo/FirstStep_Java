package edu.java.list03;

import java.util.*;

public class ListMain03 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Member 타입을 저장할 수 있는 ArrayList
		ArrayList<Member> list = new ArrayList<Member>(); // <타입>
		System.out.println(list);
		// Member m0 = new Member();
		// 반복문을 사용해
		// 아이디와 비밀번호를 입력받아 Member 객체를 생성해서
		// ArrayList 에 Member 타입 객체 3개를 추가

		for (int i = 1; i <= 3; i++) {
			System.out.println("-- 인덱스 " + i + " 회원 --");
			System.out.println("ID입력 >> ");
			String id = sc.nextLine();
			System.out.println("PW입력 >> ");
			String pw = sc.nextLine();

			Member m = new Member(id, pw);
			
			System.out.println();
			list.add(m);
			//System.out.println(list);
		}
		// 리스트의 내용을 출력 - 각각의 회원의 아이디와 비밀번호가 출력될 수 있도록
		System.out.println("회원 목록");
		System.out.print(list);
		System.out.println("\n");

		// 인덱스 0위치의 회원 정보 중 비밀번호를 변경하고 리스트 내용 출력
		// (1) 인덱스 0 위치의 회원정보 찾음
		// (2) 그 회원의 비번을 설정(setter)
		System.out.println("-- Index 0 수정 --");
		Member m0 = list.get(0);
		System.out.println("새 비밀번호 입력 >> ");
		String pw = sc.nextLine();
		m0.setMemberPassword(pw);
		//m0.setMemberPassword("1234);
		//list.get(0).setMemberPassword("1234"); //한 줄로 줄인 코딩
		
		System.out.println("수정 후 : " + list);
		System.out.println();

		// 인덱스 1위치의 회원 정보를 삭제하고 리스트 내용을 출력
		System.out.println("-- Index 1 삭제 --");
		list.remove(1);
		System.out.println(list);
		System.out.println();

		// 아이디가 일치하면 같은 회원으로 간주되도록 Member 클래스 수정.
		// 아이디가 일치하는 회원을 리스트에서 삭제하고 리스트 내용을 출력
		Member member = new Member("ccc", "333");
		list.remove(member);
		System.out.println(list);
		
//		해시코드 사용 안할 시
//		Member member = new Member("ccc", "123"); //삭제하려고하는 회원정도
//		for (int i = 0; i <list.size() ; i++){		//인덱스 0부터 마지막까지 반복하면서
//			Member m = list.get(i);		//인덱스 위치에 있는 원소 가져옴
//			if (m.getMemberId().equals(member.getMemberId())){	리스트에 저장된 회원아이디와 삭제하려고한 아이디가 같아면
//				list.remove(i);		리스트에서 그 인덱스의 원소를 삭제	
//				break;
//		}
//		}
	}

}
