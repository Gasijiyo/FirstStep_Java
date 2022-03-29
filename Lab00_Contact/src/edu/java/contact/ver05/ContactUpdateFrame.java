package edu.java.contact.ver05;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import edu.java.contact.model.Contact;
import edu.java.contact.ver04.ContactDao;
import edu.java.contact.ver04.ContactDaoImpl;

public class ContactUpdateFrame extends JFrame {

	private JPanel contentPane;
	
	private JTextField textName;
	private JTextField textPhone;
	private JTextField textEmail;

	private Component parentComponent; // 업데이트 프레임을 보여주기 위한 부모 컴포넌트
	private int index; // 수정할 연락처의 인덱스
	private ContactDao dao;
	private ContactMain05 mainApp;
	
	/**
	 * Launch the application.
	 * @param frame 
	 */
	// Ctrl+Shift+O: 자동 import
	public static void showFrame(Component parentComponent, int index, ContactMain05 mainApp) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUpdateFrame frame = new ContactUpdateFrame(parentComponent, index, mainApp);
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
	public ContactUpdateFrame(Component parentComponent, int index, ContactMain05 mainApp) {
		this.parentComponent = parentComponent;
		this.index = index;
		this.dao = ContactDaoImpl.getInstance();
		this.mainApp = mainApp;
		initialize();
		loadContactData();
	}
	
	public void initialize() {
		setTitle("연락처 수정");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		int x = parentComponent.getX();
		int y = parentComponent.getY();
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
		textName.setColumns(10);
		textName.setBounds(140, 10, 282, 56);
		contentPane.add(textName);
		
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
		
		JButton btnUpdate = new JButton("수정 완료");
		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateContact();
			}
		});
		btnUpdate.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnUpdate.setBounds(12, 205, 150, 56);
		contentPane.add(btnUpdate);
		
		JButton btnCancel = new JButton("취소");
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnCancel.setBounds(174, 205, 116, 56);
		contentPane.add(btnCancel);
	} // end initialize()

	public void loadContactData() {
		// dao를 사용해서 인덱스 검색을 하고, 검색된 내용을 텍스트 필드에 채워줌.
		Contact c = dao.select(index);
		textName.setText(c.getName());
		textPhone.setText(c.getPhone());
		textEmail.setText(c.getEmail());
		
	} // end loadContactData()
	
	private void updateContact() {
		// 업데이트할 내용을 읽음.
		String name = textName.getText();
		String phone = textPhone.getText();
		String email = textEmail.getText();
		Contact c = new Contact(name, phone, email);
		
		// dao를 사용해서 연락처 정보를 수정.
		int result = dao.update(index, c);
		if (result == 1) {
			// 업데이트 창 닫기
			dispose();
			
			// 메인 화면에게 연락처 정보가 수정됐다고 알려줌.
//			mainApp.contactUpdateNotify(index, c);
			mainApp.contactUpdateNotify();
			
			// 성공 팝업은 메인 창 위에 띄우기
			JOptionPane.showMessageDialog(parentComponent, "연락처 정보가 수정됐습니다.");

		}
		
	} // end updateContact()
	
} // end class ContactUpdateFrame