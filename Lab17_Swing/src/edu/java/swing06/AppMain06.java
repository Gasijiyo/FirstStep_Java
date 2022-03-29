package edu.java.swing06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain06 {

	private JFrame frame;
	private JTextField tName;
	private JTextField tPhone;
	private JTextField tEmail;
	
//	private String name;
//	private String phone;
//	private String email;
	private JLabel lblName;
	private JLabel lblPhone;
	private JLabel lblEmail;
	private JButton btnOk;
	private JTextArea tResult;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain06 window = new AppMain06();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppMain06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblName = new JLabel("이름");
		lblName.setBounds(12, 9, 97, 34);
		frame.getContentPane().add(lblName);
		
		lblPhone = new JLabel("전화번호");
		lblPhone.setBounds(12, 53, 97, 34);
		frame.getContentPane().add(lblPhone);
		
		lblEmail = new JLabel("이메일");
		lblEmail.setBounds(12, 97, 97, 34);
		frame.getContentPane().add(lblEmail);
		
		tName = new JTextField();
		tName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		tName.setBounds(157, 10, 210, 34);
		frame.getContentPane().add(tName);
		tName.setColumns(10);
		
		tPhone = new JTextField();
		tPhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		tPhone.setColumns(10);
		tPhone.setBounds(157, 54, 210, 34);
		frame.getContentPane().add(tPhone);
		
		tEmail = new JTextField();
		tEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		tEmail.setColumns(10);
		tEmail.setBounds(157, 98, 210, 34);
		frame.getContentPane().add(tEmail);
		
		btnOk = new JButton("입력");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//			String result = "이름: " + tName.getText() + "\n" 
//							+ "전화번호: " + tPhone.getText() + "\n" 
//							+ "이메일: " + tEmail.getText();
//			tResult.setText(result);
			
			showInfo();
			
			}
		});
		btnOk.setBounds(12, 130, 114, 34);
		frame.getContentPane().add(btnOk);
		
		tResult = new JTextArea();
		tResult.setBounds(12, 174, 392, 77);
		frame.getContentPane().add(tResult);
	}

	private void showInfo() {
		// 3개의 JTextField 에서 각각의 값을 읽음.
		String name = tName.getText();
		String phone = tPhone.getText();
		String email = tEmail.getText();
		
//		String result = "이름: " + tName.getText() + "\n" 
//				+ "전화번호: " + tPhone.getText() + "\n" 
//				+ "이메일: " + tEmail.getText();
//		
//		tResult.setText(result);
		
		StringBuffer result = new StringBuffer();	//StringBuffer 객체생성, 여러 줄 텍스트 입력 시 사용
		result.append("이름: ").append(name).append("\n")
		.append("전화번호: ").append(phone).append("\n")
		.append("이메일: ").append(email);
		// '+' 보다 속도가 빠르다, 다량의 출력 시 유용
		tResult.setText(result.toString());	//result가 String이 아니기 때문에 toString 필요
		
		clearAllTextField();		
	}

	private void clearAllTextField() {
		tName.setText("");
		tPhone.setText("");
		tEmail.setText("");
		
	}
	
//	public void contactResult (){
//		String result = "이름: " + name + "\n" + "전화번호: " + phone + "\n" + "이메일: " + email; 
//	}
}
