package edu.java.swing09;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class AppMain09 {
	
	// JComboBox의 아이템으로 사용하기 위한 문자열 배열을 정의
	private static final String[] ITEMS = {"Facebook", "Instagram", "Youtube"};

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rbPrivate;
	private JRadioButton rbPackage;
	private JRadioButton rbProtected;
	private JRadioButton rbPublic;
	private JCheckBox cbAbstract;
	private JCheckBox cbStatic;
	private JCheckBox cbFinal;
	private JComboBox<String> comboBox;
	private JButton btnConfirm;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain09 window = new AppMain09();
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
	public AppMain09() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 765, 566);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		rbPrivate = new JRadioButton("private");
		rbPrivate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showRadioButtonStatus(e);
			}
		});
		buttonGroup.add(rbPrivate);
		rbPrivate.setFont(new Font("D2Coding", Font.PLAIN, 24));
		rbPrivate.setBounds(8, 6, 148, 49);
		frame.getContentPane().add(rbPrivate);
		
		rbPackage = new JRadioButton("package");
		rbPackage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showRadioButtonStatus(e);
			}
		});
		buttonGroup.add(rbPackage);
		rbPackage.setFont(new Font("D2Coding", Font.PLAIN, 24));
		rbPackage.setBounds(160, 6, 148, 49);
		frame.getContentPane().add(rbPackage);
		
		rbProtected = new JRadioButton("protected");
		rbProtected.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showRadioButtonStatus(e);
			}
		});
		buttonGroup.add(rbProtected);
		rbProtected.setFont(new Font("D2Coding", Font.PLAIN, 24));
		rbProtected.setBounds(312, 6, 148, 49);
		frame.getContentPane().add(rbProtected);
		
		rbPublic = new JRadioButton("public");
		rbPublic.setSelected(true);
		rbPublic.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showRadioButtonStatus(e);
			}
		});
		buttonGroup.add(rbPublic);
		rbPublic.setFont(new Font("D2Coding", Font.PLAIN, 24));
		rbPublic.setBounds(464, 6, 148, 49);
		frame.getContentPane().add(rbPublic);
		
		cbAbstract = new JCheckBox("abstract");
		cbAbstract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showCheckBoxStatus(e);
			}
		});
		cbAbstract.setFont(new Font("D2Coding", Font.PLAIN, 24));
		cbAbstract.setBounds(8, 78, 148, 49);
		frame.getContentPane().add(cbAbstract);
		
		cbStatic = new JCheckBox("static");
		cbStatic.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showCheckBoxStatus(e);
			}
		});
		cbStatic.setFont(new Font("D2Coding", Font.PLAIN, 24));
		cbStatic.setBounds(160, 78, 148, 49);
		frame.getContentPane().add(cbStatic);
		
		cbFinal = new JCheckBox("final");
		cbFinal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showCheckBoxStatus(e);
			}
		});
		cbFinal.setFont(new Font("D2Coding", Font.PLAIN, 24));
		cbFinal.setBounds(312, 78, 148, 49);
		frame.getContentPane().add(cbFinal);
		
		comboBox = new JComboBox<String>();
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 익명 지역 내부 클래스 안에서는 바깥(외부) 클래스의 멤버들을 사용할 수 있음.
				String selected = (String) comboBox.getSelectedItem();
				textArea.setText(selected + " 선택됨.");
			}
		});
		
		// ComboBoxModel: 콤보 박스에서 보여질 아이템들을 가지고 있는 객체
		DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<>(ITEMS);
		// 콤보박스에 ComboBoxModel 객체를 설정 -> 선택할 수 있는 리스트(아이템)가 설정됨.
		comboBox.setModel(comboModel);
		
		comboBox.setFont(new Font("D2Coding", Font.PLAIN, 24));
		comboBox.setBounds(8, 160, 148, 49);
		frame.getContentPane().add(comboBox);
		
		btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showInfo();
			}
		});
		btnConfirm.setFont(new Font("D2Coding", Font.PLAIN, 24));
		btnConfirm.setBounds(8, 240, 148, 49);
		frame.getContentPane().add(btnConfirm);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("D2Coding", Font.PLAIN, 24));
		textArea.setBounds(8, 326, 604, 191);
		frame.getContentPane().add(textArea);
	}

	private void showInfo() {
		StringBuffer buffer = new StringBuffer();

		Enumeration<AbstractButton> elements = buttonGroup.getElements();
		for (; elements.hasMoreElements(); ) {
			AbstractButton btn = elements.nextElement();
			if (btn.isSelected()) {
				btn.getText();
			}
		}
		
		// 라디오버튼들 중에서 선택된 상태
		if (rbPrivate.isSelected()) {
			buffer.append(rbPrivate.getText());
		} else if (rbPackage.isSelected()) {
			buffer.append(rbPackage.getText());
		} else if (rbProtected.isSelected()) {
			buffer.append(rbProtected.getText());
		} else if (rbPublic.isSelected()) {
			buffer.append(rbPublic.getText());
		}
		buffer.append(" 라디오버튼 선택.\n");
		
		// 체크박스 선택 상태
		if (cbAbstract.isSelected()) {
			buffer.append(cbAbstract.getText()).append(" 체크박스 선택.\n");
		}
		if (cbStatic.isSelected()) {
			buffer.append(cbStatic.getText()).append(" 체크박스 선택.\n");
		}
		if (cbFinal.isSelected()) {
			buffer.append(cbFinal.getText()).append(" 체크박스 선택.\n");
		}
		
		// 콤보 박스 선택 상태
		String item = (String) comboBox.getSelectedItem();
		buffer.append(item).append(" 콤보박스 아이템 선택.");
		
		
		textArea.setText(buffer.toString());
	}

	private void showCheckBoxStatus(ActionEvent e) {
		String cmd = e.getActionCommand();
		// instanceof 연산자를 사용하면 더 안전하게 casting할 수 있음.
		JCheckBox chkBox = (JCheckBox) e.getSource();
		boolean selected = chkBox.isSelected();
		
		textArea.setText(cmd + " 체크박스 선택여부: " + selected);
	}

	private void showRadioButtonStatus(ActionEvent e) {
		String cmd = e.getActionCommand();
//		Object source = e.getSource(); // 이벤트가 발생한 컴포넌트 객체
		textArea.setText(cmd + " 라디오버튼 선택됨");
	}
}
