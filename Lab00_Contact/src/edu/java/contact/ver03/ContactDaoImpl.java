package edu.java.contact.ver03;

import java.util.ArrayList;
import java.util.List;

import edu.java.contact.model.Contact;

public class ContactDaoImpl implements ContactDao{
	// field(멤버 변수)
		private List<Contact> contacts = new ArrayList<Contact>(); // 연락처 정보를 저장할 리스트.
		
		// singleton
		private static ContactDaoImpl instance = null;
		private ContactDaoImpl() {}
		public static ContactDaoImpl getInstance() {
			if (instance == null) {
				instance = new ContactDaoImpl();
			}
			return instance;
		}

		@Override
		public List<Contact> select() {
			return contacts;
		}

		@Override
		public Contact select(int index) {
			Contact result = null;
			if (index >= 0 && index < contacts.size()) { // 파라미터 index가 리스트의 인덱스 범위 안에 있으면
				result = contacts.get(index);
			}
			
			return result;
		}

		@Override
		public int insert(Contact c) {
			contacts.add(c);
			
			return 1;
		}

		@Override
		public int update(int index, Contact contact) {
			int result = 0;
			if (index >= 0 && index < contacts.size()) { // 파라미터 index가 배열의 인덱스 범위 안에 있으면
//				contacts.set(index, contact);
				contacts.get(index).setName(contact.getName());
				contacts.get(index).setPhone(contact.getPhone());
				contacts.get(index).setEmail(contact.getEmail());
				result = 1;
			}
			
			return result;
		}

		@Override
		public int delete(int index) {
			int result = 0;
			if (index >= 0 && index < contacts.size()) {
				contacts.remove(index);
				result = 1;
			}
			
			return result;
		}

	}
