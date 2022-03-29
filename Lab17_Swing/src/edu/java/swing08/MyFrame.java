package edu.java.swing08;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void showMyFrame() {
		MyFrame frame = new MyFrame();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		initialize();
	}

	public void initialize() {
		// 기본 닫기 동작 설정 - JFrame인 경우
		// 1) EXIT_ON_CLOSE: 닫기 버튼(x)을 클릭했을 때 프로그램 종료
		// 2) DISPOSE_ON_CLOSE: 현재 창만 종료
		// JDialog는 EXIT_ON_CLOSE를 사용할 수 없음!
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		contentPane.add(lblNewLabel_1, BorderLayout.WEST);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("New button");
		contentPane.add(btnNewButton_1, BorderLayout.EAST);
	}

}