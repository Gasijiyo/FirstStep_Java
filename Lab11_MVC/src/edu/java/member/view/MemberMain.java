package edu.java.member.view;

import edu.java.member.controller.MemberDao;
import edu.java.member.controller.MemberDaoImpl;
import edu.java.member.model.Member;

// 클래스나 인터페이스에서 선언된 public static 멤버 변수 이름을 import하는 방법:
import static edu.java.member.view.MainMenu.*;

import java.util.Scanner;

// MVC(Model-View-Controller) 디자인 패턴
// Model: 데이터 저장을 위한 클래스. VO(Value Object), DTO(Data Transfer Object).
// - edu.java.member.model.Member
// View: UI(User Interface)를 담당하는 클래스.
// - edu.java.member.view.MemberMain
// Controller: 프로그램의 특정 로직(기능, 비즈니스 로직)을 담당하는 클래스. DAO(Data Access Obejct).
// - edu.java.member.controller.MemberDao, MemberDaoImpl
// - 인터페이스와 구현 클래스로 나눔.
// - 구현 클래스는 Singleton 디자인 패턴으로 설계.

public class MemberMain {
	// field(member variable)
	private static Scanner scanner = new Scanner(System.in);
	private static MemberDao dao = MemberDaoImpl.getInstance();  // 다형성(polymorphism)

	public static void main(String[] args) {
		// 회원 관리 프로그램 메인(View)
		System.out.println("*** 회원 관리 프로그램 ***");
		
		boolean run = true;
		while (run) {
			// 메인 메뉴를 보여주고, 사용자가 메뉴(기능)를 선택
			int menu = chooseMenu();
			switch (menu) {
			case QUIT:
				run = false;
				break;
			case SELECT_ALL:
				selectAllMembers();
				break;
			case SELECT_BY_INDEX:
				selectMemberByIndex();
				break;
			case INSERT:
				insertNewMember();
				break;
			case UPDATE:
				updateMemberInfo();
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요...");
			} // end switch
			
		} // end while

		System.out.println("*** 회원 관리 프로그램 종료 ***");
	} // end main()

	private static void updateMemberInfo() {
		System.out.println();
		System.out.println("----- 회원 정보 수정 화면 -----");
		System.out.println("변경할 인덱스 입력>>");
		String s = scanner.nextLine();
		int index = Integer.parseInt(s);
		System.out.println("변경할 패스워드 입력>>");
		String pwd = scanner.nextLine();
		
		// Controller 클래스의 기능(메서드)를 사용해서 회원 정보 업데이트 수행
		int result = dao.update(index, pwd);
		// 업데이트 결과 출력
		if (result == 1) {
			System.out.println("회원 정보 업데이트 성공!!!");
		} else {
			System.out.println("회원 정보 업데이트 실패...");
		}
	}

	private static void selectMemberByIndex() {
		System.out.println();
		System.out.println("----- 인덱스 검색 화면 -----");
		System.out.println("검색할 인덱스 입력>>");
		int index = Integer.parseInt(scanner.nextLine());

		// Controller의 기능(메서드)를 사용해서 해당 인덱스의 회원 정보를 검색
		Member member = dao.select(index);
		// 검색 결과 출력
		System.out.println(member);
	}

	private static void selectAllMembers() {
		System.out.println();
		System.out.println("----- 전체 회원 목록 -----");
		
		// Controller의 기능(메서드)를 사용해서 회원 전체 목록 검색
		Member[] list = dao.select();
		
		// 검색 결과를 출력
		for (Member m : list) {
			System.out.println(m);
		}
		System.out.println("--------------------------");
	}

	private static void insertNewMember() {
		System.out.println();
		System.out.println("----- 회원 가입 화면 -----");
		System.out.println("ID 입력>>");
		String id = scanner.nextLine();
		System.out.println("Password 입력>>");
		String pwd = scanner.nextLine();
		Member member = new Member(id, pwd);
		
		// Controller 기능(메서드)를 사용해서 회원 가입 수행 
		int result = dao.insert(member);
		// 회원 가입 결과 출력
		if (result == 1) {
			System.out.println("회원 가입 성공!!!");
		} else {
			System.out.println("회원 가입 실패...");
		}
	}

	private static int chooseMenu() {
		showMainMenu();
		String s = scanner.nextLine(); // 문자열을 입력받음.
		int menu = Integer.parseInt(s); // 문자열을 int 기본 타입으로 변환
		return menu;
	}
	
	private static void showMainMenu() {
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println("[1] 전체검색 [2] 인덱스 검색 [3] 회원가입 [4]정보수정 [0] 종료");
		System.out.println("--------------------------------------------------------------");
		System.out.println("선택>>");
	}

} // end class MemberMain
