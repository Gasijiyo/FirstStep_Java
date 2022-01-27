package edu.java.inner04;

public class Button {
	//변수 선언 용 static 내부 인터페이스 (중첩 인터페이스)
	public static interface OnClickListener {
		void onClick();	//추상 메소드(abstract method) -> body 없음
	} 
	
	//멤버변수
	private String btnName;
	private OnClickListener listener;
	
	//생성자
	public Button(String btnName) {
		this.btnName = btnName;
	}
	
	//메소드
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void click() {
		System.out.print(btnName + " 버튼 : ");
		listener.onClick();
	}
	
}
