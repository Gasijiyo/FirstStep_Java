package edu.java.swing07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class AppMain07 {

	private JFrame frame;
	private JTextField txtId;
	private JPasswordField pwField;
	private JTextArea textArea;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain07 window = new AppMain07();
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
	public AppMain07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("아이디");
		lblId.setFont(new Font("D2Coding", Font.BOLD, 20));
		lblId.setBounds(12, 10, 87, 52);
		frame.getContentPane().add(lblId);
		
		JLabel lblPw = new JLabel("비밀번호");
		lblPw.setBackground(Color.WHITE);
		lblPw.setFont(new Font("D2Coding", Font.BOLD, 20));
		lblPw.setBounds(12, 72, 87, 52);
		frame.getContentPane().add(lblPw);
		
		txtId = new JTextField();
		txtId.setBounds(111, 11, 161, 52);
		frame.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		pwField = new JPasswordField();
		pwField.setBounds(111, 74, 161, 49);
		frame.getContentPane().add(pwField);
		
		btnLogin = new JButton("Log-in");
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBackground(SystemColor.controlHighlight);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			showInfo();
			
			}
		});
		btnLogin.setFont(new Font("D2Coding", Font.BOLD, 20));
		btnLogin.setBounds(12, 144, 260, 41);
		frame.getContentPane().add(btnLogin);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("D2Coding", Font.BOLD, 20));
		textArea.setBackground(SystemColor.activeCaptionBorder);
		textArea.setBounds(12, 207, 260, 161);
		frame.getContentPane().add(textArea);
	}


	protected void showInfo() {
				
		String id = txtId.getText();
		char[] pw = pwField.getPassword();		
				
		StringBuffer info = new StringBuffer();
		info.append("아이디: ").append(id).append("\n")
		.append("비밀번호: ").append(pw);
		
		textArea.setText(info.toString());		
		resetTextField();
		
		if(id.equals("") || pw.length == 0) {
			JOptionPane.showMessageDialog(frame, "입력값이 없습니다.");
			textArea.setText("입력값이 없습니다.");
		}
		
	}

	private void resetTextField() {
		txtId.setText("");
		pwField.setText("");
		
	}
}
