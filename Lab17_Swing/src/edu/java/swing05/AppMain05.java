package edu.java.swing05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain05 {
	
	//이미지 파일들이 저장된 폴더와 파일이름을 문자열상수(배열)로 정의 
	private static final String[] IMAGES = {
			"image/image1.jpg",
			"image/image2.jpg",
			"image/image3.jpg",
			"image/image4.jpg",
			"image/image5.jpg",			
	};
		
	//현대 app window에서 보여지는 이미지의 인덱스를 저장하는 변수
	private int index;	//기본 값 0으로 초기화 
	
	private JFrame frame;
	private JLabel lblImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain05 window = new AppMain05();
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
	public AppMain05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//JLabel (Icon image) 생성자
		//다형성을 이용해서 Icon 타입 객체를 전달하는 곳에 ImageIcon 객체를 전달할 수 있음.
		//AppMain05 객체가 생성될 때 멤버변수 index는 기본값인 0으로 초기화 된다.
		lblImage = new JLabel(new ImageIcon(IMAGES[index]));
		lblImage.setBounds(12, 24, 360, 400);
		frame.getContentPane().add(lblImage);
		
		JButton btnPrev = new JButton("<< 이전");		
		btnPrev.addActionListener(new ActionListener() {
			@Override	
			public void actionPerformed(ActionEvent arg0) {
				showPrevImage();
			}
		});
		btnPrev.setFont(new Font("D2Coding", Font.BOLD, 30));
		btnPrev.setBounds(24, 453, 143, 79);
		frame.getContentPane().add(btnPrev);
		
		JButton btnNext = new JButton("다음 >>");
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showNextImage();
			}
		});
		btnNext.setFont(new Font("D2Coding", Font.BOLD, 30));
		btnNext.setBounds(218, 453, 143, 79);
		frame.getContentPane().add(btnNext);
	}

	private void showPrevImage() {
		//현재 인덱스가 0보다 크면
		if(index > 0) {
			index--;
			lblImage.setIcon(new ImageIcon(IMAGES[index]));
		} else {
			JOptionPane.showMessageDialog(frame, "첫 이미지 입니다.");
		}
		
	}

	private void showNextImage() {
		//현재 인덱스가 배열의 마지막 인덱스보다 작으면 
		if(index < IMAGES.length - 1) {
			index++;	//인덱스 증가
			//배열에서 증가된 인덱스로 파일 이름을 찾아서 이미지 아이콘을 설정
			lblImage.setIcon(new ImageIcon(IMAGES[index]));
		} else {
			JOptionPane.showMessageDialog(frame, "마지막 이미지 입니다.");
		}
		
	}
}
