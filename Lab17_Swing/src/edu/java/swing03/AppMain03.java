package edu.java.swing03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain03 {

	private JFrame frame;
	private JTextField textNumber1;
	private JTextField textNumber2;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnMultiply;
	private JButton btnDivide;
	private JTextField textResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override // 쓰레드가 시작될 때 Java Runtime에 의해서 자동으로 호출되는 메서드
			public void run() {
				try {
					AppMain03 window = new AppMain03();
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
	public AppMain03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 727, 567);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Number 1");
		label1.setFont(new Font("D2Coding", Font.BOLD, 32));
		label1.setBounds(12, 10, 217, 64);
		frame.getContentPane().add(label1);
		
		textNumber1 = new JTextField();
		textNumber1.setFont(new Font("D2Coding", Font.PLAIN, 32));
		textNumber1.setBounds(241, 10, 447, 64);
		frame.getContentPane().add(textNumber1);
		
		JLabel label2 = new JLabel("Number 2");
		label2.setFont(new Font("D2Coding", Font.BOLD, 32));
		label2.setBounds(12, 84, 217, 64);
		frame.getContentPane().add(label2);
		
		textNumber2 = new JTextField();
		textNumber2.setFont(new Font("D2Coding", Font.PLAIN, 32));
		textNumber2.setBounds(241, 84, 447, 64);
		frame.getContentPane().add(textNumber2);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// + 버튼이 할 일을 작성
				// textNumber1, textNumber2에 입력된 문자열을 숫자(double)로 변환.
				// 두 숫자의 덧셈 결과를 textResult에 씀.
				try {
					String s1 = textNumber1.getText();
					double x = Double.parseDouble(s1);
					double y = Double.parseDouble(textNumber2.getText());
					double result = x + y;
					textResult.setText(x + " + " + y + " = " + result);
					
				} catch (NumberFormatException ex) {
					textResult.setText("Number1 또는 Number2는 숫자로 입력하세요!");
				}
			}
		});
		btnPlus.setFont(new Font("D2Coding", Font.BOLD, 32));
		btnPlus.setBounds(12, 158, 160, 64);
		frame.getContentPane().add(btnPlus);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// - 버튼이 할 일을 작성
				try {
					double x = Double.parseDouble(textNumber1.getText());
					double y = Double.parseDouble(textNumber2.getText());
					double result = x - y;
					String resultMessage = x + " - " + y + " = " + result;
					textResult.setText(resultMessage);
					
				} catch (NumberFormatException ex) {
					textResult.setText("Number1 또는 Number2는 숫자로 입력하세요!");
				}
			}
		});
		btnMinus.setFont(new Font("D2Coding", Font.BOLD, 32));
		btnMinus.setBounds(184, 158, 160, 64);
		frame.getContentPane().add(btnMinus);
		
		btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 파라미터 ActionEvent e: 이벤트가 발생시킨 객체에 대한 정보를 가지고 있는 클래스.
				// actionPerformed 메서드에 전달된 argument e를 메서드에 전달.
				performCalculation(e);
			}
		});
		btnMultiply.setFont(new Font("D2Coding", Font.BOLD, 32));
		btnMultiply.setBounds(356, 158, 160, 64);
		frame.getContentPane().add(btnMultiply);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				performCalculation(e);
			}
		});
		btnDivide.setFont(new Font("D2Coding", Font.BOLD, 32));
		btnDivide.setBounds(528, 158, 160, 64);
		frame.getContentPane().add(btnDivide);
		
		textResult = new JTextField();
		textResult.setFont(new Font("D2Coding", Font.PLAIN, 32));
		textResult.setBounds(12, 232, 676, 64);
		frame.getContentPane().add(textResult);
		textResult.setColumns(10);
	} // end initialize()

	// 바깥 클래스(outer class, enclosing class)에서 정의한 메서드는 inner class에서도 사용 가능!
	private void performCalculation(ActionEvent e) {
		try {
			// JTextField에 있는 문자열을 읽어서 숫자로 변환
			double x = Double.parseDouble(textNumber1.getText());
			double y = Double.parseDouble(textNumber2.getText());
			
			// 이벤트가 발생한 버튼에 따라서 서로 다른 계산을 수행하고 결과를 문자열로 작성
			Object source = e.getSource();
			String resultMessage = "";
			if (source == btnMultiply) {
				resultMessage = x + " x " + y + " = " + (x * y);
			} else if (source == btnDivide) {
				resultMessage = x + " / " + y + " = " + (x / y);
			}
			
			// 결과 메시지를 JTextField에 출력
			textResult.setText(resultMessage);
			
		} catch (NumberFormatException ex) {
			textResult.setText("Number 1 또는 Number 2는 숫자로 입력해야 합니다.");
		}
		
	}
	
} // end class AppMain03