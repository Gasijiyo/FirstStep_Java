package edu.java.swing01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;

public class AppMain01 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// 쓰레드를 EventQueue에 등록하고, Java Runtime에 의해서 (스케쥴링되서) 쓰레드가 실행
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					AppMain01 window = new AppMain01();
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
	public AppMain01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblHello = new JLabel("Hello, Swing!");
		lblHello.setFont(new Font("D2Coding", Font.BOLD, 32));
		frame.getContentPane().add(lblHello, BorderLayout.CENTER);
	}

}