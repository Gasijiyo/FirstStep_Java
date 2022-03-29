package edu.java.swing12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain12 {
	
	//테이블의 컬럼이름을 상수로 정의
	private static final String[] COLUMN_NAMES= {"국어", "영어", "수학", "총점","평균"};
	
	private JFrame frame;
	private JTextField txtKor;
	private JTextField txtEng;
	private JTextField txtMat;
	private JTable table;
	private JButton btnCon;
	private JButton btnDel;
	private JLabel lblKor;
	private JLabel lblEng;
	private JLabel lblMat;
	private JScrollPane scrollPane;
	
	private DefaultTableModel tableModel;	//테이블의 데이터(행row, 열column, 셀cell)를 관리(추가, 삭제)하는 클래스

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain12 window = new AppMain12();
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
	public AppMain12() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 397, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblKor = new JLabel("국어");
		lblKor.setFont(new Font("D2Coding", Font.BOLD, 16));
		lblKor.setBounds(12, 10, 61, 39);
		frame.getContentPane().add(lblKor);
		
		txtKor = new JTextField();
		txtKor.setBounds(85, 10, 110, 39);
		frame.getContentPane().add(txtKor);
		txtKor.setColumns(10);
		
		lblEng = new JLabel("영어");
		lblEng.setFont(new Font("D2Coding", Font.BOLD, 16));
		lblEng.setBounds(12, 59, 61, 39);
		frame.getContentPane().add(lblEng);
		
		txtEng = new JTextField();
		txtEng.setColumns(10);
		txtEng.setBounds(85, 59, 110, 39);
		frame.getContentPane().add(txtEng);
		
		lblMat = new JLabel("수학");
		lblMat.setFont(new Font("D2Coding", Font.BOLD, 16));
		lblMat.setBounds(12, 110, 61, 39);
		frame.getContentPane().add(lblMat);
		
		txtMat = new JTextField();
		txtMat.setColumns(10);
		txtMat.setBounds(85, 110, 110, 39);
		frame.getContentPane().add(txtMat);
		
		btnCon = new JButton("점수 입력");
		btnCon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				showScore();
			}
		});
		btnCon.setFont(new Font("D2Coding", Font.BOLD, 18));
		btnCon.setBounds(236, 10, 128, 57);
		frame.getContentPane().add(btnCon);
		
		btnDel = new JButton("행 삭제");
		btnDel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteRowFromTable();
			}
		});
		btnDel.setFont(new Font("D2Coding", Font.BOLD, 18));
		btnDel.setBounds(236, 92, 128, 57);
		frame.getContentPane().add(btnDel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 176, 357, 145);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		//테이블에 테이블 모델을 설정
		tableModel = new DefaultTableModel(null, COLUMN_NAMES);
		
		//테이블 모델에서 변화가 생겼을 때 이벤트를 처리하기 위한 이벤트 핸들러를 테이블 모델에 등록
		//(예: 셀의 내용 변경 )
		tableModel.addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent e) {
//				System.out.println("type: " + e.getType());	//테이블 모델 변화의 이벤트 타입(추가, 삭제, 수정)
//				System.out.println("first row: " + e.getFirstRow());	//이벤트가 발생한 행 (row) 인덱스
//				System.out.println("column: "+ e.getColumn());	//이벤트가 발생항 열(column) 인덱스
				
				handleTableChange(e);
				
			}
		});
		
		table.setModel(tableModel);
		
		table.setFont(new Font("D2Coding", Font.PLAIN, 15));
		scrollPane.setViewportView(table);
	}

	protected void handleTableChange(TableModelEvent e) {
		// 테이블 모델 변화 이벤트의 타입을 찾음.
		int eventType = e.getType();
		if(eventType != TableModelEvent.UPDATE) {
			//Update이벤트만 처리하고 그 이외의 다른이벤트는 처리하지 않음 
			return;
		}
		
		//이벤트가 발생한 row 인덱스
		int row = e.getFirstRow();	//업데이트 이벤트가 발생한 행 인덱스
		int col = e.getColumn();	//업데이트 이벤트가 발생한 열 인덱스
		if (col >= 0 && col <= 2) {	//국어, 영어, 수학 점수 변경이 일어났을 때
			//총점과 평균을 다시 계산하기 위해 국영수 점수를 테이블에서 읽음.
			int kor = Integer.parseInt(String.valueOf(tableModel.getValueAt(row, 0)));
			int eng = Integer.parseInt(String.valueOf(tableModel.getValueAt(row, 1)));
			int mat = Integer.parseInt(String.valueOf(tableModel.getValueAt(row, 2)));
			
			Score s = new Score(kor,eng,mat);
			//변경된 점수로 계산된 총점, 평균을 테이블 모델에 반영
			tableModel.setValueAt(s.total(), row, 3);
			tableModel.setValueAt(s.avg(), row, 4);
			
			String msg = row + "번 인덱스 행의 정보가 수정됐습니다";
			JOptionPane.showMessageDialog(frame, msg);
		}
		
	}

	protected void deleteRowFromTable() {
		// TODO Auto-generated method stub
		int index = table.getSelectedRow();
		if(index == -1) {
			JOptionPane.showMessageDialog(frame, "삭제할 열이 선택되지 않았습니다.");
			return;
		}
		
		int confirm = JOptionPane.showConfirmDialog(
				frame, 
				"정말 삭제하시겠습니까?", 
				"삭제 확인", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.WARNING_MESSAGE);
		if (confirm == JOptionPane.YES_OPTION) {
			tableModel.removeRow(index);
			
		}
	}

	private void showScore() {
		// 국영수 점수 읽음(문자열 -> 정수 변환)
		//Score 객체 생성 -> 총점, 평균 기능 가능
		//테이블 모델에 행row 추가
		//모든 텍스트필드 리셋
		int korean = 0;
		int english = 0;
		int math = 0;		
		try {
			korean = Integer.parseInt(txtKor.getText());
			english = Integer.parseInt(txtEng.getText());
			math = Integer.parseInt(txtMat.getText());
			
		} catch (Exception e) {
			String message = e.getMessage() + "\n입력한 내용은 정수가 아닙니다.";
			JOptionPane.showMessageDialog(frame, message, "입력 오류", JOptionPane.ERROR_MESSAGE);;
			return;
		} finally {
			clearAllTextFields();
		}
		
				
		Score score = new Score(korean, english, math);
		
		Object[] rowData = {
				score.getKor(),
				score.getEng(),
				score.getMat(),
				score.total(),
				score.avg()
		};		
		tableModel.addRow(rowData);
		
	}

	private void clearAllTextFields() {
		txtKor.setText("");
		txtEng.setText("");
		txtMat.setText("");		
	}
}
