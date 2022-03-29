package edu.java.contact.ver05;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import edu.java.contact.model.Contact;

public class ContactInsertFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textPhone;
	private JTextField textEmail;
	
	private Component parentComponent; // 부모 컴포넌트 참조값을 저장하기 위한 변수
	private ContactMain05 mainApp; // 메인 화면(ContactMain05) 객체의 참조값을 저장하기 위한 변수

	/**
	 * Launch the application.
	 */
	public static void showFrame(Component parentComponent, ContactMain05 mainApp) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactInsertFrame frame = new ContactInsertFrame(parentComponent, mainApp);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ContactInsertFrame(Component parentComponent, ContactMain05 mainApp) {
		this.parentComponent = parentComponent;
		this.mainApp = mainApp;
		initialize();
	}
	
	public void initialize() {
		setTitle("새 연락처 추가"); // JFrame의 타이틀
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // JFrame의 닫기 동작 설정
		
		// JFrame이 뜨는 위치 설정
		int x = parentComponent.getX(); // 부모 컴포넌트의 x 좌표
		int y = parentComponent.getY(); // 부모 컴포넌트의 y 좌표
		setBounds(x, y, 450, 320);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelName = new JLabel("이름");
		labelName.setFont(new Font("D2Coding", Font.PLAIN, 24));
		labelName.setBounds(12, 10, 116, 56);
		contentPane.add(labelName);
		
		textName = new JTextField();
		textName.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textName.setBounds(140, 10, 282, 56);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JLabel labelPhone = new JLabel("전화번호");
		labelPhone.setFont(new Font("D2Coding", Font.PLAIN, 24));
		labelPhone.setBounds(12, 76, 116, 56);
		contentPane.add(labelPhone);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textPhone.setColumns(10);
		textPhone.setBounds(140, 76, 282, 56);
		contentPane.add(textPhone);
		
		JLabel labelEmail = new JLabel("이메일");
		labelEmail.setFont(new Font("D2Coding", Font.PLAIN, 24));
		labelEmail.setBounds(12, 139, 116, 56);
		contentPane.add(labelEmail);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textEmail.setColumns(10);
		textEmail.setBounds(140, 139, 282, 56);
		contentPane.add(textEmail);
		
		JButton btnInsert = new JButton("추가");
		btnInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				insertContact();
			}
		});
		btnInsert.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnInsert.setBounds(12, 205, 116, 56);
		contentPane.add(btnInsert);
		
		JButton btnCancel = new JButton("취소");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnCancel.setBounds(140, 205, 116, 56);
		contentPane.add(btnCancel);
	}

	private void insertContact() {
		// JTextField에서 이름, 전화번호, 이메일을 읽음.
		String name = textName.getText();
		String phone = textPhone.getText();
		String email = textEmail.getText();
		
		// 창닫기
		dispose();
		
		// 추가할 연락처 정보를 ContactMain 클래스의 메서드를 호출하면서 argument로 전달.
		Contact c = new Contact(name, phone, email);
		mainApp.insertConcat(c);
	}

} // end class ContactInsertFrame