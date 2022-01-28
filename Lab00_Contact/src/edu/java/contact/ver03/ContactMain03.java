package edu.java.contact.ver03;

import java.util.List;
import java.util.Scanner;

import edu.java.contact.model.Contact;

import static edu.java.contact.menu.MainMenu.*;


public class ContactMain03 {
	private static Scanner scanner = new Scanner(System.in);
	private static ContactDao dao = ContactDaoImpl.getInstance();
	// super타입 변수이름 = new sub타입(); -> 다형성(polymorphism) -> 코드의 재사용성을 높임.
	
	public static void main(String[] args) {
		System.out.println("*** 연락처 프로그램 ver 0.3 ***");
		
		boolean run = true;
		while (run) {
			int menu = chooseMenu();
			switch (menu) {
			case QUIT:
				run = false;
				break;
			case SELECT_ALL:
				selectAllContacts();
				break;
			case SELECT_BY_INDEX:
				selectContactByIndex();
				break;
			case INSERT:
				insertNewContact();
				break;
			case UPDATE:
				updateContactInfo();
				break;
			case DELETE:
				deleteContactByIndex();
				break;
			default:
				System.out.println("다시 선택하세요...");
			} //  end switch
			
		} // end while

		System.out.println("*** 프로그램 종료 ***");
	} // end main()

	private static void deleteContactByIndex() {
		System.out.println();
		System.out.println("--- 연락처 정보 삭제 ---");
		System.out.println("삭제할 인덱스>>");
		int index = inputInteger();
		int result = dao.delete(index);
		if (result == 1) {
			System.out.println("삭제 성공!!!");
		} else {
			System.out.println("삭제 실패...");
		}
	}

	private static void updateContactInfo() {
		System.out.println();
		System.out.println("--- 연락처 정보 수정 ---");
		System.out.println("수정할 인덱스>>");
		int index = inputInteger();
		System.out.println("이름 수정>>");
		String name = scanner.nextLine();
		System.out.println("전화번호 수정>>");
		String phone = scanner.nextLine();
		System.out.println("이메일 수정>>");
		String email = scanner.nextLine();
		
		// Controller의 메서드를 사용
		Contact contact = new Contact(name, phone, email);
		int result = dao.update(index, contact);
		// 결과 출력
		if (result == 1) {
			System.out.println("연락처 정보 수정 성공!!!");
		} else {
			System.out.println("연락처 정보 수정 실패...");
		}
	}

	private static void selectContactByIndex() {
		System.out.println();
		System.out.println("--- 인덱스 검색 ---");
		System.out.println("검색할 인덱스>>");
		int index = inputInteger();
		
		// Controller의 메서드를 사용
		Contact contact = dao.select(index);
		// 결과 출력
		if (contact != null) {
			System.out.println(contact);
		} else {
			System.out.println("입력한 인덱스에는 연락처 정보가 없습니다.");
		}
	}

	private static void insertNewContact() {
		System.out.println();
		System.out.println("--- 새 연락처 추가 ---");
		System.out.println("이름 입력>>");
		String name = scanner.nextLine();
		System.out.println("전화번호 입력>>");
		String phone = scanner.nextLine();
		System.out.println("이메일 입력>>");
		String email = scanner.nextLine();
		
		// Controller의 메서드를 사용
		Contact contact = new Contact(name, phone, email);
		int result = dao.insert(contact);
		if (result == 1) {
			System.out.println("새 연락처 추가 성공!!!");
		} else {
			System.out.println("새 연락처 추가 실패...");
		}
	}

	private static void selectAllContacts() {
		System.out.println();
		System.out.println("--- 연락처 전체 리스트 ---");
		// Controller의 메서드를 사용
		List<Contact> contactList = dao.select();
		// Controller가 리턴한 내용을 출력
		for (Contact c : contactList) {
			System.out.println(c);
		}
		System.out.println("--------------------------");
	}

	private static int chooseMenu() {
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		System.out.println("[1] 전체검색 [2] 인덱스검색 [3] 추가 [4] 수정 [5] 삭제 [0] 종료");
		System.out.println("---------------------------------------------------------------");
		System.out.println("선택>>");
		int menu = inputInteger();
		
		return menu;
	}
	
	private static int inputInteger() {
		while (true) {
			String s = scanner.nextLine();
			try {
				int n = Integer.parseInt(s);
				return n;
			} catch (NumberFormatException e) {
				System.out.println("입력한 값은 정수가 아닙니다. 다시 입력하세요>>");
			}
		}
	}
	
} // end class ContactMain02