package edu.java.contact.fileutil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import edu.java.contact.model.Contact;

public class ContactFileUtil {
	
	// 상수(constant variable) 정의 - 데이터 폴더 이름, 데이터 파일 이름
	public static final String DATA_DIR = "data";	// 데이터 폴더 이름
	public static final String DATA_FILE = "contacts.dat"; // 데이터 파일 이름

	// 생성자를 private으로 선언하고 모든 메소드를 static으로 만듦
	private ContactFileUtil () {}
	
	/**
	 * 연락처 데이터 파일을 저장하는 폴더가 없으면 생성하고 File 객체를 리턴.
	 * 
	 * @return 데이터 폴더를 관리하는 File 객체
	 */
	public static File initializeDataDir() {
		File dataDir = new File(DATA_DIR);	// 상대 경로를 사용해서 File 객체 생성
		
		if (!dataDir.exists()) {	// 데이터 폴더가 만들어져 있지 않으면
			boolean result = dataDir.mkdir();	// 폴더 만듦
			if (result) {
				System.out.println("데이터 폴더 생성 성공");
			} else {
				System.out.println("데이터 폴더 생성 실패");
			
			}
		} else {
			System.out.println("이미 데이터 폴더가 만들어져 있습니다..");
		}
		
		return dataDir;
	}
	
	/**
	 * 파라미터에 전달된 File 객체를 사용해서 데이터 파일에 저장된 연락처 정보를 읽어서, 
	 * 연락처 정보를 List 객체로 리턴.
	 * 
	 * @param file 연락처 데이터가 저장된 파일을 관리하는 File 객체.
	 * @return 파일에서 읽은 데이터. ArrayList<Contact> 타입 객체.
	 */
	public static List<Contact> readDataFromFIle(File file) {
		List<Contact> list = null;	//리턴할 리스트
		
		FileInputStream in = null;
		BufferedInputStream bin = null;
		ObjectInputStream oin = null;
		
		try {
			in = new FileInputStream(file);
			bin = new BufferedInputStream(in);
			oin = new ObjectInputStream(bin);
			
			list = (ArrayList<Contact>) oin.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();	// OIS을 close -> BIS이 close됨.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	
	public static void writeDataToFile(List<Contact> data, File file) {
		try (FileOutputStream out = new FileOutputStream(file);
				BufferedOutputStream bout = new BufferedOutputStream(out);
				ObjectOutputStream oout = new ObjectOutputStream(bout);) {
			
			oout.writeObject(data);		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 연락처 데이터를 저장하고 있는 파일(data\contacts.dat)이 있는 지 없는 지 체크해서,
	 * 데이터 파일이 있으면 파일에서 ArrayList를 읽어서 리턴하고,
	 * 데이터 파일이 없으면 빈(empty) 리스트(ArrayList)를 생성해서 리턴.
	 * 
	 * @return Contact 객체를 저장하는 ArrayList.
	 */
	public static List<Contact> initializeData() {
		List<Contact> list = null;	//리턴할 리스트
		
		// 데이터 파일(data\contacts.dat)을 관리하는 File 객체를 생성.
		File file = new File(DATA_DIR, DATA_FILE);
		if(file.exists()) {	// 데이터 파일이 만들어져 있으면
			System.out.println("데이터 로딩중...");
			list = readDataFromFIle(file);
		} else {	// 데이터 파일이 없으면
			System.out.println("새 데이터 생성 중...");
			list = new ArrayList<Contact>();
		}
		return list;
	}

}
